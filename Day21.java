
package niingg_31;


public class Day21 {
    public static void main(String[] args) {
        // inisialisasi variabel Short
        Short cat = Short.valueOf((short) 60);
        Short butterfly = Short.valueOf((short) 70);
        Short snake = Short.valueOf((short) 80);
        Short crocodile = Short.valueOf((short) 90);
        
        // Menampilkan nilai-nilai Short
        System.out.println("MENAMPILKAN NILAI");
        System.out.println("Nilai cat: " + cat);
        System.out.println("Nilai butterfly: " + butterfly);
        System.out.println("Nilai snake: " + snake);
        System.out.println("Nilai crocodile: " + crocodile);
        
        // Membandingkan cat dan butterfly
        int comparisonResult1 = cat.compareTo(butterfly);
        int comparisonResult2 = snake.compareTo(crocodile);
        
        // Menampilkan hasil perbandingan sebagai angka
        System.out.println("HASIL PERBANDINGAN");
        System.out.println("Hasil perbandingan cat dan butterfly: " + comparisonResult1);
        System.out.println("Hasil perbandingan snake dan crocodile: " + comparisonResult2);
        
         // Menampilkan nilai maksimum dan minimum dari Short
        System.out.println("NILAI MAKSIMAL DARI Short: " + Short.MAX_VALUE);
        System.out.println("NILAI MINIMAL DARI Short: " + Short.MIN_VALUE);
        
      
    }
    
}
