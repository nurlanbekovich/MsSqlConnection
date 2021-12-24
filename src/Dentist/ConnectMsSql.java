/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dentist;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Aidin
 */
public class ConnectMsSql {
    Connection conn = null;
   	ResultSet rs = null;
    	CallableStatement stored_pro = null;
    public static Connection ConnectDB(){
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connsrting = "jdbc:sqlserver://localhost:1433;databaseName=dentistry;user=aidin00;password=123;";
        Connection conn = DriverManager.getConnection(connsrting);
        //JOptionPane.showMessageDialog(null, "Connect");
        return conn;
    }catch(Exception e){
        e.printStackTrace();
        return null;
    }
    } 
}

