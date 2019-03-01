/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_8;

import java.util.Scanner;

/**
 *
 * @author ThuyLinh
 */
public class Bai_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = 4;
        int m = 4;
        int[][] matrix = { 
                            {1,2,3,5},
                            {2,1,4,6},
                            {3,4,1,7},
                            {5,6,7,1},
                         };
        System.out.println("MA TRAN DUOC SINH RA");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        
        if (n != m) {
            System.out.println("Ma tran khong doi xung");    
        } else {
            int count = 0;
            boolean flag = true;
            for (int i = 1; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                     if (matrix[i][j] != matrix[j][i]) {
                        flag = false;
                        break;
                    } 
                    count++;
                }
            }
            System.out.println("================");
            System.out.println("count = " + count);
            if (flag) System.out.println("Ma tran doi xung");
            else System.out.println("Ma tran khong doi xung");
        }
        
    }
                
    
    
}
