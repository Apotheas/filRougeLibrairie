/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.service.customers;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.common.exception.CreateException;
import com.cdi.g3.common.exception.FinderException;
import com.cdi.g3.common.exception.ObjectNotFoundException;
import com.cdi.g3.common.exception.RemoveException;
import com.cdi.g3.common.exception.UpdateException;
import com.cdi.g3.common.logging.Trace;
import com.cdi.g3.server.domain.customers.Adress;
import com.cdi.g3.server.domain.customers.AdressDAO;
import com.cdi.g3.server.service.AbstractService;
import java.util.Collection;

/**
 *
 * @author Izet
 */
public class AdressService extends AbstractService {
    
 
      // ======================================
    // = Attributes =
    // ======================================
    private static final AdressDAO _dao = new AdressDAO();

    // ======================================
    // = Constructors =
    // ======================================
    public AdressService(){
        
    }

    // ======================================
    // = Business methods =
    // ======================================
    public Adress createAdress( final Adress adress ) throws CreateException, CheckException {
        final String mname = "createAdress";
        Trace.entering( _cname, mname, adress );

        if ( adress == null )
            throw new CreateException( "Adress object is null" );
        
        adress.checkData();
//         Adress  adress1 = null ;
        try {
           _dao.findByPrimaryKey(adress.getId());
        } catch (ObjectNotFoundException ex) {
             //checkId( adress.getId() );
            checkId( adress.getId());
             // Creates the object
            _dao.insert( adress );
            return adress;
        }
        Trace.exiting( _cname, mname, adress );
        throw new CreateException( "Adress object exist" );
        
    }

    public Adress findAdress( final String adressId ) throws FinderException, CheckException {
        final String mname = "findAdress";
        Trace.entering( _cname, mname, adressId );

        checkId( adressId );
        // Finds the object
        final Adress adress = (Adress) _dao.findByPrimaryKey( adressId );
        Trace.exiting( _cname, mname, adress );
        return adress;
    }

    public void deleteAdress( final String adressId ) throws RemoveException, CheckException {
        final String mname = "deleteAdress";
        Trace.entering( _cname, mname, adressId );

        checkId( adressId );

        // Checks if the object exists
        try {
            _dao.findByPrimaryKey( adressId );
        } catch ( FinderException e ) {
            throw new RemoveException( "Adress must exist to be deleted" );
        }

        // Deletes the object
        try {
            _dao.remove(adressId);
        } catch ( ObjectNotFoundException e ) {
            throw new RemoveException( "Adress must exist to be deleted" );
        }
    }

    public void updateAdress(Adress adress  ) throws UpdateException, CheckException {
        final String mname = "updateAdress";
        Trace.entering( _cname, mname, adress );

        if ( adress == null )
            throw new UpdateException( "Adress object is null" );

        checkId( adress.getId() );

       final Adress adressFinded;

        // Checks if the object exists
        try {
            adressFinded = (Adress) _dao.findByPrimaryKey( adress.getId() );
        } catch ( FinderException e ) {
            throw new UpdateException( "Adress must exist to be updated" );
        }
        
        adress.checkData();
        adress = setAdress(adress, adressFinded );
        

        // Updates the object
        try {
            _dao.update( adressFinded );
        } catch ( ObjectNotFoundException e ) {
            throw new UpdateException( "Adress must exist to be updated" );
        }
    }

    public Collection findAdress() throws FinderException {
        final String mname = "findAdress";
        Trace.entering( _cname, mname );

        // Finds all the objects
        final Collection adress = _dao.selectAll();
        
        Trace.exiting( _cname, mname, new Integer( adress.size() ) );
        return adress;
    }

    // ======================================
    // = Private Methods =
    // ======================================
     private Adress setAdress(Adress adress, Adress adressFinded ){
         return null;
     }

    /**
     * This method returns a unique identifer generated by the system.
     * 
     * @return a unique identifer
     */
    public final String getUniqueId() {
        return _dao.getUniqueId();
    }

}