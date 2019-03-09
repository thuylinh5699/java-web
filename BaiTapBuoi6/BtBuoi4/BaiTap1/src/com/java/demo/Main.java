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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Scanner sc = new Scanner(System.in);
       NhanVien nv = new NhanVien("Mai Thuy Linh", 20, "Nam DInh", 3000000, 300);
       NhanVien nv1 = new NhanVien("Lung Thi Linh", 20, "Nam Dinh", 3000000,100 );
       NhanVien nv2 = new NhanVien("Dao Huy Duc", 21,"Thanh Hoa", 3000000, 90);
       System.out.println("Tien Thuong la: ");
        nv.printInfo();
        nv1.printInfo();
        nv2.printInfo();
    }
    
}
