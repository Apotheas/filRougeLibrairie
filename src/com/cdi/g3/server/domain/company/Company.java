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
public class Company extends DomainObject implements Serializable{


    private String siretCompany;
    @Override
    public String getId() {
        return siretCompany;
    }
    @Override
    public void setId(String siretCompany) {
        this.siretCompany = siretCompany;
    }
    
    
}
