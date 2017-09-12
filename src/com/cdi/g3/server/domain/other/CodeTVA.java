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
public class CodeTVA extends DomainObject implements Serializable {

    private String typeTVA;

    public CodeTVA() {

    }

    public CodeTVA(String id) {
        typeTVA = id;
    }

    @Override
    public void setId(String typeTVA) {
        this.typeTVA = typeTVA;
    }

    @Override
    public String getId() {
        return typeTVA;
    }
}
