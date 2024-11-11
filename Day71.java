
package niingg_31;

public class Day71 {

    // Metode statis untuk menjumlahkan dua angka
    public static int add(int a, int b) {
        return a + b;
    }

    // Metode statis untuk mengurangi dua angka
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Metode statis untuk mengalikan dua angka
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Metode statis untuk membagi dua angka
    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // Memanggil metode statis dan menampilkan hasilnya
        System.out.println("Penjumlahan: " + add(x, y));       // Output: 15
        System.out.println("Pengurangan: " + subtract(x, y));  // Output: 5
        System.out.println("Perkalian: " + multiply(x, y));    // Output: 50
        System.out.println("Pembagian: " + divide(x, y));      // Output: 2.0

        // Coba pembagian dengan nol
        System.out.println("Pembagian dengan nol: " + divide(x, 0)); // Output: Error
    }
}

