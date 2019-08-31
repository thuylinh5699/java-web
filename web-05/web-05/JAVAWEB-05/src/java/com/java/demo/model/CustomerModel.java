/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

import com.java.demo.bean.Customer;
import com.java.demo.db.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThuyLinh
 */
public class CustomerModel {
    public List<Customer> getAll() throws Exception {
        Connection conn = DBConnector.getConnection();
        List<Customer> list = new ArrayList<>();
        String sql = "SELECT * FROM customers";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Customer c = new Customer();
            c.setId(rs.getInt(1));
            c.setName(rs.getString(2));
            c.setEmail(rs.getString(3));
            list.add(c);
        }
        return list;
    }

    public int add(Customer c) throws Exception {
        Connection conn = DBConnector.getConnection();
        String sql = "INSERT INTO customers(name, email) VALUES(?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, c.getName());
        pstmt.setString(2, c.getEmail());
        return pstmt.executeUpdate();
    }

    public int update(Customer c) throws Exception {
        Connection conn = DBConnector.getConnection();
        String sql = "UPDATE customers SET name = ? , email = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, c.getName());
        pstmt.setString(2, c.getEmail());
        pstmt.setInt(3, c.getId());
        return pstmt.executeUpdate();
    }

    public int delete(int id) throws Exception {
        Connection conn = DBConnector.getConnection();
        String sql = "DELETE FROM customers WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }

    public Customer getById(int id) throws Exception {
        Connection conn = DBConnector.getConnection();
        String sql = "SELECT * FROM customers WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Customer c = new Customer();
        while (rs.next()) {
            c.setId(rs.getInt("id"));
            c.setName(rs.getString("name"));
            c.setEmail(rs.getString("email"));
        }
        return c;
    }
}
