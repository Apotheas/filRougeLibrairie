
package com.cdi.g3.server.domain.customers;

import com.cdi.g3.common.exception.DataAccessException;
import com.cdi.g3.server.domain.DomainObject;
import com.cdi.g3.server.util.persistence.AbstractDataAccessObject;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class does all the database access for the class Customer.
 *
 * @see Customer
 */
public final class CustomerDAO extends AbstractDataAccessObject {
    
    

    // ======================================
    // =             Attributes             =
    // ======================================
    private static final String TABLE = "Customer";  
    
    private static final String COLUMNS = "LOGINCUSTOMER, LASTNAMECUSTOMER, FIRSTNAMECUSTOMER, EMAILCUSTOMER, PASSWORDCUSTOMER"
            + ", NAMECOMPANYCUSTOMER, COMMENTCUSTOMER, STATUSCUSTOMER";
    private static final String COLUMNS_PREP= " LASTNAMECUSTOMER, FIRSTNAMECUSTOMER, EMAILCUSTOMER, PASSWORDCUSTOMER"
            + ", NAMECOMPANYCUSTOMER, COMMENTCUSTOMER, STATUSCUSTOMER, LOGINCUSTOMER";
    // Used to get a unique id with the UniqueIdGenerator
    private static final String COUNTER_NAME = "CUSTOMER";

    // ======================================
    // =           Business methods         =
    // ======================================
    protected String getInsertSqlPreparedStatement() {        
        final String sql;
        
        sql =   "INSERT INTO " + TABLE + "(" +COLUMNS_PREP+ ") VALUES(?,?,?,?,?,?,?,?)";
//                "INSERT INTO " + TABLE + "(" + COLUMNS + ") VALUES ('" + customer.getId() + "', '" + customer.getLastNameCustomer()+ "','" + customer.getFirstNameCustomer()
//                + "', '" + customer.getEmailCustomer()+ "', '" + customer.getPasswordCustomer()+ "', '" + customer.getNameCompanyCustomer()+ "', '" 
//                + customer.getCommentCustomer()+ "', '" + customer.getStatusCustomer()+ "' )";
        return sql;
    }

    protected String getDeleteSqlStatement(final String id) {
        final String sql;
        sql = "DELETE FROM " + TABLE + " WHERE LOGINCUSTOMER = '" + id + "'";
        return sql;
    }

    protected String getUpdateSqlPreparedStatement() {        
        final String sql;        
        sql = "UPDATE " + TABLE + " SET LASTTNAMECUSTOMER = ?, FIRSTNAMECUSTOMER = ?, EMAILCUSTOMER = ?,"
                + " PASSWORDCUSTOMER = ?, NAMECOMPANYCUSTOMER = ?, COMMENTCUSTOMER = ?, STATUSCUSTOMER = ? WHERE LOGINCUSTOMER = ?" ;
        return sql;
        
    }

    protected String getSelectSqlStatement(final String id) {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE + " WHERE LOGINCUSTOMER = '" + id + "' ";
        return sql;
    }

    protected String getSelectAllSqlStatement() {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE;
        return sql;
    }

  
    protected DomainObject transformResultset2DomainObject(final ResultSet resultSet) throws SQLException {
        final Customer customer;
        customer = new Customer(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
        customer.setNameCompanyCustomer(resultSet.getString(6));
        customer.setCommentCustomer(resultSet.getString(7));
        customer.setStatusCustomer(resultSet.getString(8));
      
        return customer;
    }

	protected String getCounterName() {
		return COUNTER_NAME;
	}
        
        
       @Override
    protected int executePreparedSt(PreparedStatement prestmt, DomainObject object) {
        int retour = 0;
        try {
            
            prestmt.setString(1, ((Customer) object).getLastNameCustomer());
            prestmt.setString(2, ((Customer) object).getFirstNameCustomer());
            prestmt.setString(3, ((Customer) object).getEmailCustomer());
            prestmt.setString(4, ((Customer) object).getPasswordCustomer());
            prestmt.setString(5, ((Customer) object).getNameCompanyCustomer());
            prestmt.setString(6, ((Customer) object).getCommentCustomer());
            prestmt.setString(7, ((Customer) object).getStatusCustomer());
            prestmt.setString(8, ((Customer) object).getLoginCustomer());
            
            retour = prestmt.executeUpdate();

        } catch (SQLException e) {
            // A Severe SQL Exception is caught
            displaySqlException(e);
            throw new DataAccessException("executePreparedSt : Cannot get data from the database: " + e.getMessage(), e);
        }
        return retour;
    }
     
        
        
}
