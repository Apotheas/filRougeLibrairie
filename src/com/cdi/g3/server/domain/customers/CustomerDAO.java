
package com.cdi.g3.server.domain.customers;

import com.cdi.g3.server.domain.DomainObject;
import com.cdi.g3.server.util.persistence.AbstractDataAccessObject;

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
    private static final String TABLE = "T_USER";
    private static final String COLUMNS = "ID, FIRSTNAME, LASTNAME, TELEPHONE, STREET1, STREET2, CITY, STATE, ZIPCODE, COUNTRY";
    // Used to get a unique id with the UniqueIdGenerator
    private static final String COUNTER_NAME = "USER";

    // ======================================
    // =           Business methods         =
    // ======================================
    protected String getInsertSqlStatement(final DomainObject object) {
        final Customer user = (Customer) object;
        final String sql;
        sql = "INSERT INTO " + TABLE + "(" + COLUMNS + ") VALUES ('" + user.getId() + "', '" + user.getFirstname() + "','" + user.getLastname() + "', '" + user.getTelephone() + "', '" + user.getStreet1() + "', '" + user.getStreet2() + "', '" + user.getCity() + "', '" + user.getState() + "', '" + user.getZipcode() + "', '" + user.getCountry() + "' )";
        return sql;
    }

    protected String getDeleteSqlStatement(final String id) {
        final String sql;
        sql = "DELETE FROM " + TABLE + " WHERE ID = '" + id + "'";
        return sql;
    }

    protected String getUpdateSqlStatement(final DomainObject object) {
        final Customer user = (Customer) object;
        final String sql;
        sql = "UPDATE " + TABLE + " SET FIRSTNAME = '" + user.getFirstname() + "', LASTNAME = '" + user.getLastname() + "', TELEPHONE = '" + user.getTelephone() + "', STREET1 = '" + user.getStreet1() + "', STREET2 = '" + user.getStreet2() + "', CITY = '" + user.getCity() + "', STATE = '" + user.getState() + "', ZIPCODE = '" + user.getZipcode() + "', COUNTRY = '" + user.getCountry() + "' WHERE ID = '" + user.getId() + "' ";
        return sql;
    }

    protected String getSelectSqlStatement(final String id) {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE + " WHERE ID = '" + id + "' ";
        return sql;
    }

    protected String getSelectAllSqlStatement() {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE;
        return sql;
    }

  
    protected DomainObject transformResultset2DomainObject(final ResultSet resultSet) throws SQLException {
        final Customer user;
        user = new Customer(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
        user.setTelephone(resultSet.getString(4));
        user.setStreet1(resultSet.getString(5));
        user.setStreet2(resultSet.getString(6));
        user.setCity(resultSet.getString(7));
        user.setState(resultSet.getString(8));
        user.setZipcode(resultSet.getString(9));
        user.setCountry(resultSet.getString(10));
        return user;
    }

	protected String getCounterName() {
		return COUNTER_NAME;
	}
}
