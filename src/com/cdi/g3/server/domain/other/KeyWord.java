/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.other;

import com.cdi.g3.server.domain.DomainObject;
import java.io.Serializable;

/**
 *
 * @author youssef
 */
public class KeyWord extends DomainObject implements Serializable{


    private String nameKeyWord;
    @Override
    public String getId() {
        return nameKeyWord;
    }
    @Override
    public void setId(String nameKeyWord) {
        this.nameKeyWord = nameKeyWord;
    }
    
    
}
