/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZCjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author JoãoMarcus
 */
public class ConexaoFactory {
    public static Connection getConexao() {
        
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "";
        try {
        
            return DriverManager.getConnection(url, user, password);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    
    
    }
    public static JdbcRowSet getRowSetConnection() {
        
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "";
        try {
            System.out.println(url);
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);
            System.out.println(jdbcRowSet);
            return jdbcRowSet;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    
    
    }
    public static CachedRowSet getRowSetConnectionCached() {
        
        String url = "jdbc:mysql://localhost:3306/agencia?SSL=false&relaxAutoCommit=true";
        String user = "root";
        String password = "";
        try {
        
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(user);
            cachedRowSet.setPassword(password);
            
            return cachedRowSet;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    
    
    }
    
    
    public static void close(RowSet jrs) {
      
        try {
            if(jrs != null) {
                jrs.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void close(Connection connection) {
        try {
            if(connection != null) {
                connection.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stmt) {
        close(connection);
        try {
            if(stmt != null) {
                stmt.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
    }
    public static void close(Connection connection, Statement stmt, ResultSet rs) {
        close(connection, stmt);
        try {
            if(rs != null) {
                rs.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
    }

     
}
