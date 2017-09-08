
package com.cdi.g3.server.domain.customers;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.server.domain.CreditCard;
import com.cdi.g3.server.domain.DomainObject;
import java.io.Serializable;
/**
 * This class represents a users for the librairie company.
 */
public final class Customer extends DomainObject implements Serializable {

    // ======================================
    // =             Attributes             =
    // ======================================
    private String loginCustomer;
    private String firstname;
    private String lastname;
    private String telephone;
    private String email;
    private final Adress address = new Adress();
    private final CreditCard creditCard = new CreditCard();

    // ======================================
    // =            Constructors            =
    // ======================================
    public Customer() {
    }

    public Customer(final String id) {
        setId(id);
    }

    public Customer(final String id, final String firstname, final String lastname) {
        setId(id);
        setFirstname(firstname);
        setLastname(lastname);
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
        if (getFirstname() == null || "".equals(getFirstname()))
            throw new CheckException("Invalid customer first name");
        if (getLastname() == null || "".equals(getLastname()))
            throw new CheckException("Invalid customer last name");
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
    
    
    
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
       this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(final String telephone) {
       this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getStreet1() {
        return address.getStreet1();
    }

    public void setStreet1(final String street1) {
       this.address.setStreet1(street1);
    }

    public String getStreet2() {
        return address.getStreet2();
    }

    public void setStreet2(final String street2) {
       this.address.setStreet2(street2);
    }

    public String getCity() {
        return address.getCity();
    }

    public void setCity(final String city) {
       this.address.setCity(city);
    }

    public String getState() {
        return address.getState();
    }

    public void setState(final String state) {
       this.address.setState(state);
    }

    public String getZipcode() {
        return address.getZipcode();
    }

    public void setZipcode(final String zipcode) {
       this.address.setZipcode(zipcode);
    }

    public String getCountry() {
        return address.getCountry();
    }

    public void setCountry(final String country) {
        this.address.setCountry(country);
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public String getCreditCardNumber() {
        return this.creditCard.getCreditCardNumber();
    }

    public void setCreditCardNumber(final String creditCardNumber) {
        creditCard.setCreditCardNumber(creditCardNumber);
    }

    public String getCreditCardType() {
        return this.creditCard.getCreditCardType();
    }

    public void setCreditCardType(final String creditCardType) {
        creditCard.setCreditCardType(creditCardType);
    }

    public String getCreditCardExpiryDate() {
        return this.creditCard.getCreditCardExpiryDate();
    }

    public void setCreditCardExpiryDate(final String creditCardExpiryDate) {
        creditCard.setCreditCardExpiryDate(creditCardExpiryDate);
    }

    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("Customer{");
        buf.append("id=").append(getId());
        buf.append(",firstname=").append(getFirstname());
        buf.append(",lastname=").append(getLastname());
        buf.append(",telephone=").append(getTelephone());
        buf.append(",email=").append(getEmail());
        buf.append(",street1=").append(getStreet1());
        buf.append(",street2=").append(getStreet2());
        buf.append(",city=").append(getCity());
        buf.append(",state=").append(getState());
        buf.append(",zipcode=").append(getZipcode());
        buf.append(",country=").append(getCountry());
        buf.append(",creditCardNumber=").append(getCreditCardNumber());
        buf.append(",creditCardType=").append(getCreditCardType());
        buf.append(",creditCardExpiryDate=").append(getCreditCardExpiryDate());
        buf.append('}');
        return buf.toString();
    }
}

