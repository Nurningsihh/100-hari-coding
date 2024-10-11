
package niingg_31;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
       
        //deklarasi 5 variabel int untuk di bandingkan
        int apel = 20;
        int anggur = 30;
        int mangga = 40;
        int pepaya = 50;
        int pisang = 60;
        // mencetak hanya menampilkan true false
        System.out.println(apel> anggur);
        System.out.println(pisang<pepaya);
        System.out.println(anggur>mangga);
        System.out.println(anggur< pepaya);
        //System.out.println(apel > anggur);
          
          Scanner niingg = new Scanner (System.in);
          System.out.print("masukkan nilai ceri:");
          int ceri = niingg.nextInt();
          System.out.print("masukkan nilai kiwi:");
           int kiwi = niingg.nextInt();
        System.out.print("ceri lebih besar dari kiwi: ");
        System.out.println(ceri>kiwi);
        System.out.print("kiwi lebih besar dari ceri:");
        System.out.println(kiwi>ceri);
                
        

}
}
    

