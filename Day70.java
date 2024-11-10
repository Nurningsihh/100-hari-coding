
package niingg_31;


public class Day70 {
    
   
    public static void sapaPengguna(String nama, int umur) {
        if (umur < 18) {
            System.out.println("Halo, " + nama + "! Kamu masih muda, usia kamu baru " + umur + " tahun.");
        } else if (umur >= 18 && umur <= 30) {
            System.out.println("Halo, " + nama + "! Kamu berada di usia dewasa muda, yaitu " + umur + " tahun.");
        } else {
            System.out.println("Halo, " + nama + "! Kamu sudah berusia " + umur + " tahun, semangat terus!");
        }
    }
    
   
    public static void periksaBatasUmur(int umur) {
        if (umur >= 30) {
            System.out.println("Kamu sudah memasuki usia 30 tahun atau lebih.");
        } else {
            System.out.println("Kamu belum mencapai usia 30 tahun.");
        }
    }
    
    public static void main(String[] args) {
        
        sapaPengguna("Ningsih", 21);
        sapaPengguna("Budi", 25);
        sapaPengguna("Rani", 17);
        
        
        periksaBatasUmur(21);
        periksaBatasUmur(35);
        periksaBatasUmur(29);
        
       
        sapaPengguna("Anton", 40);
        sapaPengguna("Siti", 50);
    }
}

