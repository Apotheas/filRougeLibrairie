/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.customers;

import com.cdi.g3.common.exception.DataAccessException;
import com.cdi.g3.server.domain.DomainObject;
import com.cdi.g3.server.domain.company.Company;
import com.cdi.g3.server.util.persistence.AbstractDataAccessObject;
import static com.cdi.g3.server.util.persistence.AbstractDataAccessObject.displaySqlException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author youssef
 */
public class AppreciationDAO extends AbstractDataAccessObject{
    
    private static final String TABLE = "Appreciation";
    private static final String COLUMNS = "idAppreciate, loginEmployeAppreciate, loginCustomerAppreciate,"
            + " idOrderlineAppreciate, numIsbnBookAppreciate, commentAppreciate, ratingAppreciate, dateAppreciate,"
            + "ipAppreciate, moderateAppreciate, dateModerateAppreciate ";
    
    
    private static final String COLUMNS_PREP = "loginEmployeAppreciate, loginCustomerAppreciate,"
            + " idOrderlineAppreciate, numIsbnBookAppreciate, commentAppreciate, ratingAppreciate, dateAppreciate,"
            + " ipAppreciate, moderateAppreciate, dateModerateAppreciate, idAppreciate";
    
    // Used to get a unique id with the UniqueIdGenerator
    private static final String COUNTER_NAME = "Appreciation";
 
    
    @Override
    protected String getInsertSqlPreparedStatement() {
        final String sql;        
        sql =   "INSERT INTO " + TABLE + "(" +COLUMNS_PREP+ ") VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        return sql;
    }
    
    

    @Override
    protected String getDeleteSqlStatement(String id) {
        final String sql;
        sql = "DELETE FROM " + TABLE + " WHERE idAppreciate = '" + id + "'";
        return sql;
    }

  @Override
    protected String getUpdateSqlPreparedStatement() {
        final String sql;        
        sql = "UPDATE " + TABLE + " SET loginEmployeAppreciate = ?, loginCustomerAppreciate = ?, idOrderlineAppreciate = ?,"
                + " numIsbnBookAppreciate = ?, commentAppreciate = ?, ratingAppreciate = ?, dateAppreciate = ?, ipAppreciate = ?,"
                + " moderateAppreciate = ?, dateModerateAppreciate = ? WHERE idAppreciate = ?" ;
        return sql;
    }

      @Override
    protected String getSelectSqlStatement(String id) {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE + " WHERE idAppreciate = '" + id + "' ";
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
        final Appreciation adress;
        adress = new Appreciation(resultSet.getString(1));
        adress.setLoginEmployeAppreciate(new Customer (resultSet.getString(2)));
        adress.setLoginCustomerAppreciate(new Customer (resultSet.getString(3)));
        adress.setIdOrderlineAppreciate(resultSet.getString(4));
        adress.setNumIsbnBookAppreciate(resultSet.getString(5));
        adress.setCommentAppreciate(resultSet.getString(6));
        adress.setRatingAppreciate(resultSet.getString(7));
        adress.setDateAppreciate(resultSet.getString(8));
        adress.setIdAppreciate(resultSet.getString(9));
        adress.setModerateAppreciate(resultSet.getString(10));
        adress.setDateModerateAppreciate(resultSet.getString (11));
        
        
        return adress;
    }

     @Override
    protected int executePreparedSt(PreparedStatement prestmt, DomainObject object) {
       int retour = 0;
        try {
            
            prestmt.setString(1, ((Appreciation) object).getLoginEmployeAppreciate().getId()); 
            prestmt.setString(2, ((Appreciation) object).getLoginCustomerAppreciate().getId());
            prestmt.setString(3, ((Appreciation) object).getIdOrderlineAppreciate());
            prestmt.setString(4, ((Appreciation) object).getNumIsbnBookAppreciate());
            prestmt.setString(5, ((Appreciation) object).getCommentAppreciate());
            prestmt.setString(6, ((Appreciation) object).getRatingAppreciate()); 
            prestmt.setString(7, ((Appreciation) object).getDateAppreciate());
            prestmt.setString(8, ((Appreciation) object).getIdAppreciate());
            prestmt.setString(9, ((Appreciation) object).getModerateAppreciate());
            prestmt.setString(10, ((Appreciation) object).getDateModerateAppreciate());
            prestmt.setString(11, ((Appreciation) object).getId());
            
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
