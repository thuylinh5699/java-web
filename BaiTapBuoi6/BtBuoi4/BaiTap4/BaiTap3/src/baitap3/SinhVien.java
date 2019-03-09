/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author ThuyLinh
 */
public class SinhVien {
    private boolean checkLop;
    private float dtk;
    private boolean checkNoiQuy;
    private int kiThi;

    public SinhVien() {
        
    }

    public SinhVien(boolean checkLop, float dtk, boolean checkNoiQuy, int kiThi) {
        this.checkLop = checkLop;
        this.dtk = dtk;
        this.checkNoiQuy = checkNoiQuy;
        this.kiThi = kiThi;
    }

    public boolean isCheckLop() {
        return checkLop;
    }

    public void setCheckLop(boolean checkLop) {
        this.checkLop = checkLop;
    }

    public float getDtk() {
        return dtk;
    }

    public void setDtk(float dtk) {
        this.dtk = dtk;
    }

    public boolean isCheckNoiQuy() {
        return checkNoiQuy;
    }

    public void setCheckNoiQuy(boolean checkNoiQuy) {
        this.checkNoiQuy = checkNoiQuy;
    }

    public int getKiThi() {
        return kiThi;
    }

    public void setKiThi(int kiThi) {
        this.kiThi = kiThi;
    }
    
    
    public void showInfo() {
        
    }
}
