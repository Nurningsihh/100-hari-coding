
package niingg_31;

import java.util.Scanner;
public class Day46 {
    public static void main(String[] args) {
        // membuat 4 variabel bertipe data boolean
        boolean isNingsih = true;
        boolean likesport = false;
        boolean isSiswa = true;
        boolean likeDancing = false;
        
        //membuat Operator Logika : Negasi/kebalikan
        boolean a = !isNingsih;
        boolean b = !likesport;
        boolean c = !isSiswa ;
        boolean d = !likeDancing;
        // mencetak hasil dari  Operator Logika : Negasi/kebalikan
        System.out.println("apakah kamu Ningsih? "+a);
        System.out.println("apakah kamu suka olahraga? "+b);
        System.out.println("apakah kamu siswa? "+c);
        System.out.println("apakah kamu suka menari? "+d);
        
        //membuat 3 variabel baru (inputan)
        Scanner ning = new Scanner (System.in);
        System.out.print("masukkan nilai merah:");
        int merah = ning.nextInt();
        System.out.print("masukkan nilai kuning:");
        int kuning = ning.nextInt();
        System.out.print("masukkan nilai hijau:");
        int hijau = ning.nextInt();
        
        boolean apel = merah > kuning;
        boolean anggur = hijau < kuning;
        boolean mangga = hijau > merah;
        
        // mencetak hasil dari  Operator Logika : Negasi/kebalikan
        System.out.println("apakah merah besar dari kuning? "+!apel);
        System.out.println("apakah anggur kecil dari kuning? "+ !anggur);
        System.out.println("apakah hijau besar dari merah? "+!mangga);
        


        
    }
    
}
