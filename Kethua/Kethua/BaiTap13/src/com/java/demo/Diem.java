/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class Diem {
    private List<Integer> list = new ArrayList<>();

    public Diem(int n) {
        System.out.println("Nhập các điểm: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n;i++) {
            System.out.print("Nhap vao điểm thu: "+i);
            list.add(sc.nextInt());
        }
    }
    public void dienTich() {
        
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
    
}
