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
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

   public MyDate(int day, int month, int year) throws Exception {
       if(day<0 || day>31) {
           System.out.println("Lỗi nhập ngày không hợp lệ.");
       }
       if(month<0 || month>12) {
           System.out.println("Lỗi nhập tháng không hợp lệ");
       }
       if(year<0) {
           System.out.println("Lỗi nhập năm không hợp lệ");
       }
       this.day = day;
       this.month = month;
       this.year = year;
       
   }
    
   public int getDay() {
       return day;
   }
   public void setDay(int day) throws Exception {
       if(day<0 || day>31) {
           System.out.println("Lỗi nhập ngày không hợp lệ");
       }
       this.day = day;
   }
   
   public int getMonth() {
       return month;
   }
   public void setMonth(int month) throws Exception {
       if(month<0 || month>12) {
           System.out.println("Lỗi nhập tháng không hợp lệ");
       }
       this.month = month;
   }
   
   public int getYear() {
       return year;
   }
   public void setyear(int year) throws Exception {
       if(year<0) {
           System.out.println("Lỗi nhập năm không hợp lệ");
       }
       this.year = year;
   }
   
   public void nhap() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhập ngày: ");
       int day = sc.nextInt();
       System.out.println("Nhập tháng: ");
       int month = sc.nextInt();
       System.out.println("Nhâp năm: ");
       int year = sc.nextInt();
       System.out.println(" "+day+" /"+" "+month+" /"+" "+year);
       System.out.println("Ngày"+" "+day+"Tháng"+" "+month+"Năm "+" "+year);
   }
}
