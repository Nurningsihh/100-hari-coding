
package niingg_31;
import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        
  // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Input nilai awal untuk variabel a dan b
        System.out.print("Masukkan nilai untuk a: ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai untuk b: ");
        int b = input.nextInt();

    
        int hasilKali;

        // Pengisian dan perkalian (a * b)
        hasilKali = a;
        hasilKali *= b;
        System.out.println("Hasil perkalian (a * b): " + hasilKali);

        // Input nilai awal untuk variabel c dan d
        System.out.print("Masukkan nilai untuk c: ");
        int c = input.nextInt();
        System.out.print("Masukkan nilai untuk d: ");
        int d = input.nextInt();

 
        int hasilBagi;

        // Pengisian dan pembagian (c / d)
        hasilBagi = c;
        hasilBagi /= d;
        System.out.println("Hasil pembagian (c / d): " + hasilBagi);

        input.close();
    }
}
