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
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("   QUIZ ONLINE  ");
            System.out.println("--------------------");
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            System.out.print("Enter pass: ");
            String pass = sc.nextLine();
            StudentsManager sm = new StudentsManager();
            boolean checkLogin = sm.login(email, pass);
            if(checkLogin) {
                System.out.println("LOGIN SUCCESS! PRESS ANY KEY TO START QUIZ");
            }
            else {
                System.out.println("LOGIN FAIL!");
            }
            
            
            System.out.println("YOU HAVE COMPLETED THE TEST ");
            System.out.println("DO YOU WANT TO DO IT AGAIN(Y/N): ");
            System.out.println("Question 1/10");
            QuestionsManager qm = new QuestionsManager();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
