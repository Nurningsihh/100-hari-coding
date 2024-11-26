
package niingg_31;


public class Day86 {
    public static void main(String[] args) {
    
        
        int[] angka = {10, 20, 30, 40, 50};

        
        System.out.println("Cetak elemen array menggunakan perulangan for:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Elemen ke-" + i + ": " + angka[i]);
        }

        
        System.out.println("\nCetak elemen array menggunakan perulangan for-each:");
        for (int nilai : angka) {
            System.out.println("Nilai: " + nilai);
        }
        
        String[] kata = {"halo","assalamualaikum","hai"};
        
        
            System.out.println("\nCetak elemen array menggunakan perulangan for-each:");
        for (String nilai : kata) {
            System.out.println("kata: " + nilai);
        }
    }
}

    
    

