package com.cdi.g3.server.domain; 



public final class CreditCard extends DomainObject {

    // ======================================
    // =             Attributes             =
    // ======================================
    
    private String idCreditCard;
    private String _creditCardNumber;
    private String _creditCardType;
    private String _creditCardExpiryDate;

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
        return _creditCardNumber;
    }

    public void setCreditCardNumber(final String creditCardNumber) {
        _creditCardNumber = creditCardNumber;
    }

    public String getCreditCardType() {
        return _creditCardType;
    }

    public void setCreditCardType(final String creditCardType) {
        _creditCardType = creditCardType;
    }

    public String getCreditCardExpiryDate() {
        return _creditCardExpiryDate;
    }

    public void setCreditCardExpiryDate(final String creditCardExpiryDate) {
        _creditCardExpiryDate = creditCardExpiryDate;
    }
}
