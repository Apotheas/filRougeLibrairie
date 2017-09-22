package com.cdi.g3.server.domain; 



public final class CreditCard extends DomainObject {

    // ======================================
    // =             Attributes             =
    // ======================================
    
    private String idCreditCard;
    private String creditCardNumber;
    private String creditCardType;
    private String creditCardExpiryDate;
    private String creditCardCCV;

    // ======================================
    // =         Getters and Setters        =
    // ======================================
    
    @Override
    public String getId() {
        return idCreditCard;
    }
    @Override
    public void setId(String idCreditCard) {
        this.idCreditCard = idCreditCard;
    }
    
    
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(final String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(final String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCardExpiryDate() {
        return creditCardExpiryDate;
    }

    public void setCreditCardExpiryDate(final String creditCardExpiryDate) {
        this.creditCardExpiryDate = creditCardExpiryDate;
    }

    public String getCreditCardCCV() {
        return creditCardCCV;
    }

    public void setCreditCardCCV(String creditCardCCV) {
        this.creditCardCCV = creditCardCCV;
    }
    
    
}
