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
public class HinhTron extends Elip {
    
    public HinhTron(int n) {
        super(n);
    }
    
    @Override
    public void dienTich() {
        float dientich = (float) (getList().get(0)*getList().get(1)*3.14);
        System.out.println("dien tich = "+dientich);
    }
}
