/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Linh Duc
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số bất kỳ: ");
        int n = sc.nextInt();
        if(n<=99 || n <1000)
            System.out.println("Không hợp lệ");
        else {
            int donvi = n%10;
            n /= 10;
            int chuc = n%10;
            int tram = n/10;
            switch(tram){
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
                    System.out.print("Không hợp lệ");
                    
            }
            
            switch(chuc){
                case 0:
                    if(tram == 1 && donvi == 0)
                        System.out.print("Mot tram");
                    else
                        System.out.print("khong");
                case 1:
                    System.out.print("mot");
                    break;
                case 2:
                    System.out.print("hai");
                    break;
                case 3:
                    System.out.print("ba");
                    break;
                case 4:
                    System.out.print("bon");
                    break;
                case 5:
                    System.out.print("nam");
                    break;
                case 6:
                     System.out.print("sau");
                     break;
                case 7:
                     System.out.print("bay");
                     break;
                case 8:
                     System.out.print("tam");
                     break;
                case 9:
                     System.out.print("chin");
                     break;
                default:
                    System.out.print("Không hợp lệ");
                
            }
            
            switch(donvi) {
                
                case 0:
                    System.out.print("khong");
                case 1:
                    if(chuc == 0)
                        System.out.print(""+tram+"linh"+""+donvi);
                    else if(chuc != 0)
                         System.out.print(""+tram+""+chuc+"muoi "+donvi);
                    else
                        System.out.print("mot");
                    break;
                case 2:
                    if(chuc == 0)
                        System.out.print(""+tram+"linh"+""+donvi);
                    else if(chuc != 0)
                         System.out.print(""+tram+""+chuc+"muoi "+donvi);
                    else
                        System.out.print("hai");
                    break;
                case 3:
                    if(chuc == 0)
                        System.out.print(""+tram+"linh"+""+donvi);
                    else if(chuc != 0)
                         System.out.print(""+tram+""+chuc+"muoi "+donvi);
                    else
                         System.out.print("ba");
                    break;
                case 4:
                    if(chuc == 0)
                        System.out.print(""+tram+"linh"+""+donvi);
                    else if(chuc != 0)
                         System.out.print(""+tram+""+chuc+"muoi "+donvi);
                    else
                        System.out.print("bon");
                    break;
                case 5:
                    if(chuc == 0)
                        System.out.print(""+tram+"linh"+""+donvi);
                    else if(chuc != 0)
                         System.out.print(""+tram+""+chuc+"muoi "+donvi);
                    else
                         System.out.print("nam");
                    break;
                case 6:
                    if(chuc == 0)
                        System.out.print(""+tram+"linh"+""+donvi);
                    else if(chuc != 0)
                         System.out.print(""+tram+""+chuc+"muoi "+donvi);
                    else
                        System.out.print("sau");
                     break;
                case 7:
                    if(chuc == 0)
                        System.out.print(""+tram+"linh"+""+donvi);
                    else if(chuc != 0)
                         System.out.print(""+tram+""+chuc+"muoi "+donvi);
                    else
                        System.out.print("bay");
                     break;
                case 8:
                    if(chuc == 0)
                        System.out.print(""+tram+"linh"+""+donvi);
                    else
                        System.out.print("tam");
                     break;
                case 9:
                    if(chuc == 0)
                        System.out.print(""+tram+"linh"+""+donvi);
                    else if(chuc != 0)
                         System.out.print(""+tram+""+chuc+"muoi "+donvi);
                    else
                        System.out.print("chin");
                     break;
                default:
                    System.out.print("Không hợp lệ");
            }
        }
    }
    
}
