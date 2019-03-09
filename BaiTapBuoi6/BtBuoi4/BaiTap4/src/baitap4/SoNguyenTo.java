/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author ThuyLinh
 */
public class SoNguyenTo {
    private int a;

    public SoNguyenTo() {
    }

    public SoNguyenTo(int a) {
        this.a = a;
    }
    boolean isSoNguyenTo(int x){
        if(x<2){
            System.out.println("Khong phai snt");
        }
        for(int i = 2; i<=Math.sqrt(x);i++) {
            if(x%i ==0 )
                System.out.println("khong phai snt");
            else
                System.out.println("la snt");
        }
        return isSoNguyenTo(x);
    }
    int timSoNguyenToTiepTheo(int b) {
        if(b<2) {
            return 0;
        }
        for(int i = 0;i<Math.sqrt(b);i++) {
            if(b%i == 0)
                return 0;
            return 1;
        }
        return timSoNguyenToTiepTheo(b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void showInfo() {
        System.out.println("");
    }
}
