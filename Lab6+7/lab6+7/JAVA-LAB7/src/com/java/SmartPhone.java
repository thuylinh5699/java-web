/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class SmartPhone extends Product {
    private boolean hasCamera;
    private int sim;

    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
    
    @Override
    public void addNew() {
       super.addNew();
       Scanner sc = new Scanner(System.in);
       System.out.println("Kiểm tra có camera hay không?");
       int check = sc.nextInt();
       if(check == 1) {
           hasCamera = true;
       }
       else {
           hasCamera = false;
       }
        
    }

    @Override
    public String toString() {
        return super.toString() + "SmartPhone{" + "hasCamera=" + hasCamera + ", sim=" + sim + '}';
    }
    
    
}
