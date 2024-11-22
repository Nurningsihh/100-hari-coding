
package niingg_31;


public class Day83 {
    
    public static void main(String[] args) {
        
        
        double number1 = 4.3;
        double number2 = 4.7;
        float number3 = 5.5f; 

        
        // Math.ceil() Membulatkan angka ke atas menuju bilangan bulat terdekat.
        System.out.println("Math.ceil(" + number1 + ") = " + Math.ceil(number1)); 
        System.out.println("Math.ceil(" + number2 + ") = " + Math.ceil(number2)); 

        
        
        //  Math.floor() Membulatkan angka ke bawah menuju bilangan bulat terdekat.
        System.out.println("Math.floor(" + number1 + ") = " + Math.floor(number1)); 
        System.out.println("Math.floor(" + number2 + ") = " + Math.floor(number2)); 

        
        
        // Math.round() Membulatkan angka ke bilangan bulat terdekat sesuai aturan umum
        System.out.println("Math.round(" + number1 + ") = " + Math.round(number1)); 
        System.out.println("Math.round(" + number2 + ") = " + Math.round(number2)); 
        System.out.println("Math.round(" + number3 + ") = " + Math.round(number3)); 
    }
}
