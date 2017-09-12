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
public class AdressDAO extends AbstractDataAccessObject{

    private static final String TABLE = "Adress";
    private static final String COLUMNS = "idAdress, loginCustomerShipAdress, loginCustomerBillAdress,"
            + " nameReceiverAdress, typeStreetAdress, numAdress, nameStreetAdress, nameStreet2Adress,"
            + "zipcodeAdress, cityAdress, countryAdress,nameCompanyReceiverAdress,  ";
    
    
    private static final String COLUMNS_PREP = "loginCustomerShipAdress, loginCustomerBillAdress,"
            + " nameReceiverAdress, typeStreetAdress, numAdress, nameStreetAdress, nameStreet2Adress,"
            + " zipcodeAdress, cityAdress, countryAdress,nameCompanyReceiverAdress, idAdress";
    
    // Used to get a unique id with the UniqueIdGenerator
    private static final String COUNTER_NAME = "Adress";
 
    
    @Override
    protected String getInsertSqlPreparedStatement() {
        final String sql;        
        sql =   "INSERT INTO " + TABLE + "(" +COLUMNS_PREP+ ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        return sql;
    }
    
    

    @Override
    protected String getDeleteSqlStatement(String id) {
        final String sql;
        sql = "DELETE FROM " + TABLE + " WHERE idAdress = '" + id + "'";
        return sql;
    }

  @Override
    protected String getUpdateSqlPreparedStatement() {
        final String sql;        
        sql = "UPDATE " + TABLE + " SET loginCustomerShipAdress = ?, loginCustomerBillAdress = ?, nameReceiverAdress = ?,"
                + " typeStreetAdress = ?, numAdress = ?, nameStreetAdress = ?, nameStreet2Adress = ?, zipcodeAdress = ?,"
                + " cityAdress = ?, countryAdress = ?, nameCompanyReceiverAdress = ? WHERE idAdress = ?" ;
        return sql;
    }

      @Override
    protected String getSelectSqlStatement(String id) {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE + " WHERE idAdress = '" + id + "' ";
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
        final Adress adress;
        adress = new Adress(resultSet.getString(1));
        adress.setCustomerShipAdress(new Customer (resultSet.getString(2)));
        adress.setCustomerBillAdress(new Customer (resultSet.getString(3)));
        adress.setNameReceiverAdress(resultSet.getString(4));
        adress.setTypeStreetAdress(resultSet.getString(5));
        adress.setNumAdress(resultSet.getString(6));
        adress.setNameStreetAdress(resultSet.getString(7));
        adress.setNameStreet2Adress(resultSet.getString(8));
        adress.setZipcodeAdress(resultSet.getString(9));
        adress.setCityAdress(resultSet.getString(10));
        adress.setCountryAdress(resultSet.getString (11));
        adress.setNameCompanyReceiverAdress(new Company (resultSet.getString(12)));
        
        return adress;
    }

     @Override
    protected int executePreparedSt(PreparedStatement prestmt, DomainObject object) {
       int retour = 0;
        try {
            
            prestmt.setString(1, ((Adress) object).getCustomerShipAdress().getId()); 
            prestmt.setString(2, ((Adress) object).getCustomerBillAdress().getId());
            prestmt.setString(3, ((Adress) object).getNameReceiverAdress());
            prestmt.setString(4, ((Adress) object).getTypeStreetAdress());
            prestmt.setString(5, ((Adress) object).getNumAdress());
            prestmt.setString(6, ((Adress) object).getNameStreetAdress()); 
            prestmt.setString(7, ((Adress) object).getNameStreet2Adress());
            prestmt.setString(8, ((Adress) object).getZipcodeAdress());
            prestmt.setString(9, ((Adress) object).getCityAdress());
            prestmt.setString(10, ((Adress) object).getCountryAdress());
            prestmt.setString(11, ((Adress) object).getNameCompanyReceiverAdress().getId());
            prestmt.setString(12, ((Adress) object).getId());
            
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
