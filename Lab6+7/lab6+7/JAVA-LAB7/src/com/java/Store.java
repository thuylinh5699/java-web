/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class Store {
    private List<Product> ps= null;

    public Store() {
        ps = new ArrayList<>();
    }

    public List<Product> getPs() {
        return ps;
    }

    public void setPs(List<Product> ps) {
        this.ps = ps;
    }
    
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Product p;
        
        do {            
            System.out.println("Chọn mục cần tìm: ");
            switch(choice) {
                case 1:
                    p = new SmartPhone();
                    p.addNew();
                    ps.add(p);
                    break;
                case 2:
                    p = new Camera();
                    p.addNew();
                    ps.add(p);
                    break;
                default:
                    System.out.println("Sai cú pháp. Vui lòng chọn lại");
            }
        } while (choice <=2 && choice >=1);
    }
    
    public void listProduct() {
        for(Product item: ps) {
            System.out.println(ps.toString());
        }
    }
    
    public void search(String name) {
         for(Product p : ps){
            if(p == null)
                break;
            if(p.getName().equals(name)){
                System.out.println(p);
                return ;
            }
        }
        System.out.println("Khong tim thay");
    }
}
