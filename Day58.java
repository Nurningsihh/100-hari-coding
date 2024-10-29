
package niingg_31;

import java.util.Scanner;
public class Day58 {
   
    public static void main(String[] args) {
        // Menggunakan while loop untuk menampilkan bilangan genap
        System.out.println("Menggunakan while loop untuk bilangan genap:");
        Scanner ning = new Scanner (System.in);
        System.out.print("masukkan angka untuk number: ");
        int number = ning.nextInt(); 
        
        //Looping : while Decrement
        while (number > 0) { 
            if (number % 2 == 0) { 
                System.out.println("Bilangan genap: " + number);
            }
            number--; 
        }
        
        
        System.out.println("==============================");
 System.out.println("Menggunakan while decrement  sebesar 3:");
        System.out.print("masukkan angka apel: ");
        int apel = ning.nextInt(); 
        while (apel > 0) { 
            System.out.println("Bilangan kelipatan 3: " + apel);
            apel -= 3; 
        }


        System.out.println("==============================");
       
        int jumlahGanjil = 0;
        System.out.print("masukkan angka mangga: ");
        int mangga = ning.nextInt(); 
        while (mangga > 0) {
            System.out.println("angka: "+mangga );
            if (mangga % 2 != 0) {
                jumlahGanjil += mangga;
            }
            mangga--; 
        }
        System.out.println("Jumlah semua bilangan ganjil dari 20 hingga 1 adalah: " + jumlahGanjil);
    }
}

    

