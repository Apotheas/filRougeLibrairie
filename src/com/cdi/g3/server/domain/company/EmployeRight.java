/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.company;

import com.cdi.g3.server.domain.DomainObject;
import java.io.Serializable;

/**
 *
 * @author youssef
 */
public class EmployeRight extends DomainObject implements Serializable{


    private String idEmployeRight;
    @Override
    public String getId() {
        return idEmployeRight;
    }
    @Override
    public void setId(String idEmployeRight) {
        this.idEmployeRight = idEmployeRight;
    }
    
    
}
