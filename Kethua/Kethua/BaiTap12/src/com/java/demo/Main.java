/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

/**
 *
 * @author ThuyLinh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhBinhHanh hbh = new HinhBinhHanh(2);
        hbh.chuVi();
        hbh.dienTich();
        
        HinhChuNhat hcn = new HinhChuNhat(2);
        hcn.chuVi();
        hcn.dienTich();
        
        HinhVuong hv = new HinhVuong(2);
        hv.chuVi();
        hv.dienTich();
    }
    
}
