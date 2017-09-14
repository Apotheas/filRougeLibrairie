/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.domain.company;

import com.cdi.g3.common.exception.DataAccessException;
import com.cdi.g3.server.domain.DomainObject;
import com.cdi.g3.server.domain.company.Employe;
import com.cdi.g3.server.util.persistence.AbstractDataAccessObject;
import static com.cdi.g3.server.util.persistence.AbstractDataAccessObject.displaySqlException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Izet
 */
public class EmployeDAO extends AbstractDataAccessObject{
    
    
    // ======================================
    // =             Attributes             =
            // ======================================
            private static final String TABLE = "Employe";  
    
    private static final String COLUMNS = "LOGINEMPLOYE, IDEMPLOYERIGHT, FIRSTNAMEEMPLOYE, LASTNAMEEMPLOYE, EMAILEMPLOYE"
            + ", PASSWORDEMPLOYE, STATUSEMPLOYE";
    private static final String COLUMNS_PREP= "  IDEMPLOYERIGHT, FIRSTNAMEEMPLOYE, LASTNAMEEMPLOYE, EMAILEMPLOYE"
            + ", PASSWORDEMPLOYE,STATUSEMPLOYE, LOGINEMPLOYE";
    // Used to get a unique id with the UniqueIdGenerator
    private static final String COUNTER_NAME = "EMPLOYE";
    
    
     // ======================================
    // =           Business methods         =
    // ======================================
    protected String getInsertSqlPreparedStatement() {        
        final String sql;        
        sql =   "INSERT INTO " + TABLE + "(" +COLUMNS_PREP+ ") VALUES(?,?,?,?,?,?,?)";
        return sql;
    }

    protected String getDeleteSqlStatement(final String id) {
        final String sql;
        sql = "DELETE FROM " + TABLE + " WHERE LOGINEMPLOYE = '" + id + "'";
        return sql;
    }

    protected String getUpdateSqlPreparedStatement() {        
        final String sql;        
        sql = "UPDATE " + TABLE + " SET IDEMPLOYERIGHT = ?, FIRSTNAMEEMPLOYE = ?, LASTNAMEEMPLOYE = ?,"
                + " EMAILEMPLOYE = ?, PASSWORDEMPLOYE = ?, STATUSEMPLOYE = ? WHERE LOGINEMPLOYE = ?" ;
        return sql;
        
    }

    protected String getSelectSqlStatement(final String id) {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE + " WHERE LOGINEMPLOYE = '" + id + "' ";
        return sql;
    }

    protected String getSelectAllSqlStatement() {
        final String sql;
        sql = "SELECT " + COLUMNS + " FROM " + TABLE;
        return sql;
    }

  
    protected DomainObject transformResultset2DomainObject(final ResultSet resultSet) throws SQLException {
        final Employe employe;
        employe = new Employe(resultSet.getString(1));
        employe.setIdEmployeRight(resultSet.getString(2));
        employe.setFirstNameEmploye(resultSet.getString(3)) ;
        employe.setLastNameEmploye(resultSet.getString(4));
        employe.setEmailEmploye(resultSet.getString(5));
        employe.setPasswordEmploye(resultSet.getString(6));
        employe.setStatusEmploye(resultSet.getString(7));
       
        return employe;
    }

	protected String getCounterName() {
		return COUNTER_NAME;
	}
        
        
       @Override
    protected int executePreparedSt(PreparedStatement prestmt, DomainObject object) {
        int retour = 0;
        try {
            prestmt.setString(1, ((Employe) object).getIdEmployeRight());
            prestmt.setString(2, ((Employe) object).getFirstNameEmploye());
            prestmt.setString(3, ((Employe) object).getLastNameEmploye());
            prestmt.setString(4, ((Employe) object).getEmailEmploye());
            prestmt.setString(5, ((Employe) object).getPasswordEmploye());
            prestmt.setString(6, ((Employe) object).getStatusEmploye());
            prestmt.setString(7, ((Employe) object).getId());
           
            
            retour = prestmt.executeUpdate();

        } catch (SQLException e) {
            // A Severe SQL Exception is caught
            displaySqlException(e);
            throw new DataAccessException("executePreparedSt : Cannot get data from the database: " + e.getMessage(), e);
        }
        return retour;
    }
     
        
        
}