/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.sql.SQLException;

/**
 *
 * @author ThuyLinh
 */
public class Students_Questions {
    public Students_Questions() throws ClassNotFoundException, SQLException {
        this.sm = new StudentsManager();
        
    }
    StudentsManager sm;
    
    
}
