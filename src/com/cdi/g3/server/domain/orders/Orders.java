/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.orders;

import com.cdi.g3.server.domain.DomainObject;
import com.cdi.g3.server.domain.customers.Customer;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author youssef
 */
public class Orders extends DomainObject implements Serializable{
    
    
    private String idOrders;
    private Customer customer;
    private Collection listOrderLines;
    
     
     
     
     
     public Orders() {
    }

    public Orders(final String id) {
       idOrders = id;
    } 
     
     
     @Override
    public String getId() {
        return idOrders;
    }
    @Override
    public void setId(String idOrders) {
        this.idOrders = idOrders;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Collection getListOrderLines() {
        return listOrderLines;
    }

    public void setListOrderLines(Collection listOrderLines) {
        this.listOrderLines = listOrderLines;
    }
    
    
    
    
}
