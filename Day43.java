
package niingg_31;
import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        // membuat inputan a, b dan c
        Scanner ning = new Scanner (System.in);
        System.out.print("masukkan nilai a: ");
        int a = ning.nextInt();
        System.out.print("masukkan nilai b: ");
        int b = ning.nextInt();
        System.out.print("masukkan nilai c: ");
        int c = ning.nextInt();
        
        //melakukan Operator Perbandingan : Lebih besar sama dengan dan lebih kecil sama dengan 
        boolean merah = (a >= b);
       System.out.println(a+ " >= " + b + ": " + merah);
        boolean kuning = (a <= b);
       System.out.println(a+ " <= " + b + ": " + kuning);
       boolean hijau = (a >= c);
       System.out.println(b+ " >= " + c + ": " + hijau);
       // 
       
       int d = 80;
       int e= 80;
        boolean putih = (d >= e);
       System.out.println(d+ " >= " + e + ": " + putih);
       boolean biru = (d <= e);
       System.out.println(d+ " <= " + e + ": " + biru);
       
       // menutup input
       ning.close();
        
        
    }
    
}
