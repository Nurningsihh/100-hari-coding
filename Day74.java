
package niingg_31;


import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPanjang = 0; // Variabel untuk menyimpan total panjang semua kalimat

        System.out.println("Masukkan 5 kalimat (tekan Enter setelah setiap kalimat):");

        // Proses input dan hitung panjang untuk setiap kalimat tanpa menggunakan array
        for (int i = 1; i <= 5; i++) {
            System.out.print("Kalimat " + i + ": ");
            String kalimat = scanner.nextLine();  // Membaca kalimat dari pengguna
            
            int panjangKalimat = kalimat.length();  // Menghitung panjang kalimat
            totalPanjang += panjangKalimat;  // Menambah panjang kalimat ke total
            
            // Menampilkan panjang kalimat yang diinput
            System.out.println("Panjang kalimat " + i + ": " + panjangKalimat + " karakter");
            System.out.println();
        }

        // Menampilkan total panjang semua kalimat yang diinput
        System.out.println("Total panjang semua kalimat yang diinput: " + totalPanjang + " karakter");

        scanner.close();
    }
}

