
package niingg_31;


import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        
        
        String kalimat1 = "Hai Ningsih!";
        String kalimat1Lower = kalimat1.toLowerCase();
        System.out.println("Kalimat asli: " + kalimat1);
        System.out.println("Kalimat dengan toLowerCase(): " + kalimat1Lower);

 
        
        String kalimat2 = "selamat malam";
        System.out.println("Kalimat asli: " + kalimat2);
        System.out.println("Kalimat dengan toLowerCase(): " + kalimat2.toLowerCase());

       
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat: ");
        String kalimat3 = scanner.nextLine();
        System.out.println("Kalimat dengan toLowerCase(): " + kalimat3.toLowerCase());

        scanner.close();
    }
}

