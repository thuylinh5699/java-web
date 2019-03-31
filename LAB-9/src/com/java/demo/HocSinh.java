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
public class HocSinh {

    private String maHV;
    private String name;
    private float dtk;
    private String xepLoai;

    public HocSinh() {
    }

    public HocSinh(String maHV, String name, float dtk, String xepLoai) {
        this.maHV = maHV;
        this.name = name;
        this.dtk = dtk;
        this.xepLoai = xepLoai;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDtk() {
        return dtk;
    }

    public void setDtk(float dtk) {
        this.dtk = dtk;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        boolean check1 = false;
        boolean check2 = false;
        do {
            check1 = false;
            System.out.print("Nhap ma hv: ");
            maHV = sc.nextLine();
            int len = maHV.length();
            try {
                String s1 = maHV.substring(0, 2);
                String s2 = maHV.substring(2, 5);
                int num2 = Integer.parseInt(s2);
                if (len < 5 || !s1.equals("HV")) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Loi khong nhap dung dinh dang");
                check1 = true;
            }
            if (!check1) {
                break;
            }

        } while (check1);

        System.out.print("Nhap ten: ");
        name = sc.nextLine();

        do {
            check2 = false;
            System.out.println("Nhap diem : ");
            dtk = Float.parseFloat(sc.nextLine());
            try {
                if (dtk < 1 || dtk > 10) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Loi khong nhap dung dinh dang");
                check2 = true;
            }
            if (!check2) {
                break;
            }
        } while (check2);

        if (dtk >= 8) {
            System.out.println("Gioi");
        } else if (dtk >= 6) {
            System.out.println("Kha");
        } else if (dtk >= 4) {
            System.out.println("Trung binh");
        } else if (dtk < 4) {
            System.out.println("Kem");
        }

    }
}
