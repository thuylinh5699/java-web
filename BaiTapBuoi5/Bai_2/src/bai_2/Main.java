/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

/**
 *
 * @author ThuyLinh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        NhapMang nm = new NhapMang(a);
        nm.timViTriLN(a);
        nm.timViTriNN(a);
        nm.chiaHetCho3();
    }

}
