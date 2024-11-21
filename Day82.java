
package niingg_31;


public class Day82 {
     public static void main(String[] args) {
        
        int angka = 2024;
        String strAngka = String.valueOf(angka);
        System.out.println("String dari integer: " + strAngka);

        
        double pi = 3.14159;
        String strPi = String.valueOf(pi);
        System.out.println("String dari double: " + strPi);

       
        boolean isNingsih = true;
        String strBoolean = String.valueOf(isNingsih);
        System.out.println("String dari boolean: " + strBoolean);

        
        char huruf = 'N';
        String strHuruf = String.valueOf(huruf);
        System.out.println("String dari char: " + strHuruf);

        //
        char huruf1 = 'a';
        char huruf2 = 'p';
        char huruf3 = 'e';
        char huruf4 = 'l';
        String strKarakterIndividu = String.valueOf(huruf1) + String.valueOf(huruf2) + 
                                     String.valueOf(huruf3) + String.valueOf(huruf4);
        System.out.println("String dari karakter individu: " + strKarakterIndividu);
    
}
}
