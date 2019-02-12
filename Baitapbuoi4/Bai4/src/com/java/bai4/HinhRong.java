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
public class HinhRong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do cao hinh tam giac: ");
        int h = sc.nextInt();
        int k = h-1;
        for(int i=0;i<h-1;i++) {
          for(int j=0;j<2*h-1;j++){
              if(j==k-i || j==k+i)
                  System.out.print("*");
              else
                  System.out.print(" ");
          }
            System.out.println( );
        }
        for(int i=0;i<2*h-1;i++){
            System.out.print("*");
        }
    }
}
