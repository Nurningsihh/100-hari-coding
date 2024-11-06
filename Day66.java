
package niingg_31;


public class Day66 {
    public static void main(String[] args) {
        //pola persegi
        int baris = 4;
        
        System.out.println("POLA PERSEGI");
        
        for (int i= 1;i<=baris;i++){
            for (int j=1; j<=baris;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        int panjang = 3;
        int lebar = 6;
        
        
        System.out.println("POLA PERSEGI PANJANG");
        
        //pola persegi panjang
         for (int i = 1; i<=panjang;i++){
             for (int j =1; j<=lebar;j++){
                 System.out.print("* ");
             }
             System.out.println("");
         }
                
    }
    
            
    
}
