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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("CT02222", 8, 20, "CT2A");
        sv.showInfo();
        sv.diemTB();
    }
    
}
