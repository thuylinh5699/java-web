/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

/**
 *
 * @author ThuyLinh
 */
public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Demo dm = new Demo(a);
        dm.print();
        dm.printTongLe();
        dm.printTongChan();
    }
}
