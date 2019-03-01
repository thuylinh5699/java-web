/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

/**
 *
 * @author ThuyLinh
 */
public class Demo {

    private int[] value;

    public Demo() {
        this.value = new int[5];
    }

    public Demo(int[] value) {
        this.value = value;
    }

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = value;
    }

    public int tinhTong(int[] value) {
        int tong = 0;
        for (int i = 0; i < 5; i++) {
            tong = tong + this.value[i];
        }
        return tong;
    }

    public void print() {
        int tong = tinhTong(value);
        for (int i = 0; i < 5; i++) {
            System.out.print(this.value[i] + " ");
        }
        System.out.println("Tổng = " + tong);
    }

    public int kTraSoLe(int[] value) {
        int tong = 0;
        for (int i = 0; i < 5; i++) {
            if (this.value[i] % 2 != 0) {
                tong = tong + this.value[i];
            }
        }
        return tong;
    }

    public void printTongLe() {
        int tong1 = kTraSoLe(value);
        System.out.println("Tổng = " + tong1);
    }

    public int tongSoChan(int[] value) {
        int tong = 0;
        for (int i = 0; i < 5; i++) {
            if (this.value[i] % 2 == 0) {
                tong = tong + this.value[i];
            }
        }
        return tong;
    }

    public void printTongChan() {
        int tong2 = tongSoChan(value);
        System.out.println("Tổng = " + tong2);

    }

}
