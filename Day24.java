
package niingg_31;


public class Day24 {
    public static void main(String[] args) {
        // Membuat objek Float
        Float a = 15.5f;
        Float b = 25.75f;
        Float c = 5.25f;
        Float d = 6.25f;

        // Menampilkan nilai objek Float
        System.out.println("MENCETAK NILAI MASING-MASING VARIABEL");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c: " + c);
        System.out.println("Nilai d: " + d);
        
        //Menukar nilai variabel a = 6.25 (nilai variabel d) dan b= 5.25 (nilai variabel c)
        a = d ;
        b = c ;
        // mencetak nilai a dan b
        System.out.println("MENCETAK NILAI A DAN B SETELAH MELAKUKAN PERTUKARAN");
        System.out.println("nilai a menjadi : "+a);
        System.out.println("nilai b menjadi: "+b);
        
        // update nilai c dan d
        c = 5.70f;
        d = 8.40f;
        // mencetak nilai c dan d
        System.out.println("MENCETAK NILAI C DAN D SETELAH DI UPDATE");
        System.out.println("nilai c menjadi: "+c);
        System.out.println("nilai  d menjadi "+d);
    }
    
}
