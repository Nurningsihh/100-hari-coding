
package niingg_31;


public class Day50 {
     public static void main(String[] args) {
        String kategoriPelanggan = "Gold";  // Ubah kategori untuk menguji kondisi lainnya
        double totalBelanja = 200000;       // Total belanja pelanggan
        double diskon = 0;
        
        // Menghitung diskon berdasarkan kategori pelanggan
        if (kategoriPelanggan.equals("Platinum")) {
            diskon = totalBelanja * 0.20;  // 20% diskon untuk pelanggan Platinum
            System.out.println("Kategori Pelanggan: Platinum");
        } else if (kategoriPelanggan.equals("Gold")) {
            diskon = totalBelanja * 0.15;  // 15% diskon untuk pelanggan Gold
            System.out.println("Kategori Pelanggan: Gold");
        } else if (kategoriPelanggan.equals("Silver")) {
            diskon = totalBelanja * 0.10;  // 10% diskon untuk pelanggan Silver
            System.out.println("Kategori Pelanggan: Silver");
        } else if (kategoriPelanggan.equals("Bronze")) {
            diskon = totalBelanja * 0.05;  // 5% diskon untuk pelanggan Bronze
            System.out.println("Kategori Pelanggan: Bronze");
        } else {
            System.out.println("Tidak ada diskon untuk kategori pelanggan ini.");
        }

        // Menampilkan hasil akhir
        double totalSetelahDiskon = totalBelanja - diskon;
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total Setelah Diskon: Rp " + totalSetelahDiskon);
    }
}
    
 
