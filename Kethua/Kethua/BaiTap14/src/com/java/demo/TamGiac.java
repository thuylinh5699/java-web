/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class TamGiac {
    private int a;
    private int b;
    private int c;

    public TamGiac() {
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public void nhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài 3 cạnh tam giác: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    }
    
    
}
