/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.catalog;

import com.cdi.g3.server.domain.DomainObject;
import java.io.Serializable;

/**
 *
 * @author youssef
 */
public class Editor extends DomainObject implements Serializable{


    private String idEditor;
    @Override
    public String getId() {
        return idEditor;
    }
    @Override
    public void setId(String idEditor) {
        this.idEditor = idEditor;
    }
}
