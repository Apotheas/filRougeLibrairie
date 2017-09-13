
package com.cdi.g3.server.domain.customers;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.server.domain.DomainObject;
import com.cdi.g3.server.domain.orders.Orders;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
/**
 * This class represents a users for the librairie company.
 */
public final class Customer extends DomainObject implements Serializable {

    // ======================================
    // =             Attributes             =
    // ======================================
   
    
    private String loginCustomer;
    private String lastNameCustomer;
    private String firstNameCustomer;
    private String emailCustomer;
    private String passwordCustomer;
    private String nameCompanyCustomer;
    private String commentCustomer;
    private String statusCustomer;
    private  Collection<Adress>  listAddressShipping = new ArrayList();
    private  Collection<Adress>  listAddressBilling = new ArrayList();
    private  Collection<Appreciation>  listAppreciation = new ArrayList();
    private  Collection<Orders>  listOrders = new ArrayList();

    // ======================================
    // =            Constructors            =
    // ======================================
    public Customer() {
    }

    public Customer(final String id) {
        setId(id);
    }

    public Customer(final String id, final String lastNameCustomer, final String firstNameCustomer, 
            final String emailCustomer, final String passwordCustomer) {
        setId(id);
        setFirstNameCustomer(firstNameCustomer);
        setLastNameCustomer(lastNameCustomer);
        setEmailCustomer(emailCustomer);
        setPasswordCustomer(passwordCustomer);
    }

    // ======================================
    // =           Business methods         =
    // ======================================
    /**
     * This method checks the integrity of the object data.
     *
     * @throws CheckException if data is invalid
     */
    public void checkData() throws CheckException {
        if (getLoginCustomer() == null || "".equals(getLoginCustomer()))
            throw new CheckException("Invalid customer login");
        if (getEmailCustomer() == null || "".equals(getEmailCustomer()))
            throw new CheckException("Invalid customer email");
        if (getLastNameCustomer() == null || "".equals(getLastNameCustomer()))
            throw new CheckException("Invalid customer last name");
        if (getFirstNameCustomer() == null || "".equals(getFirstNameCustomer()))
            throw new CheckException("Invalid customer first name");
    }
    
    public void matchPassword(String password) throws CheckException {
        if (password == null || "".equals(password))
            throw new CheckException("Invalid password");

        // The password entered by the customer is not the same stored in database
        if (!password.equals(this.getPasswordCustomer()))
            throw new CheckException("Password doesn't match");
    }

    // ======================================
    // =         Getters and Setters        =
    // ======================================
  
     @Override
    public String getId() {
        return loginCustomer;
    }
    @Override
    public void setId(String loginCustomer) {
        this.loginCustomer = loginCustomer;
    }

    public String getLoginCustomer() {
        return loginCustomer;
    }

    public void setLoginCustomer(String loginCustomer) {
        this.loginCustomer = loginCustomer;
    }

    public String getLastNameCustomer() {
        return lastNameCustomer;
    }

    public void setLastNameCustomer(String lastNameCustomer) {
        this.lastNameCustomer = lastNameCustomer;
    }

    public String getFirstNameCustomer() {
        return firstNameCustomer;
    }

    public void setFirstNameCustomer(String firstNameCustomer) {
        this.firstNameCustomer = firstNameCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getPasswordCustomer() {
        return passwordCustomer;
    }

    public void setPasswordCustomer(String passwordCustomer) {
        this.passwordCustomer = passwordCustomer;
    }

    public String getNameCompanyCustomer() {
        return nameCompanyCustomer;
    }

    public void setNameCompanyCustomer(String nameCompanyCustomer) {
        this.nameCompanyCustomer = nameCompanyCustomer;
    }

    public String getCommentCustomer() {
        return commentCustomer;
    }

    public void setCommentCustomer(String commentCustomer) {
        this.commentCustomer = commentCustomer;
    }
    
     public void setlistAddressBilling(final Collection listAddressBilling) {
       this.listAddressBilling = listAddressBilling;    }
     
     public void setlistAddressShipping(final Collection listAddressShipping) {
       this.listAddressShipping = listAddressShipping;
    }

    public String getStatusCustomer() {
        return statusCustomer;
    }

    public void setStatusCustomer(String statusCustomer) {
        this.statusCustomer = statusCustomer;    
    }

    public Collection getListAddressShipping() {
        return listAddressShipping;
    }

    public Collection getListAddressBilling() {
        return listAddressBilling;
    }

    public Collection getListAppreciation() {
        return listAppreciation;
    }

    public Collection getListOrders() {
        return listOrders;
    }
    
    
    

    @Override
    public String toString() {
        return  loginCustomer +"  "+  lastNameCustomer  ;
    }
}
    
    
    
    

   
 
    


