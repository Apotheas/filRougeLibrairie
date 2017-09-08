/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.orders;

import com.cdi.g3.server.domain.DomainObject;
import java.io.Serializable;

/**
 *
 * @author youssef
 */
public class OrderLine extends DomainObject implements Serializable{
    
    
    
   private String idOrderLine;
    
    
     
     
     
     
     
     
     
     @Override
    public String getId() {
        return idOrderLine;
    }
    @Override
    public void setId(String idOrderLine) {
        this.idOrderLine = idOrderLine;
    }
    
}
