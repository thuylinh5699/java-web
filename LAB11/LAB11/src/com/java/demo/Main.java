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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CustomerManager cm = new CustomerManager();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1. Load");
            System.out.println("2. Add");
            System.out.println("3. Search");
            System.out.println("4. Save");
            System.out.println("5. Exit");
            System.out.print("choose?");
            int c = Integer.parseInt(sc.nextLine());
            switch(c) {
                case 1:
                    System.out.print("File Path");
                    String path = sc.nextLine();
                    if(cm.load(path)) { 
                        System.out.println("Successful");
                    }
                    else {
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    cm.add();
                    break;
                case 3:
                    System.out.print("Id");
                    int id = Integer.parseInt(sc.nextLine());
                    Customer cus = cm.search(id);
                    if(cus != null) {
                        System.out.println(cus);
                    }
                    else {
                        System.out.println("Not found");
                    }
                    break;
                case 4:
                    if(cm.save()) {
                        System.out.println("Successful");
                    }
                    else{
                        System.out.println("Error");
                    }
                    break;   
                case 5:
                default:  
                    System.out.println("Not valid");
            }
        }
    }
    
}
