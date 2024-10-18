
package niingg_31;

public class Day47 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int nilai = 75;
        String statusNilai = "";

        // Percabangan untuk menentukan status nilai berdasarkan nilai
        if (nilai >= 90) {
            statusNilai = "A";
            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Selamat, Anda mendapatkan status nilai " + statusNilai);
        }

        if (nilai >= 80 && nilai < 90) {
            statusNilai = "B";
            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Anda mendapatkan status nilai " + statusNilai);
        }

        if (nilai >= 70 && nilai < 80) {
            statusNilai = "C";
            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Anda mendapatkan status nilai " + statusNilai);
        }

        if (nilai >= 60 && nilai < 70) {
            statusNilai = "D";
            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Anda mendapatkan status nilai " + statusNilai);
        }

        if (nilai < 60) {
            statusNilai = "E";
            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Maaf, Anda mendapatkan status nilai " + statusNilai);
        }

        // Percabangan untuk mengecek apakah nilai lebih dari 100
        if (nilai > 100) {
            System.out.println("Nilai Anda melebihi batas maksimal.");
        }

        // Percabangan untuk mengecek apakah nilai kurang dari 0
        if (nilai < 0) {
            System.out.println("Nilai Anda tidak valid.");
        }

        // Percabangan tambahan untuk memberikan ucapan berdasarkan status nilai
        if (statusNilai.equals("A")) {
            System.out.println("Luar biasa! Pertahankan prestasi Anda.");
        }

        if (statusNilai.equals("B")) {
            System.out.println("Bagus! Masih ada ruang untuk perbaikan.");
        }

        if (statusNilai.equals("C")) {
            System.out.println("Cukup baik, tetapi Anda perlu berusaha lebih keras.");
        }

        if (statusNilai.equals("D")) {
            System.out.println("Anda perlu belajar lebih giat.");
        }

        if (statusNilai.equals("E")) {
            System.out.println("Anda harus belajar dengan serius untuk memperbaiki nilai Anda.");
        }
    }
}

    

