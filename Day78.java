
package niingg_31;

import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        
     //menginisialisasi 3 variabel
     
     String a = "ning";
     String b = "ning";
     String c = "Ning";
    
     
     boolean equalsIgnoreCase = a.equalsIgnoreCase(c);
     boolean equals = a.equals(c);
     
        System.out.println("hasil  equalsIgnoreCase: "+ equalsIgnoreCase);
        System.out.println("hasil  equals: "+ equals);
        
     Scanner ning = new Scanner (System.in);
     String d = ning.nextLine();
     
    boolean equalsIgnoreCase2 = b.equalsIgnoreCase(d);
     boolean equals2 = a.equals(d);
     
      System.out.println("hasil  equalsIgnoreCase: "+ equalsIgnoreCase2);
      System.out.println("hasil  equals: "+ equals2);
     
             
     
    }
    
}
