package niingg_31;

import java.util.Scanner;

public class Day69_soal3 {
    public static void main(String[] args) {
        Scanner niingg = new Scanner(System.in);

        // Label untuk infinity loop
        menuLoop: while (true) {
            // Menampilkan menu pilihan
            System.out.println("Pilihan Menu:");
            System.out.println("1. Hitung Luas Persegi");
            System.out.println("2. Hitung Luas Lingkaran");
            System.out.println("3. Hitung Luas Segitiga");
            System.out.println("4. Keluar");
            System.out.print("Masukkan angka 1-4: ");
            int pilihan = niingg.nextInt();

            switch (pilihan) {
                case 1:
                    // Hitung luas persegi
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisi = niingg.nextDouble();
                    System.out.println("Luas Persegi: " + hitungLuasPersegi(sisi));
                    break;
                case 2:
                    // Hitung luas lingkaran
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = niingg.nextDouble();
                    System.out.println("Luas Lingkaran: " + hitungLuasLingkaran(jariJari));
                    break;
                case 3:
                    // Hitung luas segitiga
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = niingg.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = niingg.nextDouble();
                    System.out.println("Luas Segitiga: " + hitungLuasSegitiga(alas, tinggi));
                    break;
                case 4:
                    // Keluar dari program
                    System.out.println("Program Selesai");
                    break menuLoop;  // Menggunakan break dengan label untuk keluar dari loop
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            
            System.out.println();  // Menambah baris kosong untuk tampilan yang rapi
        }

        niingg.close();
    }

    // Metode untuk menghitung luas persegi
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    // Metode untuk menghitung luas lingkaran
    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
  
    // Metode untuk menghitung luas segitiga
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}
