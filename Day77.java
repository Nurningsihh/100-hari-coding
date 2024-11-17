
package niingg_31;

import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        
        String nama1 = "Ningsih";
        String nama2 = "ningsih";
        String nama3 = "Ningsih";

        
        System.out.println("nama1.equals(nama2): " + nama1.equals(nama2)); 
        System.out.println("nama1.equals(nama3): " + nama1.equals(nama3)); 

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String namaInput = scanner.nextLine();

        System.out.println("nama1.equals(namaInput): " + nama1.equals(namaInput));

        
        String nama4 = "D0222323";
        System.out.println("Apakah 'D0222323'.equals(nama4): " + "D0222323".equals(nama4)); 

      
        String nama5 = "ningsih ";
        System.out.println("nama2.equals(nama5): " + nama2.equals(nama5)); 
    }
}

