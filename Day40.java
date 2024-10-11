
package niingg_31;

public class Day40 {
    // Method untuk membandingkan dua angka (jumlah buah) dan mencetak hasilnya
    public static void bandingkanJumlah(int apel, int jeruk) {
        // Menggunakan operator ternary dan langsung mencetak hasil
        System.out.println((apel > jeruk) ? ("Apel lebih banyak dari Jeruk") :
                           (apel < jeruk) ? ("Apel lebih sedikit dari Jeruk") :
                           ("Apel sama banyak dengan Jeruk"));
    }

    public static void main(String[] args) {
        // Deklarasi beberapa jumlah buah untuk dibandingkan
        int apel = 40;
        int jeruk = 60;
        int pisang = 25;
        int mangga = 40;
        int anggur = 80;
        int nanas = 15;

        // Membandingkan jumlah buah satu per satu
        System.out.println("Perbandingan antara apel dan jeruk:");
        bandingkanJumlah(apel, jeruk);  

        System.out.println("Perbandingan antara pisang dan apel:");
        bandingkanJumlah(pisang, apel);  

        System.out.println("Perbandingan antara apel dan mangga:");
        bandingkanJumlah(apel, mangga);  

        System.out.println("Perbandingan antara anggur dan pisang:");
        bandingkanJumlah(anggur, pisang);  

        System.out.println("Perbandingan antara nanas dan jeruk:");
        bandingkanJumlah(nanas, jeruk);  

        System.out.println("Perbandingan antara apel dan anggur:");
        bandingkanJumlah(apel, anggur);  

        System.out.println("Perbandingan antara pisang dan nanas:");
        bandingkanJumlah(pisang, nanas);  
        System.out.println("Perbandingan antara anggur dan mangga:");
        bandingkanJumlah(anggur, mangga);  

        System.out.println("Perbandingan antara jeruk dan nanas:");
        bandingkanJumlah(jeruk, nanas); 
    }
}
    

