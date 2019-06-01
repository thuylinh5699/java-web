/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ThuyLinh
 */
public class StudentsManager {
    Connection conn;
    
    public StudentsManager() throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        this.conn = db.getConnect();
    }
    
    public boolean login(String email, String pass) throws SQLException {
       String query = "SELECT *FROM students WHERE email=? AND pass=? ";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, pass);
        
        ResultSet rs = pstmt.executeQuery();
        return rs.next();
    }
}