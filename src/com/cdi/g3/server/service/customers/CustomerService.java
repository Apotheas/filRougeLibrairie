package com.cdi.g3.server.service.customers;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.common.exception.CreateException;
import com.cdi.g3.common.exception.FinderException;
import com.cdi.g3.common.exception.ObjectNotFoundException;
import com.cdi.g3.common.exception.RemoveException;
import com.cdi.g3.common.exception.UpdateException;
import com.cdi.g3.common.logging.Trace;
import com.cdi.g3.server.domain.customers.Adress;
import com.cdi.g3.server.domain.customers.AdressDAO;
import com.cdi.g3.server.domain.customers.Appreciation;
import com.cdi.g3.server.domain.customers.AppreciationDAO;
import com.cdi.g3.server.domain.customers.Customer;
import com.cdi.g3.server.domain.customers.CustomerDAO;
import com.cdi.g3.server.domain.orders.Orders;
import com.cdi.g3.server.domain.orders.OrdersDAO;
import com.cdi.g3.server.service.AbstractService;
import java.util.Collection;
import java.util.Iterator;


/**
 * This class is a facade for all customer services.
 */
public final class CustomerService extends AbstractService {

    // ======================================
    // = Attributes =
    // ======================================
    private static final CustomerDAO _daoCustomer = new CustomerDAO();
    private static final AdressDAO _daoAdress = new AdressDAO();
    private static final AppreciationDAO _daoAppreciation = new AppreciationDAO();
    private static final OrdersDAO _daoOrder = new OrdersDAO();

    // ======================================
    // = Constructors =
    // ======================================
    public CustomerService() {

    }

    // ======================================
    // = Business methods =
    // ======================================
    public Customer createCustomer(final Customer customer) throws CreateException, CheckException {
        final String mname = "createCustomer";
        Trace.entering(_cname, mname, customer);

        if (customer == null) {
            throw new CreateException("Customer object is null");
        }

        customer.checkData();
        //checkId( customer.getId() );
        checkId(customer.getId());

        // Creates all the adressBilling linked with the customer
        for (Iterator iterator = customer.getListAddressBilling().iterator(); iterator.hasNext();) {
            final Adress adressBilling = (Adress) iterator.next();
            adressBilling.checkData();            
            adressBilling.setCustomerBillAdress(customer);
            _daoAdress.insert(adressBilling);
        }
        
        // Creates all the adressShipping linked with the customer
        for (Iterator iterator = customer.getListAddressShipping().iterator(); iterator.hasNext();) {
            final Adress adressShipping = (Adress) iterator.next();
            adressShipping.checkData();  
            adressShipping.setCustomerShipAdress(customer);
            _daoAdress.insert(adressShipping);
        }
//        
//        // Creates all the appreciation linked with the customer
//        for (Iterator iterator = customer.getListAppreciation().iterator(); iterator.hasNext();) {
//            final Appreciation appreciation = (Appreciation) iterator.next();
//            appreciation.checkData();  
//            appreciation.setLoginCustomerAppreciate(customer);
//            _daoAppreciation.insert(appreciation);
//        }
//        
//        // Creates all the order linked with the customer
//        for (Iterator iterator = customer.getListOrders().iterator(); iterator.hasNext();) {
//            final Orders order = (Orders) iterator.next();
//            order.checkData();  
//            order.setCustomer(customer);
//            _daoOrder.insert(order);
//        }
//        
        // Creates the object
        _daoCustomer.insert(customer);

        Trace.exiting(_cname, mname, customer);
        return customer;
    }

    public Customer findCustomer(final String customerId) throws FinderException, CheckException {
        final String mname = "findCustomer";
        Trace.entering(_cname, mname, customerId);

        checkId(customerId);
        // Finds the object
        final Customer customer = (Customer) _daoCustomer.findByPrimaryKey(customerId);
        _daoAdress.findAllByChamp("loginCustomerShipAdress", customer.getLoginCustomer());
        
        Trace.exiting(_cname, mname, customer);
        return customer;        
    }
    

    public void deleteCustomer(final String customerId) throws RemoveException, CheckException {
        final String mname = "deleteCustomer";
        Trace.entering(_cname, mname, customerId);

        checkId(customerId);

        // Checks if the object exists
        try {
            _daoCustomer.findByPrimaryKey(customerId);
        } catch (FinderException e) {
            throw new RemoveException("Customer must exist to be deleted");
        }

        // Deletes the object
        try {
            _daoCustomer.remove(customerId);
        } catch (ObjectNotFoundException e) {
            throw new RemoveException("Customer must exist to be deleted");
        }
    }

    public void updateCustomer(Customer customer) throws UpdateException, CheckException {
        final String mname = "updateCustomer";
        Trace.entering(_cname, mname, customer);

        if (customer == null) {
            throw new UpdateException("Customer object is null");
        }

        checkId(customer.getId());

        final Customer customerFinded;

        // Checks if the object exists
        try {
            customerFinded = (Customer) _daoCustomer.findByPrimaryKey(customer.getId());
        } catch (FinderException e) {
            throw new UpdateException("Customer must exist to be updated");
        }

        customer.checkData();
        customer = setCustomer(customer, customerFinded);

        // Updates the object
        try {
            _daoCustomer.update(customerFinded);
        } catch (ObjectNotFoundException e) {
            throw new UpdateException("Customer must exist to be updated");
        }
    }

    public Collection findCustomers() throws FinderException {
        final String mname = "findCustomers";
        Trace.entering(_cname, mname);

        // Finds all the objects
        final Collection customers = _daoCustomer.findAll();

        Trace.exiting(_cname, mname, new Integer(customers.size()));
        return customers;
    }

    // ======================================
    // = Private Methods =
    // ======================================
    private Customer setCustomer(Customer customer, Customer customerFinded) {
        return null;
    }

    /**
     * This method returns a unique identifer generated by the system.
     *
     * @return a unique identifer
     */
    public final String getUniqueId() {
        return _daoCustomer.getUniqueId();
    }

}
