/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class CustomerManager {
    
    private String dir = "cust.dat" ;
    private List<Customer> list;

    public CustomerManager(List<Customer> list) {
        this.list = new ArrayList<>();
    }

    CustomerManager() {
        
    }

    
    
    
    public boolean load(String file) { //load dữ liệu từ file
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            List<Customer> data = (List<Customer>) ois.readObject();
            this.list = data;
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }
        return true;
    }
    
    public void add() { //nhập dữ liệu
        //1. nhập dữ liệu
        //2. nhập dữ liệu vào trong list
        Scanner sc = new Scanner(System.in);
        Customer cus = new Customer();
        System.out.println("nhap id:");
        cus.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("nhap name:");
        cus.setName(sc.nextLine());
        System.out.println("nhap address:");
        cus.setAddress(sc.nextLine());
        System.out.println("nhap age:");
        cus.setAge(Integer.parseInt(sc.nextLine()));
        this.list.add(cus);
    }
    
    public Customer search(int id) { //tìm kiếm theo id
        for(Customer customer : list) {
            if(customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
    
    public boolean save() { //lưu lại thông tin
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir));
            oos.writeObject(this.list);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }
        return true;
    }
}
