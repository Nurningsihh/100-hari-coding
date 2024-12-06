
package niingg_31;

import java.util.Scanner;
public class Day96 {
    public static void main(String[] args) {
        Scanner ning = new Scanner (System.in);
      System.out.print("Masukkan jumlah baris untuk setengah pola (tinggi): ");
        int angka= ning.nextInt();
        
      
        for (int i = 1; i <= angka; i++) {
            
            for (int j = i; j < angka; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = angka - 1; i >= 1; i--) {
            
            for (int j = angka; j > i; j--) {
                System.out.print(" ");
            }
          
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
