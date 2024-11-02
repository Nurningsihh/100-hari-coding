
package niingg_31;

import java .util .Scanner;
public class Day62 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan nomor hari (1-7): ");
        int nomorHari = input.nextInt();

        
        String namaHari;
        switch (nomorHari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Nomor hari tidak valid";
                break;
        }

       
        System.out.println("Hari ini adalah hari: " + namaHari);
        int batasAtas = 10;
         for (int i = 1; i <= batasAtas; i++) {
            // Menampilkan iterasi saat ini
            System.out.println("Iterasi ke-" + i + ": Memeriksa angka " + i);

            // Cek jika angka adalah 7
            if (i == 7) {
                System.out.println("Angka 7 ditemukan, menghentikan loop.");
                break; // Menghentikan loop jika angka 7 ditemukan
            }
        
       
         }
     }
}

    

