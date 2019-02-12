/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.util.Scanner;

/**
 *
 
 */
public class Bai1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập vào một số bất kỳ");
        int n = sc.nextInt();
        
       if(n<10 || n>99)
            System.out.println("Không hợp lệ");
       else {
           int donvi = n%10;
           n /= 10;
           int chuc = n/10;
            switch (chuc) {
                case 1:
                    if(donvi == 0)
                        System.out.print("Muoi");
                    else
                        System.out.print("Mot");
                    break;
                case 2:
                    System.out.print("Hai");
                    break;
                case 3:
                    System.out.print("Ba");
                    break;
                case 4:
                    System.out.print("Bon");
                    break;
                case 5:
                    System.out.print("Nam");
                    break;
                case 6:
                    System.out.print("Sau");
                    break;
                case 7:
                    System.out.print("Bay");
                    break;
                case 8:
                    System.out.print("Tam");
                    break;
                case 9:
                    System.out.print("Chin");
                    break;
                default:
                    System.out.print("nhập sai");
            }
            switch (donvi) {
                case 0:
                    if(chuc == 1)
                        System.out.print("Muoi");
                    else
                        System.out.print("muoi");
                    break;
                case 1:
                    System.out.print("Mot");
                    break;
                case 2:
                    System.out.print("Hai");
                    break;
                case 3:
                    System.out.print("Ba");
                    break;
                case 4:
                    System.out.print("Bon");
                    break;
                case 5:
                    System.out.print("Nam");
                    break;
                case 6:
                    System.out.print("Sau");
                    break;
                case 7:
                    System.out.print("Bay");
                    break;
                case 8:
                    System.out.print("Tam");
                    break;
                case 9:
                    System.out.print("Chin");
                    break;
                default:
                    System.out.print("nhập sai");
            }
        }
       
    }
    
}
