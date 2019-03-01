/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3;

import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class Action {
    
    private Mang[] arr;


    public Action() {
        arr = new Mang[5];
    }
    
    public void nhapMang() {
       
        for (int i=0; i<arr.length; i++) {
            System.out.print("Nhap doi tuong Mang thu : " + (i+1));
            Mang m = new Mang();
            m.setX(new Scanner(System.in).nextInt());
            arr[i] = m;
        }
    }
    
    public void inMang() {
        System.out.print("Mang vua nhap la : ");
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i].getX() + " ");
        }
    }
//    public void timKiem() {
//        int a = new Scanner(System.in).nextInt();
//        for(int i=0;i<arr.length;i++) {
//            if(arr[i] == a)
//                System.out.println("Số nguyên"+a+"có trong mảng");
//            else
//                System.out.println("Số nguyên"+a+"không có trong mảng.");
//            
//        }
//    }
    
   
}
