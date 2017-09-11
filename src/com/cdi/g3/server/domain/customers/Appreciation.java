/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.customers;

import com.cdi.g3.server.domain.DomainObject;
import java.io.Serializable;

/**
 *
 * @author youssef
 */
public class Appreciation extends DomainObject implements Serializable{


    private String idAppreciation;
    
    
    
    public Appreciation() {
    }

    public Appreciation(final String id) {
       idAppreciation = id;
    } 
    
    @Override
    public String getId() {
        return idAppreciation;
    }
    @Override
    public void setId(String idAppreciation) {
        this.idAppreciation = idAppreciation;
    }
    
    
}
