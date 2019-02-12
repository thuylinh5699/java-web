/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bai5;

import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class VeHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc chieu dai: ");
        int m = sc.nextInt();
        System.out.println("Nhap kich thuoc chieu rong: ");
        int n = sc.nextInt();
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if(i==1 || i==m || j==1 || j==n) {
                    System.out.print("*");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
