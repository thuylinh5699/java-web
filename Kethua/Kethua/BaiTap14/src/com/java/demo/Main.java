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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TamGiacCan tgc = new TamGiacCan();
        tgc.nhapCanh();
        tgc.kiemTra();
        
        TamGiacDeu tgd = new TamGiacDeu();
        tgd.nhapCanh();
        tgd.kiemTra();
        
    }
    
}
