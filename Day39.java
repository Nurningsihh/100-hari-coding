
package niingg_31;
import java.util.Scanner;

public class Day39 {
      public static void main(String[] args) {
        // Membuat objek scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Variabel untuk menyimpan nilai yang akan diisi
        int upin, ipin, cumi, cama;

        // Mengambil input dari pengguna untuk angka pertama (upin)
        System.out.print("Masukkan angka untuk Upin: ");
        upin = input.nextInt(); 

        // Mengambil input dari pengguna untuk angka kedua (ipin)
        System.out.print("Masukkan angka untuk Ipin: ");
        ipin = input.nextInt(); 

        // Operator penugasan untuk pengisian upin ke variabel cumi
        cumi = upin;
        System.out.println("Hasil pengisian Upin ke Cumi: " + cumi);

        // Menggunakan operator modulo dan penugasan
        cama = upin % ipin; 
        System.out.println("Hasil dari Upin % Ipin adalah: " + cama);

        // Memberikan contoh lain dari operator penugasan
        cumi += ipin; 
        System.out.println("Setelah penugasan +=, Cumi menjadi: " + cumi);

        // Operator penugasan dengan modulo dan penugasan
        cama %= upin; 
        System.out.println("Setelah penugasan %=, Cama menjadi: " + cama);

        
        input.close();
    }
}
    

