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
public class TamGiacCan extends TamGiac{
    
        public TamGiacCan() {
           
        }
        @Override
        public void nhapCanh() {
            Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài 3 cạnh tam giác: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        }
        public void kiemTra() {
            if(this.getA()==this.getB()) {
                System.out.println("Tam giac can");
            }
            if(this.getB() == this.getC()) {
                System.out.println("Tam giac can");
            }
            if(this.getA() == this.getC()) {
                System.out.println("Tam giac can");
            }
            else {
                System.out.println("Khong phai tam giac can");
            }
        }
    
}
