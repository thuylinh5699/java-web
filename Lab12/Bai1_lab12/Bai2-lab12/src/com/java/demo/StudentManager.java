/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThuyLinh
 */
public class StudentManager {
    
    List<Student> list;
    private String dir = "aaa.txt";

    public StudentManager() {
        
    }

    public StudentManager(List<Student> list) {
        this.list = new ArrayList<>();
    }
    
    
    public void add() {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("rollnumber: ");
        stu.setRollnumber(sc.nextLine());
        System.out.println("name: ");
        stu.setName(sc.nextLine());
        System.out.println("email: ");
        stu.setEmail(sc.nextLine());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = "07/06/2017";
        try {
            Date dob = formatter.parse(dateInString);
            System.out.println(dob); 
            System.out.println(formatter.format(dob));
           
        } catch (ParseException e) {
            e.printStackTrace();
        }
    
    }
    
    public Student search(String name) {
       for(Student student : list) {
           if(student.getName() == name) {
               return student;
           }
       } 
        return null;
    }
    
    public void update() {
        
    }
    
    public void remove() {
       
    }
    
    public boolean save() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir));
            oos.writeObject(this.list);
            oos.flush();
            oos.close();
        } catch (Exception e) {
           e.printStackTrace();
           return false;
        }
        return true;
    }
    
    public boolean readFile() throws ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dir));
            List<Student> data = (List<Student>) ois.readObject();
            this.list = data;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
