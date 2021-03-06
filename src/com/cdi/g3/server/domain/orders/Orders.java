/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.orders;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.server.domain.DomainObject;
import com.cdi.g3.server.domain.customers.Adress;
import com.cdi.g3.server.domain.customers.Customer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;
/**
 *
 * @author youssef
 */
public class Orders extends DomainObject implements Serializable{
    
    // ======================================
    // =             Attributes             =
    // ======================================
    
    private String idOrders;    
    private Adress adressShipping ;    
    private Customer customer;
    private Date dateOrder;
    private InfoStatus nameInfoStatus;
    private Adress adressBilling ;
    private PachageShipper  pachageShipper;
    private String internalNumOrder;
    private String paymentSystemOrder;
    private String ipOrder;
    private Date datepachageShipperOrder;
    private Collection listOrderLines = new ArrayList();;
    
    // ======================================
    // =            Constructors            =
    // ======================================
     public Orders() {
         nameInfoStatus = new InfoStatus("processing");
    }

    public Orders(final String id) {
       idOrders = id;
       nameInfoStatus = new InfoStatus("processing");
    } 
    public Orders(final String id, Adress adressShipping, Customer customer, Date dateOrder, InfoStatus nameInfoStatus){
		super();
		idOrders = id;
		this.adressShipping = adressShipping;
		this.customer = customer;
		this.dateOrder = dateOrder;
		this.nameInfoStatus = nameInfoStatus;
	} 
     public Orders(Adress adressShipping, Customer customer, Date dateOrder, InfoStatus nameInfoStatus){
		super();		
		this.adressShipping = adressShipping;
		this.customer = customer;
		this.dateOrder = dateOrder;
		this.nameInfoStatus = nameInfoStatus;
	} 
    
    
    
    
    // ======================================
    // =           Business methods         =
    // ======================================

    public void checkData() throws CheckException {
        if (customer == null || "".equals(customer))
            throw new CheckException("Invalid orders, customer must be not null ");
        if (listOrderLines == null || "".equals(listOrderLines))
            throw new CheckException("Invalid orders,listOrderLines must be not null  ");
    }

   // ======================================
    // =         Getters and Setters        =
    // ======================================
     
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
    public Adress getAdressShipping() {
        return adressShipping;
    }

    public void setAdressShipping(Adress adressShipping) {
        this.adressShipping = adressShipping;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public InfoStatus getNameInfoStatus() {
        return nameInfoStatus;
    }

    public void setNameInfoStatus(InfoStatus nameInfoStatus) {
        this.nameInfoStatus = nameInfoStatus;
    }

    public Adress getAdressBilling() {
        return adressBilling;
    }

    public void setAdressBilling(Adress adressBilling) {
        this.adressBilling = adressBilling;
    }

    public PachageShipper getPachageShipper() {
        return pachageShipper;
    }

    public void setPachageShipper(PachageShipper pachageShipper) {
        this.pachageShipper = pachageShipper;
    }

    public String getInternalNumOrder() {
        return internalNumOrder;
    }

    public void setInternalNumOrder(String internalNumOrder) {
        this.internalNumOrder = internalNumOrder;
    }

    public String getPaymentSystemOrder() {
        return paymentSystemOrder;
    }

    public void setPaymentSystemOrder(String paymentSystemOrder) {
        this.paymentSystemOrder = paymentSystemOrder;
    }

    public String getIpOrder() {
        return ipOrder;
    }

    public void setIpOrder(String ipOrder) {
        this.ipOrder = ipOrder;
    }

    public Date getDatepachageShipperOrder() {
        return datepachageShipperOrder;
    }

    public void setDatepachageShipperOrder(Date datepachageShipperOrder) {
        this.datepachageShipperOrder = datepachageShipperOrder;
    }
    public Collection getListOrderLines() {
        return listOrderLines;
    }

    public void setListOrderLines(Collection listOrderLines) {
        this.listOrderLines = listOrderLines;
    }

    @Override
    public String toString() {
        return idOrders + " " + customer + " " + internalNumOrder +" "+ adressBilling;
    }
    
     public Vector getVector() {
        Vector v = new Vector();
        v.add(this);        
        v.add(this.internalNumOrder);
         v.add(this.dateOrder);
        v.add(this.customer.getLastNameCustomer());
        v.add(this.customer.getFirstNameCustomer());
        v.add(this.adressShipping.getId());
        v.add(this.pachageShipper.getShipper().getId());
        v.add(this.datepachageShipperOrder);
        v.add(this.ipOrder);
        v.add(this.nameInfoStatus.getId());
        return v;
    }
    
    
}
