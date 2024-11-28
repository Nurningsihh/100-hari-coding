
package niingg_31;


import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        Scanner ning = new Scanner (System.in);
        System.out.print("masukkan kata (dengan atau tanpa spasi di awal/akhir): ");
        String kata = ning.nextLine();
        String trimmedInput = kata.trim();
        System.out.println("Kata setelah di-trim: " + trimmedInput);
        
       
    }
    
}
