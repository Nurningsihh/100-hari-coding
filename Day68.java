package niingg_31;

public class Day68 {

    // untuk menjumlahkan dua angka
    public int tambah(int a, int b) {
        return a + b;
    }

    //  untuk mengurangi dua angka
    public int kurang(int a, int b) {
        return a - b; 
    }

    //  untuk mengalikan dua angka
    public int kali(int a, int b) {
        return a * b; 
    }

    //  untuk membagi dua angka
    public int bagi(int a, int b) {
        if (b != 0) { 
            return a / b; 
        } else {
            System.out.println("Error: Pembagi tidak boleh nol.");
            return 0; 
        }
    }

    public static void main(String[] args) {
        Day68 contoh = new Day68();

        // Mencetak hasil operasi matematika
        System.out.println("Penjumlahan 3 + 4 = " + contoh.tambah(3, 4)); 
        System.out.println("Pengurangan 10 - 4 = " + contoh.kurang(10, 4)); 
        System.out.println("Perkalian 5 * 6 = " + contoh.kali(5, 6)); 
        System.out.println("Pembagian 8 / 2 = " + contoh.bagi(8, 2)); 
        System.out.println("Pembagian 8 / 0 = " + contoh.bagi(8, 0));
    }
}
