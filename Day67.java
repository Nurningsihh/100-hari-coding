package niingg_31;

public class Day67 {

    // Method void untuk menampilkan detail buku
    public void tampilkanBuku(String judul, int stok) {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Stok Buku: " + stok);
    }

    // Method void untuk menambah stok buku
    public void tambahStok(int stokBaru) {
        System.out.println("Menambah stok sebanyak: " + stokBaru);
    }

    // Method void untuk mengurangi stok buku
    public void kurangiStok(int stokKurang) {
        System.out.println("Mengurangi stok sebanyak: " + stokKurang);
    }

    // Method void untuk menampilkan pesan saat buku kosong
    public void bukuKosong() {
        System.out.println("Stok buku kosong!");
    }

    public static void main(String[] args) {
        Day67 toko = new Day67(); // Membuat objek dari kelas Day67

        // Menampilkan informasi buku
        toko.tampilkanBuku("Pemrograman Java", 10);

        // Menambah stok buku
        toko.tambahStok(5);

        // Mengurangi stok buku
        toko.kurangiStok(3);

        // Menampilkan pesan stok kosong
        toko.bukuKosong();
    }
}
