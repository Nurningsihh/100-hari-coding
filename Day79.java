
package niingg_31;

class Buku {
    String judul;
    String penulis;

    
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

   
    @Override
    public String toString() {
        return "Buku: " + judul + ", Penulis: " + penulis;
    }
}

public class Day79 {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("Pemrograman Dasar", "Ningsih");
        Buku buku2 = new Buku("Algoritma dan Struktur Data", "Dika");

       
        System.out.println(buku1); 
        System.out.println(buku2);
    }
}

