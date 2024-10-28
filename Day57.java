
package niingg_31;

public class Day57 {
    public static void main(String[] args) {
        
          int i = 1;
        int sum = 0; 
        int count = 0; 

        System.out.println("Mencetak angka dari 1 hingga 10 dan menghitung jumlah serta rata-rata:");

        
        // Loop while untuk mencetak angka dari 1 hingga 10
        while (i <= 10) {
            System.out.println("Angka: " + i); 
            sum += i;
            count++; 
            i++; 
        }

        // Menghitung rata-rata 
        double average = (double) sum / count;

        // Mencetak hasil
        System.out.println("Jumlah total: " + sum); 
        System.out.println("Jumlah angka yang dicetak: " + count); 
        System.out.println("Rata-rata: " + average); 
    }
    }
    

