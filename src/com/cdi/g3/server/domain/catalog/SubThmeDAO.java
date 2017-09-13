/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.catalog;

import com.cdi.g3.common.exception.DataAccessException;
import com.cdi.g3.server.domain.DomainObject;

import com.cdi.g3.server.util.persistence.AbstractDataAccessObject;
import static com.cdi.g3.server.util.persistence.AbstractDataAccessObject.displaySqlException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author youssef
 */


public class SubThmeDAO extends AbstractDataAccessObject{
    private static final String TABLE = "SubTheme"; 
    private static final String COLUMNS = "idSubTheme, nameSubTheme, nameTheme";
    private static final String COLUMNS_PREP = " nameSubTheme,nameTheme,idSubTheme"; 
    private static final String COUNTER_NAME = "SubTheme";

    @Override
    protected String getInsertSqlPreparedStatement() {
        final String sql;        
        sql =   "INSERT INTO " + TABLE + "(" +COLUMNS_PREP+ ") VALUES(?,?,?)";
        return sql;
    }  
 
    @Override
    protected String getDeleteSqlStatement(String id) {
        final String sql;
        sql = "DELETE FROM " + TABLE + " WHERE idSubTheme = '" + id + "'";
        return sql;
    }
    
    
     @Override
    protected String getUpdateSqlPreparedStatement() {
        final String sql;        
        sql = "UPDATE " + TABLE + " SET nameSubTheme = ?, nameTheme = ?, WHERE idSubTheme = ?" ;
        return sql;
    }
    
         @Override
    protected String getSelectSqlStatement(String id) {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE + " WHERE idSubTheme = '" + id + "' ";
        return sql;
    }
    
         @Override
    protected String getSelectAllSqlStatement() {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE;
        return sql;
    }
    
    
    @Override
    protected DomainObject transformResultset2DomainObject(ResultSet resultSet) throws SQLException {
        final SubTheme subTheme;
        subTheme = new SubTheme (resultSet.getString(1)) ; 
        subTheme.setNameSubTheme(resultSet.getString(2)) ; 
        subTheme.setNameTheme(resultSet.getString(3)) ; 

        return subTheme;
    }
    
    
    
     @Override
    protected int executePreparedSt(PreparedStatement prestmt, DomainObject object) {
       int retour = 0;
        try {
            
            prestmt.setString(1, ((SubTheme) object).getNameSubTheme());
            prestmt.setString(2, ((SubTheme) object).getNameTheme());
            prestmt.setString(3, ((SubTheme) object).getId());
            
            retour = prestmt.executeUpdate();

        } catch (SQLException e) {
            // A Severe SQL Exception is caught
            displaySqlException(e);
            throw new DataAccessException("executePreparedSt : Cannot get data from the database: " + e.getMessage(), e);
        }
        return retour;
    }
    
     @Override
    protected String getCounterName() {
        return COUNTER_NAME;
    }

    
}
