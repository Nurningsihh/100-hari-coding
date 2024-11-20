
package niingg_31;


public class Day80 {
    public static void main(String[] args) {
        
        String originalString = "   Hello, Ningsih!   ";
        System.out.println("Sebelum trim: '" + originalString + "'");
        
        
        String trimmedString = originalString.trim();
        System.out.println("Setelah trim: '" + trimmedString + "'");
        
        
        String anotherString = "   Welcome   ";
        String combinedString = trimmedString + anotherString.trim();
        System.out.println("Setelah trim dan digabung: '" + combinedString + "'");
        
        
        String emptySpaceString = "   ";
        String trimmedEmpty = emptySpaceString.trim();
        System.out.println("Trim pada string kosong: '" + trimmedEmpty + "' (panjang: " + trimmedEmpty.length() + ")");
        
        
        String userInput = "   Ningsih   ";
        System.out.println("Input asli: '" + userInput + "'");
        System.out.println("Input setelah trim: '" + userInput.trim() + "'");
        
       
        if (userInput.trim().equals("Ningsih")) {
            System.out.println("Input valid setelah trim!");
        } else {
            System.out.println("Input tidak valid.");
        }
    }
}

