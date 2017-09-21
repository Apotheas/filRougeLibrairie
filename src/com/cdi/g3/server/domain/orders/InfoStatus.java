/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.orders;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.server.domain.DomainObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author youssef
 */
public class InfoStatus extends DomainObject implements Serializable{

    // ======================================
    // =             Attributes             =
    // ======================================
    private String nameInfoStatus;
    private int valueInfoStatus;
    
    private final Collection  listEmploye = new ArrayList();
    
    // ======================================
    // =            Constructors            =
    // ======================================
     public InfoStatus() {
    }

    public InfoStatus(final String id) {
     setId(id);
    } 
    
     public InfoStatus(final String id, int valueInfoStatus) {
        setId(id);
        setValueInfoStatus(valueInfoStatus);
    } 
     
     
    InfoStatus(InfoStatus infoStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // ======================================
    // =           Business methods         =
    // ======================================

    public void checkData() throws CheckException {
       if (getId() == null || "".equals(getId()))
            throw new CheckException("Invalid InfoStatus id");
        
        
    }

   // ======================================
    // =         Getters and Setters        =
    // ======================================
    
    @Override
    public String getId() {
        return nameInfoStatus;
    }
    @Override
    public void setId(String nameInfoStatus) {
        this.nameInfoStatus = nameInfoStatus;
    }

    public int getValueInfoStatus() {
        return valueInfoStatus;
    }

    public String getNameInfoStatus() {
        return nameInfoStatus;
    }

    public void setNameInfoStatus(String nameInfoStatus) {
        this.nameInfoStatus = nameInfoStatus;
    }

    public void setValueInfoStatus(int valueInfoStatus) {
        this.valueInfoStatus = valueInfoStatus;
    }
    
       public Collection getListEmploye() {
        return listEmploye;
    }

    @Override
    public String toString() {
        return  String.valueOf(nameInfoStatus) ;
    }
 
  
  

    
    
    
    
}
