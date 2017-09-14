/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.service.publishing;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.common.exception.ObjectNotFoundException;
import com.cdi.g3.common.exception.UpdateException;
import com.cdi.g3.server.domain.catalog.Author;
import com.cdi.g3.server.domain.catalog.AuthorDAO;
import com.cdi.g3.server.domain.catalog.Editor;
import com.cdi.g3.server.domain.catalog.EditorDAO;
import com.cdi.g3.server.service.AbstractService;
import java.util.Collection;
import javax.swing.JOptionPane;

/**
 *
 * @author cdi314
 */
public class PublishingService extends AbstractService{
    AuthorDAO _daoAuthor = new AuthorDAO();
    EditorDAO _daoEditor = new EditorDAO();
    
    public Collection findAuthorByISBN(String column,String champ) throws ObjectNotFoundException{
        return _daoAuthor.findAllByChamp(column ,champ);
        
    }
    public Editor findEditorByChamp(String column,String champ) throws ObjectNotFoundException{
        
        return (Editor)_daoEditor.findByChamp(column, champ);
        
    }
    public Author findAuthor(String column, String idAuthor)throws ObjectNotFoundException{
        return (Author)_daoAuthor.findByPrimaryKey(idAuthor);
    }
    public Collection findAuthorByChamp(String column,String champ)throws ObjectNotFoundException{
        return _daoAuthor.findAllByChamp(column, champ);
    }
    public Collection FindAllAuthor()throws ObjectNotFoundException{
        return _daoAuthor.findAll();
    }
    
    public void updateAuthor(Author myAuthor) throws ObjectNotFoundException , UpdateException , CheckException{
        
        
        if (myAuthor == null){
            throw new UpdateException("myauthor is null");
        }
        
        checkId(myAuthor.getId());
        try{
        _daoAuthor.update(myAuthor);
        }catch(ObjectNotFoundException ex){
            System.out.println(ex.getMessage() + " erreur update ");
        }
        
    }
    
}   
