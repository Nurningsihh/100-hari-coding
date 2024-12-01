
package niingg_31;

import java.util.Scanner;

public class Day91 {
    public static void main(String[] args) {
        
        Scanner ning = new Scanner (System.in);
       
        while (true){
            System.out.print("masukan angka: ");
             int angka = ning.nextInt();
             
            if (angka % 2 == 0){
                System.out.println("angka yang anda masukkan genap");             
              
            }else{
                System.out.print("You ang I,end");
                break;
            }
        }
          System.out.println("");  
    }
    
}
