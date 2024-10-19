
package niingg_31;

import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        /*percaban if else
        Menginput nama dan nilai
        */
        Scanner ningsih = new Scanner (System.in);
        System.out.print("masukkan nama anda: ");
        String nama = ningsih.nextLine();
        System.out.print("masukkan nilai UAS anda: ");
        int nilai = ningsih.nextInt();
        
        //membuat percabangan if else 
        if (nilai >= 90){
            System.out.println("nilai : A");
            System.out.println("ket: Sangat baik");
        }else if (nilai >=80){
            System.out.println("nilai : B");
            System.out.println("Ket: Baik");
        }else if (nilai >=70){
            System.out.println("nilai : C");
            System.out.println("Ket: Cukup");
        }else if (nilai >=60){
            System.out.println("nilai : D");
            System.out.println("Ket: Kurang");
        }else{
            System.out.println("nilai : E");
            System.out.println("Ket: Eror");        
        }
        // Menambahkan ket berdasarkan nilai UAS
        if (nilai >=60){
            System.out.println("Selamat "+ nama+ " Kamu lulus mata kuliah ini");
        }else{
            System.out.println("Mohon maaf "+nama+" kamu harus mengulang mata kuliah ini tahun depan");
        }
        
    }
    
}
