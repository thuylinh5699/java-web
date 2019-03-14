/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author ThuyLinh
 */
public class DaGiac {
   private List<Integer> a = new ArrayList<>();

    public DaGiac(int n) {
        System.out.println("Nhap cac canh: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n;i++) {
            System.out.print("Nhap vao canh thu: "+i);
            a.add(sc.nextInt());
        }
    }
    
    public void chuVi() {
        
    }
    
    public void dienTich() {
        
    }

    public List<Integer> getA() {
        return a;
    }

    public void setA(List<Integer> a) {
        this.a = a;
    }
   
    
}
