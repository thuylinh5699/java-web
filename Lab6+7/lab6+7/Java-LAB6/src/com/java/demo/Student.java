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
public class Student {
    private String name;
    private String email;
    private int age;

    public Student() {
    }

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");
        setName(sc.nextLine());
        System.out.println("Nhập vào email: ");
        setEmail(sc.nextLine());
        System.out.println("Nhập vào tuổi: ");
        setAge(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", age=" + age + '}';
    }
    
    
}
