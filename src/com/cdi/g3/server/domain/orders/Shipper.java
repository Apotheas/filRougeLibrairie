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
public class Shipper extends DomainObject implements Serializable{


    private String nameShipper;
    @Override
    public String getId() {
        return nameShipper;
    }
    @Override
    public void setId(String nameShipper) {
        this.nameShipper = nameShipper;
    }
    
}
