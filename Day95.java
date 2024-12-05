
package niingg_31;

import java.util.Scanner;

public class Day95 {
    
    public static void main(String[] args) {
        Scanner ning = new Scanner (System.in);
        
        System.out.print("masukkan n: ");
        int n = ning.nextInt();
        
        System.out.println("\n membuat segitiga siku dan sebaliknya");
        for (int i = 1; i<n; i++){
            for  (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int i = n; i>= 1; i--){
            for  (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
