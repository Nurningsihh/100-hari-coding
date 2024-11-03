
package niingg_31;

import java.util.Scanner;
public class Day63 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menampilkan Hanya Angka Genap Positif");
        System.out.println("Masukkan angka negatif untuk keluar dari program.");

        while (true) {
            System.out.print("Masukkan sebuah angka: ");
            int number = scanner.nextInt();

           
            if (number < 0) {
                System.out.println("Angka negatif terdeteksi, program berhenti.");
                break;
            }

       
            if (number == 0 || number % 2 != 0) {
                System.out.println("Angka bukan genap positif, melewati...");
                continue;
            }

           
            System.out.println("Angka genap positif: " + number);
        }

        scanner.close();
        System.out.println("Program selesai.");
    }
}
