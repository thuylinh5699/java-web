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
public class StudentManager {
    private List<Student> sts = null;

    public StudentManager() {
        sts = new ArrayList<>();
    }

    public List<Student> getSt() {
        return sts;
    }

    public void setSt(List<Student> st) {
        this.sts = sts;
    }
    
    public boolean add(Student stud) {
        Student st;
        do {            
            System.out.println("Mời bạn nhập thông tin sinh viên");
            st = new Student();
            st.nhap();
            sts.add(st);
        } while (true);
        
    }
    
    public void search(String name) {
        for(Student st: sts) {
           if(st.getName().equals(name)) {
               System.out.println(st);
           }
        }
    }
    
    public void listStudent()  {
        for(Student item: sts) {
            System.out.println(sts.toString());
        }
    }
}
