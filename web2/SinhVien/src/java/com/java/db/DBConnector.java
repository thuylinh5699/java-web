/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ThuyLinh
 */
public class DBConnector {
     public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/sinhvien";
        String user = "root";
        String pass = "12345";
        return DriverManager.getConnection(url, user, pass);
    }
}
