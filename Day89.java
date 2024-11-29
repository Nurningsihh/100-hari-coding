
package niingg_31;

import java.util.Scanner;
public class Day89 {
    public static void main(String[] args) {
        
 Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih perhitungan luas:");
        System.out.println("1. Lingkaran");
        System.out.println("2. Jajar Genjang");
        System.out.println("3. Trapesium");
        
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt();
        
        if (pilihan == 1) {
            // Menghitung luas lingkaran
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = scanner.nextDouble();
            double luas = 3.14159 * Math.pow(jariJari, 2);
            System.out.printf("Luas lingkaran dengan jari-jari %.2f adalah %.2f\n", jariJari, luas);
        
        } else if (pilihan == 2) {
            // Menghitung luas jajar genjang
            System.out.print("Masukkan panjang alas jajar genjang: ");
            double panjang = scanner.nextDouble();
            System.out.print("Masukkan tinggi jajar genjang: ");
            double tinggi = scanner.nextDouble();
            double luas = panjang * tinggi;
            System.out.printf("Luas jajar genjang dengan panjang %.2f dan tinggi %.2f adalah %.2f\n", panjang, tinggi, luas);
        
        } else if (pilihan == 3) {
            // Menghitung luas trapesium
            System.out.print("Masukkan sisi atas trapesium: ");
            double sisiAtas = scanner.nextDouble();
            System.out.print("Masukkan sisi bawah trapesium: ");
            double sisiBawah = scanner.nextDouble();
            System.out.print("Masukkan tinggi trapesium: ");
            double tinggi = scanner.nextDouble();
            double luas = 0.5 * (sisiAtas + sisiBawah) * tinggi;
            System.out.printf("Luas trapesium dengan sisi atas %.2f, sisi bawah %.2f, dan tinggi %.2f adalah %.2f\n", sisiAtas, sisiBawah, tinggi, luas);
        
        } else {
            System.out.println("Pilihan tidak valid, silakan coba lagi.");
        }
        
        
    }
}
