/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_6;

import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class Action {

    private Mang[][] arr;

    public Action() {
        this.arr = new Mang[3][3];
    }

    public Action(Mang[][] arr) {
        this.arr = arr;
    }

    public Mang[][] getArr() {
        return arr;
    }

    public void setArr(Mang[][] arr) {
        this.arr = arr;
    }

    public void nhapMang() {
        System.out.println("Nhap phan tu cua mang: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Mang m = new Mang();
                m.setX(new Scanner(System.in).nextInt());
                arr[i][j] = m;
            }
        }
    }

    public void congHang() {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                tong += i;
            }
        }
        System.out.println("Tong cac hang cua ma tran la:"+tong);
    }
    public void congCot() {
         int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                tong += j;
            }
        }
        System.out.println("Tong cac cot cua ma tran la:"+tong);
    }

    public void inMang() {
        System.out.println("Mang vua nhap la");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j].getX() + " ");
            }
            System.out.println(" ");
        }
    }

}
