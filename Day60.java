
package niingg_31;



public class Day60 {
    public static void main(String[] args) {
       
        // Loop pertama: Menampilkan angka ganjil dari 1 hingga 9
        int i = 1;
        System.out.println("Menampilkan angka ganjil dari 1 hingga 9:");
        do {
            System.out.println("Angka ganjil: " + i);
            i += 2;
        } while (i <= 9);

        System.out.println(); // Garis kosong untuk memisahkan output

        // Loop kedua: Menampilkan angka genap dari 2 hingga 10
        i = 2;
        System.out.println("Menampilkan angka genap dari 2 hingga 10:");
        do {
            System.out.println("Angka genap: " + i);
            i += 2;
        } while (i <= 10);

        System.out.println(); // Garis kosong untuk memisahkan output

        // Loop ketiga: Menampilkan "Ningsih" sebanyak 5 kali
        i = 1;
        System.out.println("Menampilkan 'Ningsih' sebanyak 5 kali:");
        do {
            System.out.println("Ningsih");
            i++;
        } while (i <= 5);
    }
}

    
