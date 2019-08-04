/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.model;

import com.java.bean.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.catalina.connector.Connector;

/**
 *
 * @author ThuyLinh
 */
public class SinhVienModel {
    public List<SinhVien> getAll() throws SQLException {
        List<SinhVien> list = new ArrayList<>();
        Connection conn = Connector.getConnection();
         String sql = "SELECT * FROM sinhvien";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            SinhVien s = new SinhVien();
            s.setId(rs.getInt("id"));
            s.setHoten(rs.getString("hoten"));
            s.setDiem(rs.getString("diem"));
            list.add(s);
        }
        return list;
    }
    
    public int add(Student s) throws Exception {
        Connection conn = Connector.getConnection();
        String sql = "INSERT INTO students(hoten, diem) VALUES(?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, s.getHoTen());
        pstmt.setString(2, s.getDiem());
        return pstmt.executeUpdate();
    }
    
    public int update(SinhVien s) throws Exception {
        Connection conn = Connector.getConnection();
        String sql = "UPDATE sinhvien SET hoten = ?, diem = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, s.getHoten());
        pstmt.setString(2, s.getDiem());
        
        pstmt.setInt(4, s.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws Exception {
        Connection conn = Connector.getConnection();
        String sql = "DELETE FROM students WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    }
}
