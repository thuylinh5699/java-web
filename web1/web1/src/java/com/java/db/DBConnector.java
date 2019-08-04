/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ThuyLinh
 */
public class DBConnector {
    public Connection getConnection() throws ClassNotFoundException, SQLException { 
        Class.forName("com.mysql.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/qlsinhvien";
        String user = "root";
        String pass = "12345";
        return DriverManager.getConnection(conStr, user, pass);
}

    
}
