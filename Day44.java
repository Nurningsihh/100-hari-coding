
package niingg_31;

import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner momo = new Scanner (System.in);
        System.out.print("masukkan nilai ningsih:");
        int ningsih = momo.nextInt();
        System.out.print("masukkan nilai rahmi:");
        int rahmi = momo.nextInt();
        System.out.print("masukkan nilai fika:");
        int fika = momo.nextInt();
        System.out.print("masukkan nilai madani:");
        int madani = momo.nextInt();
        
         // Operasi logika AND (&&) dengan input dari pengguna
        boolean kondisi1 = (ningsih < rahmi && rahmi < fika);
        System.out.println(ningsih+ " < " +rahmi+ " dan "+ rahmi+ " < " +fika+" = "+kondisi1);
        
        boolean kondisi2 = (ningsih > fika && madani > fika); 
        System.out.println(ningsih+ " > "+fika+ " dan "+ madani+ " > "+fika+" = "+kondisi2 );
        
        boolean kondisi3 = (rahmi == 25 && madani == 45); 
        System.out.println(rahmi +" =25 dan"+ madani+ " =45 "+" = " +kondisi3);
        
        boolean kondisi4 = (ningsih <= rahmi && rahmi >= fika);
        System.out.println(ningsih+" <= "+rahmi+ " dan "+ rahmi+" >= "+fika+" = "+kondisi4 );
         
        // Deklarasi variabel tambahan: rana, gebi, dan dita
        int rana = 10;
        int gebi = 20;
        int dita = 30;
        // Gabungkan beberapa operasi AND menggunakan variabel rana, gebi, dan dita
        boolean hasil1 = (rana < gebi && gebi < dita); 
        System.out.println(rana+" < "+gebi+ " dan "+gebi+" < "+ dita+" = "+hasil1);
        boolean hasil2 = (rana == dita && gebi > rana); 
        System.out.println(rana+" = "+dita +" dan " +gebi+ " > " +rana+" = "+hasil2 );
       
        
        // membuat variabel bolean
        Boolean isNingsih = true; 
        Boolean likesSports = false;
        Boolean likesDancing = true; 
        Boolean likesMusic = true; 
        Boolean likesIceCream = false; 
        
         Boolean likesDancingAndMusic = likesDancing && likesMusic; 
        System.out.println("apakah kamu Suka menari DAN suka musik? " + likesDancingAndMusic);
        Boolean isNingsihandlikesSports = isNingsih && likesSports;
        System.out.println("apakah kamu ningsih dan suka olah raga? "+ isNingsihandlikesSports );
        
        momo.close();
        
        

        
        
        
    }
 
             
    
}
