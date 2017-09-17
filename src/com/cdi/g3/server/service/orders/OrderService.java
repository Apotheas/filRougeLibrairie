/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.service.orders;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.common.exception.CreateException;
import com.cdi.g3.common.exception.FinderException;
import com.cdi.g3.common.exception.ObjectNotFoundException;
import com.cdi.g3.common.exception.RemoveException;
import com.cdi.g3.common.logging.Trace;
import com.cdi.g3.server.domain.catalog.Book;
import com.cdi.g3.server.domain.catalog.BookDAO;
import com.cdi.g3.server.domain.customers.Adress;
import com.cdi.g3.server.domain.customers.AdressDAO;
import com.cdi.g3.server.domain.customers.Customer;
import com.cdi.g3.server.domain.customers.CustomerDAO;
import com.cdi.g3.server.domain.orders.InfoStatus;
import com.cdi.g3.server.domain.orders.OrderLine;
import com.cdi.g3.server.domain.orders.OrderLineDAO;
import com.cdi.g3.server.domain.orders.Orders;
import com.cdi.g3.server.domain.orders.OrdersDAO;
import com.cdi.g3.server.service.AbstractService;
import com.cdi.g3.server.service.customers.AdressService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author youssef
 */
public class OrderService extends AbstractService {

    private static final CustomerDAO _customerDAO = new CustomerDAO();
    private static final OrdersDAO _orderDAO = new OrdersDAO();
    private static final OrderLineDAO _orderLineDAO = new OrderLineDAO();
    private static final BookDAO _bookDAO = new BookDAO();
    private static final AdressDAO _adresskDAO = new AdressDAO();
    private static final AdressService _adressService = new AdressService();
    

    // ======================================
    // =           Business methods         =
    // ======================================
    public String createOrder(final String customerId, Map shoppingCart) throws CreateException, CheckException, FinderException {
        final String mname = "createOrder";
        Trace.entering(_cname, mname, customerId);
        
        // Finds the customer
        Customer customer = null;
        try {
            customer = (Customer)_customerDAO.findByPrimaryKey(customerId);
        } catch (FinderException e) {
            throw new CreateException("Customer must exist to create an order");
        }
        
        // Creates a new order
        final Orders order = new Orders( _adressService.findAdressShipping(customerId), customer,
                                        new Date(), new InfoStatus("Processing")); 
        order.setAdressBilling(_adressService.findAdressBilling(customerId));
        
        // Checks if the credit card is valid
//        creditCardServiceLocal.verifyCreditCard(order.getCreditCard());
        
        // Creates the order
        _orderDAO.insert(order);
        
        // Creates all the orderLines linked with the order
        Iterator iterator = shoppingCart.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry keyValue = (Map.Entry)iterator.next();
            String itemId = (String)keyValue.getKey();
            int quantity = (Integer)keyValue.getValue();
            // Finds the item
            Book book = null;
            try {
                book = (Book)_bookDAO.findByPrimaryKey(itemId);
            } catch (FinderException e) {
                throw new CreateException("Book must exist to create an order line");
            }
            // Creates OrderLine
            final OrderLine orderLine = new OrderLine(quantity, book.getUnitCostBook(), order, book);
            
            // Creates the order line
            _orderLineDAO.insert(orderLine);
        }
         
        return order.getId();
    }
    
    
    
    
    public Orders createOrder(final Orders order) throws CreateException, CheckException {
        final String mname = "createOrder";
        Trace.entering(_cname, mname, order);
        
        if (order == null) {
            throw new CreateException("Order object is null");
        }

        if (order.getCustomer() == null) {
            throw new CheckException("Invalid Customer for Order");
        }

        if (order.getListOrderLines() == null || order.getListOrderLines().size() < 0) {
            throw new CheckException("There are no order lines");
        }

        // Finds the customer
        try {
            _customerDAO.findByPrimaryKey(order.getCustomer().getId());
        } catch (FinderException e) {
            throw new CreateException("Customer must exist to create an order");
        }

        // Creates the object
        _orderDAO.insert(order);

        // Creates all the orderLines linked with the order
        for (Iterator iterator = order.getListOrderLines().iterator(); iterator.hasNext();) {
            final OrderLine orderLine = (OrderLine) iterator.next();
            orderLine.setOrder(order);
            _orderLineDAO.insert(orderLine);
        }

        return order;
    }
    
    public Orders findOrder(final String orderId) throws FinderException, CheckException {
        // Finds the object
        final Orders order = (Orders) _orderDAO.findByPrimaryKey(orderId);

        // Retreives the data for the customer and sets it
        Customer customer = (Customer) _customerDAO.findByPrimaryKey(order.getCustomer().getId());
        order.setCustomer(customer);
        
        // Retreives the data for the AdressBilling and sets it
        Adress adressBilling = (Adress) _adresskDAO.findByPrimaryKey(order.getAdressBilling().getId());
        order.setAdressBilling(adressBilling);
        
        // Retreives the data for the AdressShipping and sets it
        Adress adressShipping = (Adress) _adresskDAO.findByPrimaryKey(order.getAdressShipping().getId());
        order.setAdressShipping(adressShipping);
        

        // Retreives the data for all the order lines
        final Collection listOrderLines = _orderLineDAO.findAllByChamp("idOrder", orderId);
        order.setListOrderLines(listOrderLines);

        return order;
    }
    
    
    public void deleteOrder(final String orderId) throws RemoveException, CheckException {
        final Orders order = new Orders();

        // Checks if the object exists
        try {
            _orderDAO.findByPrimaryKey(orderId);
        } catch (FinderException e) {
            throw new RemoveException("Order must exist to be deleted");
        }

        // Deletes the object
        // Deletes the object
        try {
        	_orderDAO.remove(orderId);
        } catch (ObjectNotFoundException e) {
            throw new RemoveException("Order must exist to be deleted");
        }
    }
    
    
    public Collection findOrders() throws FinderException {
        final String mname = "findOrderss";
        Trace.entering(_cname, mname);
        // Finds all the objects
        final Collection orders = _orderDAO.findAll();

        Trace.exiting(_cname, mname, new Integer(orders.size()));
        return orders;
    }
    
    
    
}
