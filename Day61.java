
package niingg_31;


public class Day61 {
    
    public static void main(String[] args) {
      
         int i = 0;
        boolean isNingsih = true; // Menjaga agar loop selalu berjalan
        while (isNingsih) { // Kondisi selalu true karena isNingsih selalu benar
            System.out.println("Ya benar, saya adalah Ningsih: i = " + i); // Mengubah output
            i++; // i selalu bertambah positif

            // Menambahkan beberapa pesan tambahan
            if (i % 5 == 0) {
                System.out.println("Nilai i sekarang adalah kelipatan 5: " + i);
            }

            // Cetak pesan ketika i mencapai 10
            if (i == 10) {
                System.out.println("Nilai i telah mencapai 10.");
            }

            // Cetak pesan ketika i mencapai 20
            if (i == 20) {
                System.out.println("Nilai i telah mencapai 20.");
            }

            // Menampilkan pesan setiap 3 iterasi
            if (i % 3 == 0) {
                System.out.println("Ini adalah iterasi ke-" + i);
            }

            // Tambahkan pemisah output
            System.out.println("-----"); // Pemisah untuk kejelasan output

            // Menambahkan jeda sederhana tanpa menggunakan try-catch
            for (int j = 0; j < 100000000; j++) {
                // Loop ini hanya untuk membuat jeda (berjalan secara iteratif)
            }
        }
    }
}
