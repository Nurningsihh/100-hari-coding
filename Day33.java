package niingg_31;


public class Day33 {
    public static void main(String[] args) {
        
     // Implicit casting (widening) - dari tipe yang lebih kecil ke yang lebih besar
        int merah = 100;
        double merahKeDouble = merah;  // Implicit casting: int ke double
        
        System.out.println("Nilai Merah (Integer): " + merah);  // Output: 100
        System.out.println("Nilai Merah (Double setelah casting): " + merahKeDouble);  // Output: 100.0
        
        // Explicit casting (narrowing) - dari tipe yang lebih besar ke yang lebih kecil
        double hijau = 9.78;
        int hijauKeInt = (int) hijau;  // Explicit casting: double ke int
        
        System.out.println("Nilai Hijau (Double): " + hijau);  // Output: 9.78
        System.out.println("Nilai Hijau (Integer setelah casting): " + hijauKeInt);  // Output: 9

        // Contoh lain explicit casting
        long biru = 100000L;
        short biruKeShort = (short) biru;  // Explicit casting: long ke short
        
        System.out.println("Nilai Biru (Long): " + biru);  // Output: 100000
        System.out.println("Nilai Biru (Short setelah casting): " + biruKeShort);  // Output: mungkin terpotong

        // Casting dari char ke int
        char kuning = 'Y';
        int kuningKeInt = (int) kuning;  // Meng-cast char ke int
        
        System.out.println("Nilai Kuning (Char): " + kuning);  // Output: Y
        System.out.println("Nilai Kuning (Integer setelah casting): " + kuningKeInt);  // Output: nilai ASCII 'Y'
        
        // Casting dari int ke char
        int ungu = 66;
        char unguKeChar = (char) ungu;  // Meng-cast int ke char
        
        System.out.println("Nilai Ungu (Integer): " + ungu);  // Output: 66
        System.out.println("Nilai Ungu (Char setelah casting): " + unguKeChar);  // Output: karakter 'B'

        // Implicit casting dalam operasi aritmatika
        byte hitam = 50;
        int hasilHitam = hitam + 10;  // Implicit casting byte ke int selama operasi aritmatika
        System.out.println("Hasil penambahan Hitam dan angka 10: " + hasilHitam);  // Output: 60
        
        // Explicit casting dalam operasi aritmatika
        int hasilPembagianWarna = (int) (hijau / 2);  // Casting hasil double menjadi int
        System.out.println("Hasil pembagian Hijau setelah casting ke int: " + hasilPembagianWarna);  // Output: 4
    }
}
    

