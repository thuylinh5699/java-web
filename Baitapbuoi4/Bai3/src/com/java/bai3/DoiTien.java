/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bai3;

import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class DoiTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tien can doi: ");
        int n = sc.nextInt();
        int h = 3000000;
        int s =0;
        if(n==100000)
            s = h/n;
            System.out.println("So cach doi tien la: "+s);
        if(n==200000)
            s = h/n;
            System.out.println("So cach doi tien là: "+s);
        if(n==500000)
            s = h/n;
            System.out.println("So cach doi tien la: "+s);
    }
}
