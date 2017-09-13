/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.service.publishing;

import com.cdi.g3.common.exception.ObjectNotFoundException;
import com.cdi.g3.server.domain.catalog.AuthorDAO;
import com.cdi.g3.server.domain.catalog.Editor;
import com.cdi.g3.server.domain.catalog.EditorDAO;
import com.cdi.g3.server.service.AbstractService;
import java.util.Collection;

/**
 *
 * @author cdi314
 */
public class PublishingService extends AbstractService{
    AuthorDAO _daoAuthor = new AuthorDAO();
    EditorDAO _daoEditor = new EditorDAO();
    
    public Collection findAuthorByISBN(String isbn) throws ObjectNotFoundException{
        return _daoAuthor.findAll(isbn);
        
    }
    public Editor findEditorByISBN(String isbn) throws ObjectNotFoundException{
        return (Editor)_daoEditor.selectByChamps(isbn);
        
    }
    
}   
