/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author ThuyLinh
 */
public class SinhVien {
    private String mSV;
    private float dtb;
    private int tuoi;
    private String lop;

    public SinhVien() {
        
    }

    public SinhVien(String mSV, float dtb, int tuoi, String lop) {
        this.mSV = mSV;
        this.dtb = dtb;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getmSV() {
        return mSV;
    }

    public void setmSV(String mSV) {
        this.mSV = mSV;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void diemTB() {
        
        if(this.dtb>=8)
            System.out.println("Sinh vien duoc hoc bong");
        else 
            System.out.println("Sinh vien khong duoc hoc bong");
            
    }
    public void showInfo() {
        System.out.println("Ma sinh vien: "+mSV);
        System.out.println("Diem trung binh: "+dtb);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Lop: "+lop);
        
        
    }
    
}
