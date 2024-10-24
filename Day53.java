
package niingg_31;


public class Day53 {
     public static void main(String[] args) {
         // menginisialisasi 2 varriabel dengan 0
        int totalGenap = 0;
        int totalGanjil = 0;

        // Loop for untuk mencetak bilangan 1 sampai 10
        System.out.println("Bilangan dari 1 sampai 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Angka: " + i);
            
            // Mengecek apakah bilangan genap atau ganjil
            if (i % 2 == 0) {
                totalGenap += i;
            } else {
                totalGanjil += i;
            }
        }

        // Mencetak total bilangan genap dan ganjil dari 1 sampai 10
        System.out.println("\nTotal jumlah bilangan genap: " + totalGenap);
        System.out.println("Total jumlah bilangan ganjil: " + totalGanjil);
        
        int totalBilangan = totalGenap + totalGanjil; // Total keseluruhan bilangan
        System.out.println("Total keseluruhan bilangan dari 1 sampai 10: " + totalBilangan);
    
}
}
