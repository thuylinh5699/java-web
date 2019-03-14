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
public class HinhBinhHanh extends DaGiac {
    
    public HinhBinhHanh(int n) {
        super(n);
    }
    
    @Override
    public void chuVi() {
        int chuvi = (getA().get(0) + getA().get(1))*2;
        System.out.println("chu vi = "+chuvi);
    }
    
    @Override
    public void dienTich() {
        int dientich = getA().get(0) * getA().get(1);
        System.out.println("dien tich = "+dientich);
    }
}
