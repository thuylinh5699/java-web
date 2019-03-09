/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_7;

import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class Fraction {
    private int tuSo;
    private int mauSo;

    public Fraction() {
    }

    public Fraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    
    public void input() {
      Scanner sc = new Scanner(System.in);  
        System.out.println("Nhap tu so");
      this.tuSo = sc.nextInt();
        System.out.println("Nhap mau so");
      this.mauSo = sc.nextInt();
      
    }
    
    public void print() {
        System.out.println(this.tuSo+"/"+this.mauSo); 
    }
    
    private int timUCLN() {
        while(tuSo != mauSo) {
            if(tuSo > mauSo) {
                tuSo -= mauSo;
            }
            else {
                mauSo -= tuSo;
            }
        }
        return tuSo;
    }
    
    public void toiGian() {
        int i = this.timUCLN();
        this.setTuSo(tuSo/i);
        this.setMauSo(mauSo/i);
    }
    
    public void  congPhanSo(Fraction f) {
        int tu = this.getTuSo() * f.getMauSo() + f.getTuSo() * this.getMauSo();
        int mau = this.getMauSo()  * f.getMauSo();
        Fraction phanSoTong = new Fraction(tuSo, mauSo);
        phanSoTong.toiGian();
        System.out.println("Tong 2 phan so = "+phanSoTong.tuSo+"/"+phanSoTong.mauSo);
    }
    
    public void truPhanSo(Fraction f) {
        int tuSo = this.getTuSo() * f.getMauSo() - f.getTuSo() * this.getMauSo();
        int mauSo = this.getMauSo() * f.getMauSo();
        Fraction phanSoHieu = new Fraction(tuSo, mauSo);
        phanSoHieu.toiGian();
        System.out.println("Hieu 2 phan so = "+phanSoHieu.tuSo+"/"+phanSoHieu.mauSo);
    }
    
    public void nhanPhanSo(Fraction f) {
        int tuSo = this.getTuSo() * f.getTuSo();
        int mauSo = this.getMauSo() * f.getMauSo();
        Fraction nhan = new Fraction(tuSo,mauSo);
        nhan.toiGian();
        System.out.println("Tich 2 phan so = "+nhan.tuSo+"/"+nhan.mauSo);
    }
    
    public void chiaPhanSo(Fraction f) {
        int tuSo = this.getTuSo() *  f.getMauSo();
        int mauSo = this.getMauSo() * f.getTuSo();
        Fraction chia = new Fraction(tuSo, mauSo);
        chia.toiGian();
        System.out.println("Thuong 2 phan so = "+chia.tuSo+"/"+chia.mauSo);
    }
    
    public void nghichDao(Fraction f) {
        if(this.tuSo/this.mauSo != 0) {
            if((this.getTuSo()*f.getTuSo())/(this.getMauSo()*f.getMauSo()) == 1)
                System.out.println("La phan so nghich dao");
            else
                System.out.println("Khong phai phan so nghich dao");
        }
        else
            System.out.println("Khong phai phan so nghich dao");
    }
    
    
}
