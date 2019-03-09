/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap5;

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
       TamGiac tg = new TamGiac();
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap do dai canh a: ");
       tg.setA(sc.nextFloat());
       System.out.println("Nhap do dai canh b: ");
       tg.setB(sc.nextFloat());
       System.out.println("Nhap do dai canh c: ");
       tg.setC(sc.nextFloat());
       tg.kieuTamGiac();
       tg.showInfo();
    }
    
}
