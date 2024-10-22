
package niingg_31;

import java.util.Scanner;
public class Day51 {
    public static void main(String[] args) {
        Scanner ningsih = new Scanner (System.in);
        System.out.print("masukkan nilai a: ");
        int a = ningsih.nextInt();
        
        switch (a){
            case 1 :
                System.out.println("merah");
                break;
            case 2 :
                
                System.out.println("kuning");
                break;
            case 3: 
                System.out.println("hijau");
                break;
            default:
                System.out.println("invalid color");
                    
        }
        
        
        System.out.print("masukkan nilai b: ");
        String b = ningsih.next();
      
        switch (b) {
            case "ningsih":
                System.out.println("saya adalah ningsih");
                break;
            case "geby":
                System.out.println("saya adalah geby");
                break;
            case "rana":
                System.out.println("saya adalah rana");
                break;
            case "rahmi":
                System.out.println("saya adalah rahmi");
                break;
            default :
                System.out.println("saya misterius");
        }
    }
    
}
