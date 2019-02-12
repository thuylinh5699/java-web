/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.bai4;

import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class HinhDac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do cao hinh tam giac: ");
        int h = sc.nextInt();
        for(int i=1;i<=h;i++) {
            for(int j=1;j<2*h;j++){
                if(j>=(h-i+1) && j<=(h+i-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println( );
        }
    }
}
