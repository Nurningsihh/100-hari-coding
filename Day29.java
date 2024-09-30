
package niingg_31;

import java.math.BigInteger; // Tambahkan ini untuk mengimpor BigInteger

public class Day29 {
    public static void main(String[] args) {
        //tipe data reference BigInteger
        // Inisialisasi beberapa BigInteger
        BigInteger apel = new BigInteger("100000000000000000000"); 
        BigInteger jeruk = new BigInteger("250000000000000000000"); 
        BigInteger mangga = new BigInteger("500000000000000000000"); 

        // Menampilkan nilai awal
        System.out.println("Nilai apel: " + apel);
        System.out.println("Nilai jeruk: " + jeruk);
        System.out.println("Nilai mangga: " + mangga);

        // Operasi Penjumlahan
        BigInteger penjumlahan = apel.add(jeruk);
        System.out.println("Penjumlahan apel dan jeruk: " + penjumlahan);

        // Operasi Pengurangan
        BigInteger pengurangan = jeruk.subtract(apel);
        System.out.println("Pengurangan jeruk dan apel: " + pengurangan);

        // Operasi Perkalian
        BigInteger perkalian = apel.multiply(mangga);
        System.out.println("Perkalian apel dan mangga: " + perkalian);

        // Operasi Pembagian
        BigInteger pembagian = jeruk.divide(apel);
        System.out.println("Pembagian jeruk dengan apel: " + pembagian);

        // Operasi Sisa Pembagian (Modulo)
        BigInteger sisaPembagian = jeruk.remainder(apel);
        System.out.println("Sisa Pembagian jeruk dengan apel: " + sisaPembagian);

        // Operasi Perpangkatan
        BigInteger pangkat = apel.pow(2); // apel pangkat 2
        System.out.println("apel pangkat 2: " + pangkat);

        // Menghitung Faktorial dari 5 tanpa loop
        BigInteger faktorial = new BigInteger("120"); // 5! = 120
        System.out.println("Faktorial dari 5 adalah: " + faktorial);

        // Menjumlahkan beberapa BigInteger
        BigInteger total = apel.add(jeruk).add(mangga);
        System.out.println("Total dari apel, jeruk, dan mangga: " + total);

        // Mengalikan semua BigInteger
        BigInteger totalPerkalian = apel.multiply(jeruk).multiply(mangga);
        System.out.println("Total Perkalian dari apel, jeruk, dan mangga: " + totalPerkalian);
    }
        
    }
    

