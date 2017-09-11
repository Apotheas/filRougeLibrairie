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
import com.cdi.g3.server.domain.customers.Customer;
import com.cdi.g3.server.domain.customers.CustomerDAO;
import com.cdi.g3.server.domain.orders.OrderLine;
import com.cdi.g3.server.domain.orders.OrderLineDAO;
import com.cdi.g3.server.domain.orders.Orders;
import com.cdi.g3.server.domain.orders.OrdersDAO;
import com.cdi.g3.server.service.AbstractService;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author youssef
 */
public class OrderService extends AbstractService {

    private static final CustomerDAO _customerDAO = new CustomerDAO();
    private static final OrdersDAO _orderDAO = new OrdersDAO();
    private static final OrderLineDAO _orderLineDAO = new OrderLineDAO();

    // ======================================
    // =           Business methods         =
    // ======================================
    public Orders createOrder(final Orders order) throws CreateException, CheckException {
        if (order == null) {
            throw new CreateException("Order object is null");
        }

        if (order.getCustomer() == null) {
            throw new CheckException("Invalid Customer");
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

        // Retreives the data for all the order lines
        final Collection listOrderLines = _orderLineDAO.findAll(orderId);
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
    
    
    
}
