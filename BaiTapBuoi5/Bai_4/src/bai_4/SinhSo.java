/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4;

import java.util.Random;

/**
 *
 * @author ThuyLinh
 */
public class SinhSo {

    Random rd = new Random();
    private Mang[] arr;

    public SinhSo() {
        arr = new Mang[15];
    }

    public void nhapMang() {
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < arr.length; i++) {
            Mang m = new Mang();
            m.setX(rd.nextInt(100));
            arr[i] = m;
        }
    }

    public void inMang() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getX() + " ");
        }
    }

    public void tangDan() {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i].getX() > arr[j].getX()) {
                    temp = arr[i].getX();
                    arr[i].setX(arr[j].getX());
                    arr[j].setX(temp);
                }
            }
        }
    }   
    
    public void giamDan() {
        int temp;
        for(int i = 0;i<arr.length;i++) {
            for(int j = i+1;j<arr.length-1;j++) {
                if(arr[i].getX()<arr[j].getX()){
                    temp = arr[i].getX();
                    arr[i].setX(arr[j].getX());
                    arr[j].setX(temp);
                }
            }
        }
                
    }

}
