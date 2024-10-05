
package niingg_31;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        
     // Buat scanner
        Scanner input = new Scanner(System.in);

        // Masukkan nama
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        // Masukkan usia
        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        // Masukkan tinggi badan
        System.out.print("Masukkan tinggi badan Anda (dalam cm): ");
        double tinggiBadan = input.nextDouble();

        // Kosongkan buffer
        input.nextLine(); // tangkap newline karakter setelah nextDouble

        // Masukkan kota asal
        System.out.print("Masukkan kota asal Anda: ");
        String kotaAsal = input.nextLine();

        // Tampilkan hasil
        System.out.println("\n==== Informasi Anda ====");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Tinggi badan: " + tinggiBadan + " cm");
        System.out.println("Kota asal: " + kotaAsal);

        // Tutup scanner
        input.close();
        
}
    
}
