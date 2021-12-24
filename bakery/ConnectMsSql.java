/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery;

/**
 *
 * @author Aidin
 */
import mssqlconnection.*;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author Мирик
 */
public class ConnectMsSql {
    
    Connection conn = null;
    public static Connection ConnectDB(){
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connsrting = "jdbc:sqlserver://localhost:1433;databaseName=bakery;user=aidin007;password=123;";
        Connection conn = DriverManager.getConnection(connsrting);
        return conn;
    }
    catch(Exception e){
        e.printStackTrace();
        return null;
    }
   } 
    

}

