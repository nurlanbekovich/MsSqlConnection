/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssqlconnection;

import java.sql.*;
import javax.swing.*;

public class ConnectMsSql {
    Connection conn = null;
   	ResultSet rs = null;
    	CallableStatement stored_pro = null;
    public static Connection ConnectDB(){
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connsrting = "jdbc:sqlserver://localhost:1433;databaseName=db1;user=AIDIN5;password=123;";
        Connection conn = DriverManager.getConnection(connsrting);
        //JOptionPane.showMessageDialog(null, "Connect");
        return conn;
    }catch(Exception e){
        e.printStackTrace();
        return null;
    }
    } 
}

