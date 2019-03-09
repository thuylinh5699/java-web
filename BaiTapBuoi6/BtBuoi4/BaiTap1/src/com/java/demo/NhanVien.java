/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

/**
 *
 * @author ThuyLinh
 */
public class NhanVien {
    private String name;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongGioLam;

    public NhanVien() {
    }

    public NhanVien(String name, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.name = name;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
    
    public double tinhThuong(int tongGioLam, double tienLuong) {
        double thuong = 0;
        if(tongGioLam >= 200)
            thuong = tienLuong*20/(double)100;
        else if(tongGioLam<200 && tongGioLam>=100)
            thuong = tienLuong*10/100;
        else if(tongGioLam<100)
            thuong = 0;
        return thuong;
    }
    
    public void printInfo() {
        double thuong = tinhThuong(tongGioLam, tuoi);
        System.out.println("Ho va ten: "+name);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Tien luong: "+tienLuong);
        System.out.println("Tong gio lam: "+tongGioLam);
        System.out.println("Thuong = "+thuong);
    }
}
