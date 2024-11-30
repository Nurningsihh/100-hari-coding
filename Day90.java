
package niingg_31;

import java.util.Scanner;

public class Day90 {
    public static void main(String[] args) {
        Scanner ning = new Scanner (System.in);
        System.out.print("masukkan angka: ");
        int angka = ning.nextInt();
        
        for ( int i = 0;i< angka;i++){
            for (int j = 0; j<angka; j++){
                  if ((i + j) % 2 == 0) { 
                    System.out.print("X ");
                } else { 
                    System.out.print("O ");
                }
            }
            System.out.println("");
        }
    }
    
}
