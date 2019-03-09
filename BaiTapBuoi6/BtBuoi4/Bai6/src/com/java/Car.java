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
public class Car {
    private String maker;
    private String name;

    
    public Car() {
    }

    public Car(String maker) {
        this.maker = maker;
    }
    public Car(String maker, String name) {
        this.maker = maker;
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showInfo() {
        System.out.println("Maker = "+this.maker);
        System.out.println("Name = "+this.name);
    }
    
}
 