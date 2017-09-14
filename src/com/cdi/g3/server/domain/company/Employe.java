/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.company;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.server.domain.DomainObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Izet
 */
public class Employe extends DomainObject implements Serializable{
    

    // ======================================
    // =             Attributes             =
    // ======================================
   
    
    private String loginEmploye;
    private String idEmployeRight;
    private String firstNameEmploye;
    private String lastNameEmploye;
    private String emailEmploye;
    private String passwordEmploye;
    private String statusEmploye;
   
    private final Collection  listAppreciation = new ArrayList();
 
   

    // ======================================
    // =            Constructors            =
    // ======================================
    public Employe() {
    }

    public Employe(final String id) {
        setId(id);
    }

    public Employe(final String id, final String idEmployeRight, final String firstNameEmploye
            ,final String lastNameEmploye, final String emailEmploye,
            final String passwordEmploye, final String statusEmploye) {
        setId(id);
        setIdEmployeRight(idEmployeRight);
        setFirstNameEmploye(firstNameEmploye);
        setLastNameEmploye(lastNameEmploye);
        setEmailEmploye(emailEmploye);
        setPasswordEmploye(passwordEmploye);
        
       
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
        if (getId() == null || "".equals(getId()))
            throw new CheckException("Invalid company siret");
        if (getIdEmployeRight() == null || "".equals(getIdEmployeRight()))
            throw new CheckException("Invalid company  idEmployeRight");
        if (getFirstNameEmploye() == null || "".equals(getFirstNameEmploye()))
            throw new CheckException("Invalid company first name");
         if (getLastNameEmploye() == null || "".equals(getLastNameEmploye()))
            throw new CheckException("Invalid company  lastname");
        if (getEmailEmploye() == null || "".equals(getEmailEmploye()))
            throw new CheckException("Invalid company email");
         if (getPasswordEmploye() == null || "".equals(getPasswordEmploye()))
            throw new CheckException("Invalid company password");
    }

    // ======================================
    // =         Getters and Setters        =
    // ======================================

   @Override
    public String getId() {
        return loginEmploye;
    }
    @Override
    public void setId(String loginEmploye) {
        this.loginEmploye = loginEmploye;
    }

    public String getLoginEmploye() {
        return loginEmploye;
    }

    public void setLoginEmploye(String loginEmploye) {
        this.loginEmploye = loginEmploye;
    }

    public String getIdEmployeRight() {
        return idEmployeRight;
    }

    public void setIdEmployeRight(String idEmployeRight) {
        this.idEmployeRight = idEmployeRight;
    }

    public String getFirstNameEmploye() {
        return firstNameEmploye;
    }

    public void setFirstNameEmploye(String firstNameEmploye) {
        this.firstNameEmploye = firstNameEmploye;
    }

    public String getLastNameEmploye() {
        return lastNameEmploye;
    }

    public void setLastNameEmploye(String lastNameEmploye) {
        this.lastNameEmploye = lastNameEmploye;
    }

    public String getEmailEmploye() {
        return emailEmploye;
    }

    public void setEmailEmploye(String emailEmploye) {
        this.emailEmploye = emailEmploye;
    }

    public String getPasswordEmploye() {
        return passwordEmploye;
    }

    public void setPasswordEmploye(String passwordEmploye) {
        this.passwordEmploye = passwordEmploye;
    }

    public String getStatusEmploye() {
        return statusEmploye;
    }

    public void setStatusEmploye(String statusEmploye) {
        this.statusEmploye = statusEmploye;
    }

  
  
   public Collection getListAppreciation() {
        return listAppreciation;
    }



    @Override
    public String toString() {
        return  loginEmploye +"  "+  idEmployeRight  ;
    }
}
    
    
    
