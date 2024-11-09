
package niingg_31;

import java.util.Scanner;

public class Day69_soal1 {
    public static void main(String[] args) {
        Scanner niing = new Scanner (System.in);
        System.out.print("masukkan nilai:");
        int n = niing.nextInt();
        int total = 0;
        for (int i= 1;i<=n;i++){
            if (i % 4 !=0){
                 total += 100;
                
            }
            if (i % 4 ==0){
               total *= 2;
            }
            
        }
        System.out.println(total);
    }
    
}
