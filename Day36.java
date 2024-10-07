
package niingg_31;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
    // Menerima input integer
        System.out.print("Masukkan input: ");
        int a = input.nextInt();

        // Mengonversi bilangan desimal ke biner menggunakan angka pengganti
        String b = "";
        b += (a / 1000) % 2;  
        b += (a / 500) % 2;   
        b += (a / 250) % 2;   
        b += (a / 125) % 2;   
        b += (a / 60) % 2;    
        b += (a / 30) % 2;    
        b += (a / 15) % 2;    
        b += a % 2;     

        // Menampilkan hasil konversi biner
        System.out.println("Hasil konversi ke biner dengan angka pengganti: " + b);

        // Menerima input bilangan kedua untuk menghitung 77%
        System.out.print("Masukkan bilangan kedua untuk menghitung 77%: ");
        int c = input.nextInt();

        // Menghitung 77% dari input kedua
        double hasil = c * 0.77;
        System.out.println("77% dari " + c + " adalah: " + hasil);

        input.close();
    }
}
