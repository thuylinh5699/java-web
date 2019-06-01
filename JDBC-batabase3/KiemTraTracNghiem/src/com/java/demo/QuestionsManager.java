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
public class QuestionsManager {
    Connection conn;
    public QuestionsManager() throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        this.conn = db.getConnect();
    }
    
    public boolean login() throws SQLException {
        
        String query = "SELECT *FROM questions ";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();       
        return rs.next();
    }
}
