
package niingg_31;

import java.util.Scanner;
public class Day98 {
    public static void main(String[] args) {
       Scanner ning = new Scanner (System.in);
        System.out.print("masukkan nilai x: ");
        int x = ning.nextInt();
         System.out.print("masukkan nilai y: ");
         int y = ning.nextInt();
         int total = 0;
         
         for ( int i = x; i<= y;i++){
             if (i %2 == 0){
                 total += i;
             }
             
             
         }
         System.out.println("Total penjumlahan bilangan genap dari "+ x+ " ke "+y+" adalah: "+total);
    }
    
}
