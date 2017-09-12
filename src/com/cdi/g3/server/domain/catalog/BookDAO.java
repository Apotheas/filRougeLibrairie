/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.catalog;

import com.cdi.g3.common.exception.DataAccessException;
import com.cdi.g3.server.domain.DomainObject;
import com.cdi.g3.server.domain.other.CodeTVA;
import com.cdi.g3.server.util.persistence.AbstractDataAccessObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author youssef
 */
public class BookDAO extends AbstractDataAccessObject{
    
     // ======================================
    // =             Attributes             =
    // ======================================
    private static final String TABLE = "BOOK"; 
    private EditorDAO editorDAO = new  EditorDAO();
    
    private static final String COLUMNS = "NUMISBNBOOK, IDEDITORBOOK, TYPETVABOOK, TITREBOOK, UNITCOSTBOOK"
            + ", STOCKBOOK, STATUSBOOK, SUBTITREBOOK, SYNOPSISBOOK, PATHICONBOOK, WEIGHTBOOK, SIZELARGEBOOK"
            + ", SIZELONGBOOK, COMMENTBOOK";
    private static final String COLUMNS_PREP= " IDEDITORBOOK, TYPETVABOOK, TITREBOOK, UNITCOSTBOOK"
            + ", STOCKBOOK, STATUSBOOK, SUBTITREBOOK, SYNOPSISBOOK, PATHICONBOOK, WEIGHTBOOK, SIZELARGEBOOK"
            + ", SIZELONGBOOK, COMMENTBOOK, NUMISBNBOOK ";
    // Used to get a unique id with the UniqueIdGenerator
    private static final String COUNTER_NAME = "BOOK";

     
   
    protected String getCounterName() {
        return COUNTER_NAME;
    }

    
    
    protected String getInsertSqlPreparedStatement() {
        final String sql;
        sql = "INSERT INTO " + TABLE + "(" +COLUMNS_PREP+ ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return sql;
    }

   
    protected String getDeleteSqlStatement(String id) {
        final String sql;
        sql = "DELETE FROM " + TABLE + " WHERE NUMISBNBOOK = '" + id + "'";
        return sql;
    }

   
    protected String getUpdateSqlPreparedStatement() {
        final String sql;        
        sql = "UPDATE " + TABLE + " SET IDEDITORBOOK = ?, TYPETVABOOK = ?, TITREBOOK = ?"
                + ", UNITCOSTBOOK = ?, STOCKBOOK = ?, STATUSBOOK = ?, SUBTITREBOOK = ?, SYNOPSISBOOK = ?" 
                + ", PATHICONBOOK = ?, WEIGHTBOOK = ?, SIZELARGEBOOK = ?,SIZELONGBOOK = ?, COMMENTBOOK = ?"
                + " WHERE NUMISBNBOOK = ?";
        return sql;
    }

    
    protected String getSelectSqlStatement(String id) {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE + " WHERE NUMISBNBOOK = '" + id + "' ";
        return sql; 
    }

    
    protected String getSelectAllSqlStatement() {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE;
        return sql; 
    }

    @Override
    protected DomainObject transformResultset2DomainObject(ResultSet resultSet) throws SQLException {
        final Book book;
        book = new Book(resultSet.getString(1),new Editor(resultSet.getString(2)), new CodeTVA(resultSet.getString(3)),resultSet.getString(4), resultSet.getFloat(5),resultSet.getInt(6));        
        book.setStatusBook(resultSet.getInt(7));
        book.setSubTitleBook(resultSet.getString(8));
        book.setSynopsisBook(resultSet.getString(9));
        book.setPathIconBook(resultSet.getString(10));
        book.setWeightBook(resultSet.getFloat(11));
        book.setSizeLargeBook(resultSet.getFloat(12));
        book.setSizeLongBook(resultSet.getFloat(13));
        book.setCommentBook(resultSet.getString(14));
       
      
        return book;
    }
    
       @Override
    protected int executePreparedSt(PreparedStatement prestmt, DomainObject object) {
        int retour = 0;
        try {
            
            prestmt.setString(1, ((Book) object).getEditor().getId());
            prestmt.setString(2, ((Book) object).getCodeTva().getId());
            prestmt.setString(3, ((Book) object).getTitleBook());
            prestmt.setFloat(4, ((Book) object).getUnitCostBook());
            prestmt.setInt(5, ((Book) object).getStockBook());
            prestmt.setInt(6, ((Book) object).getStatusBook());
            prestmt.setString(7, ((Book) object).getSubTitleBook());
            prestmt.setString(8, ((Book) object).getSynopsisBook());
            prestmt.setString(9, ((Book) object).getPathIconBook());
            prestmt.setFloat(10, ((Book) object).getWeightBook());
            prestmt.setFloat(11, ((Book) object).getSizeLongBook());
            prestmt.setFloat(12, ((Book) object).getSizeLargeBook());
            prestmt.setString(13, ((Book) object).getCommentBook());
            prestmt.setString(14, ((Book) object).getNumISBNBook());
            
            retour = prestmt.executeUpdate();

        } catch (SQLException e) {
            // A Severe SQL Exception is caught
            displaySqlException(e);
            throw new DataAccessException("executePreparedSt : Cannot get dataBook from the database: " + e.getMessage(), e);
        }
        return retour;
    }
    
    

    
    
    
    
}
