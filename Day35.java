
package niingg_31;
import java.util.Scanner;

public class Day35 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan pertama (penjumlahan): ");
        int merah = input.nextInt();

        System.out.print("Masukkan bilangan kedua (penjumlahan): ");
        int biru = input.nextInt();

        System.out.print("Masukkan bilangan pertama (pengurangan): ");
        int hijau = input.nextInt();

        System.out.print("Masukkan bilangan kedua (pengurangan): ");
        int kuning = input.nextInt();

        // Menghitung hasil penjumlahan dan pengurangan
        int hasilPenjumlahan = merah + biru;
        int hasilPengurangan = hijau - kuning;

        // Menampilkan hasil penjumlahan dan pengurangan
        System.out.println("\nHasil Penjumlahan: " + merah + " + " + biru + " = " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hijau + " - " + kuning + " = " + hasilPengurangan);

        // Pengulangan hasil penjumlahan secara manual
        System.out.println("\nHasil penjumlahan beberapa kali:");
        System.out.println("1. " + hasilPenjumlahan);
        System.out.println("2. " + hasilPenjumlahan);
        System.out.println("3. " + hasilPenjumlahan);

        input.close();
    }
}
    

