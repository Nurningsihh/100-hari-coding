
package niingg_31;


public class Day52 {
    public static void main(String[] args) {
         // Deklarasi variabel
        int angka1 = 7;
        int angka2 = 10;
        int angka3 = 15;
        int nilai1 = 85;
        int nilai2 = 45;
        int nilai3 = 60;

        // Menggunakan ternary operator untuk mengecek apakah bilangan genap atau ganjil
        String jenisBilangan1 = (angka1 % 2 == 0) ? "Genap" : "Ganjil";
        String jenisBilangan2 = (angka2 % 2 == 0) ? "Genap" : "Ganjil";
        String jenisBilangan3 = (angka3 % 2 == 0) ? "Genap" : "Ganjil";

        // Output bilangan genap atau ganjil
        System.out.println("Angka " + angka1 + " adalah bilangan " + jenisBilangan1);
        System.out.println("Angka " + angka2 + " adalah bilangan " + jenisBilangan2);
        System.out.println("Angka " + angka3 + " adalah bilangan " + jenisBilangan3);

        // Menggunakan ternary operator untuk mengecek kelulusan
        String hasil1 = (nilai1 >= 60) ? "Lulus" : "Tidak Lulus";
        String hasil2 = (nilai2 >= 60) ? "Lulus" : "Tidak Lulus";
        String hasil3 = (nilai3 >= 60) ? "Lulus" : "Tidak Lulus";

        // Output status kelulusan
        System.out.println("Nilai " + nilai1 + " : " + hasil1);
        System.out.println("Nilai " + nilai2 + " : " + hasil2);
        System.out.println("Nilai " + nilai3 + " : " + hasil3);

        // Tambahan: Menentukan nilai maksimum dari dua angka
        int a = 12;
        int b = 20;
        int maksimum = (a > b) ? a : b;
        System.out.println("Nilai maksimum antara " + a + " dan " + b + " adalah " + maksimum);
    }
}
    
    

