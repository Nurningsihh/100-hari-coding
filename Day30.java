
package niingg_31;

import java.math.BigDecimal;
import java.math.MathContext;
public class Day30 {
    public static void main(String[] args) {
          // Membuat objek BigDecimal dengan variabel nama hewan
        BigDecimal kucing = new BigDecimal("12345.678901234567890123456789");
        BigDecimal anjing = new BigDecimal("98765.432109876543210987654321");
        BigDecimal burung = new BigDecimal("4567.890123456789012345678901");
        BigDecimal ikan = new BigDecimal("87654.321098765432109876543210");

       // mencetak nilai masing-masing variabel
        System.out.println("Kucing: " + kucing);
        System.out.println("Anjing: " + anjing);
        System.out.println("Burung: " + burung);
        System.out.println("Ikan: " + ikan);

        // Penjumlahan kucing dan anjing
        BigDecimal penjumlahan = kucing.add(anjing);
        System.out.println("Hasil Penjumlahan (Kucing + Anjing): " + penjumlahan);

        // Pengurangan burung dari ikan
        BigDecimal pengurangan = ikan.subtract(burung);
        System.out.println("Hasil Pengurangan (Ikan - Burung): " + pengurangan);

        // Perkalian kucing dan burung
        BigDecimal perkalian = kucing.multiply(burung);
        System.out.println("Hasil Perkalian (Kucing * Burung): " + perkalian);

        // Pembagian anjing dengan ikan
        BigDecimal pembagian = anjing.divide(ikan, MathContext.DECIMAL128);
        System.out.println("Hasil Pembagian (Anjing / Ikan): " + pembagian);
    }

           
    
}
