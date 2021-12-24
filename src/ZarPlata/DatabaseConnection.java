/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ZarPlata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

/**
 *
 * @author User
 */
public class DatabaseConnection {
private Connection connection = null;
private Statement statement;
private PreparedStatement preparedStatement;
public DatabaseConnection(){
try{ 
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connsrting = "jdbc:sqlserver://localhost:1433;databaseName=Zarplata;user=aidin007;password=123;";
        Connection conn = DriverManager.getConnection(connsrting);
    

//jdbc:sqlserver://localhost:1433;databaseName=db1;integratedSecurity=true;
  }
catch(ClassNotFoundException e){
   System.out.println(e.getMessage());
    }
 catch(SQLException e){
 System.out.println(e.getMessage());
    }
    }
    
    public Connection ConnectionDb(){
        return connection;
    }
    public ResultSet select(String fields, String table, String condition) throws SQLException{
        String query = "select " + fields + " from " + table;
        if(condition != null){
            query += " where " + condition;
        }
        statement = connection.createStatement();
        return statement.executeQuery(query);
    }
   }


