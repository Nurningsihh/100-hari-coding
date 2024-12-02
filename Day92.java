
package niingg_31;

import java.util.Scanner;

public class Day92 {
    
    public static void main(String[] args) {
        
       Scanner ning =new Scanner (System.in);
     
       
        System.out.println("MEMBUAT POLA V");
        
        System.out.print("\nmasukkan angka: ");
    int n = ning.nextInt(); 
        System.out.println("\n");
    
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < 2 * n - 1; j++) { 
                if (j == i || j == (2 * n - 2 - i)) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
}
