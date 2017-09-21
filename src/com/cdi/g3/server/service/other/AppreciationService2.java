/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.service.other;

import com.cdi.g3.common.exception.ObjectNotFoundException;
import com.cdi.g3.server.domain.customers.Appreciation;
import com.cdi.g3.server.domain.customers.AppreciationDAO;
import java.util.Collection;

/**
 *
 * @author Apotheas
 */
public class AppreciationService2 {
    private static final AppreciationDAO _DAOAppreciate = new AppreciationDAO();
    
    
    public Collection findWaitingAppreciate() throws ObjectNotFoundException{
        return _DAOAppreciate.selectAllNonModerate();
    }
}
