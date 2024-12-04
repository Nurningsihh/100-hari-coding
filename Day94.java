
package niingg_31;

import java.util.Scanner;

public class Day94 {
    
    
    public static void main(String[] args) {
        
        Scanner ning = new Scanner (System.in);
        
        System.out.println("membuat  Asterisk Pattern : Segitiga ");
        
        System.out.print("masukkan tinggi segitiga: ");  
        
  int tinggi = ning.nextInt(); 

        System.out.println("\n");
        for (int i = 1; i <= tinggi; i++) {
            
            for (int j = 1; j <= tinggi - i; j++) {
                
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            
            System.out.println(); 
        }
    }
}
