
package niingg_31;

import java.util.Scanner;
public class Day37 {
    
 public static void main(String[] args) {
        // Pengisian Nilai Awal
        int a = 10;  
        int b = 5;   

        // Menampilkan Nilai Awal
        System.out.println("Nilai awal:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Penambahan Awal
        System.out.println("\nPenambahan:");
        int penambahan = a + b;
        System.out.println("a + b = " + penambahan);

        // Input nilai baru untuk a dan b
        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan nilai baru untuk a dan b:");
        System.out.print("Nilai baru untuk a: ");
        a = input.nextInt();
        System.out.print("Nilai baru untuk b: ");
        b = input.nextInt();

        // Menampilkan Nilai Baru
        System.out.println("\nNilai baru:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Penambahan dengan nilai baru
        penambahan = a + b;
        System.out.println("\nSetelah Penambahan:");
        System.out.println("a + b = " + penambahan);

        // Pengurangan
        int pengurangan = a - b;
        System.out.println("\nSetelah Pengurangan:");
        System.out.println("a - b = " + pengurangan);

        // Penambahan dan Pengurangan Langsung
        a += 10;  
        b -= 3;   

        // Menampilkan Nilai Akhir
        System.out.println("\nNilai akhir setelah penambahan dan pengurangan langsung:");
        System.out.println("a (a + 10) = " + a);
        System.out.println("b (b - 3) = " + b);
        
        input.close();  
    }
}
