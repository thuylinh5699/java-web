/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ThuyLinh
 */
public class DBConnector {
    public Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/ktratracnghiem";
        Connection conn = DriverManager.getConnection(connStr, "root", "12345");
        return conn;
        
    }
}
