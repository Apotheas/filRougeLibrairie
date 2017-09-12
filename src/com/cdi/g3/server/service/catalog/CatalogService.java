/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.service.catalog;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.common.exception.FinderException;
import com.cdi.g3.common.logging.Trace;
import com.cdi.g3.server.domain.catalog.Book;
import com.cdi.g3.server.domain.catalog.BookDAO;
import com.cdi.g3.server.service.AbstractService;


public class CatalogService extends AbstractService{
    
    private static final BookDAO _bookDao = new BookDAO();
     
    
    public Book findBook( final String bookId ) throws FinderException, CheckException {
        final String mname = "findBook";
        Trace.entering( _cname, mname, bookId );

        checkId( bookId );
        // Finds the object
        final Book book = (Book) _bookDao.findByPrimaryKey( bookId );
        Trace.exiting( _cname, mname, book );
        return book;
    }
}
