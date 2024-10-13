
package niingg_31;

import java.util.Scanner;
public class Day42 {
    public static void main(String[] args) {
        //membuat inputan a, b, c dan d
      Scanner moe = new Scanner (System.in);
        System.out.print("masukkan nilai a: ");
      int a = moe.nextInt();
        System.out.print("masukkan nilai b: ");
      int b = moe.nextInt();
        System.out.print("masukkan nilai c: ");
     int c = moe.nextInt();
        System.out.print("masukkan nilai d: ");
      int d = moe.nextInt();
      
      // Operator Perbandingan : Sama dengan (==) dan tidak sama dengan (!=)
        System.out.println("apakah nilai a sama dengan nilai b ?"+(a==b));
        System.out.println("apakah nilai c tidak sama dengan nilai d ?"+(c != d));
        System.out.println("apakah nilai a sana dengan nilai c ?"+ (a ==c));
        
        // update semua variabel
       a = 20;
       b = 30;
       c = 40;
       d = 60;
       // mencetak semua nilai variabel
        System.out.printf("nilai a: %d, nilai b: %d, nilai c: %d, nilai d: %d%n",a,b,c,d);
        // mencetak (==) dan (!=)
        System.out.println("apakah a sama dengan b? "+(a==b));
        System.out.println("apakah c tidak sama dengan d? "+(c!=d));
         
          // Menutup scanner 
        moe.close();     
      
    }
   
    
}
