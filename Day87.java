
package niingg_31;


public class Day87 {
    public static void main(String[] args) {
        
       String [] hari = {"senin","selasa","rabu","kamis","jumat","sabtu", "minggu"};
        System.out.println("Nama-nama hari");
        
        //mEncetak nama hari menggunakan for each
        for (String nilai : hari){
            System.out.println("Hari : "+nilai);
            
        }
        //mengubah nilai pada index ke enam(minggu menjadi ahad
        hari[6] = "ahad";
        System.out.println("\nmencetak setelah index ke enam di ubah nilainya: ");
          for (String nilai : hari){
            System.out.println("Hari : "+nilai);
            
        }
          
          int [] angka = { 100,200,300,400};
          System.out.println("\nmencetak angka: ");
          for (int nilai : angka){
              System.out.println("angka : "+nilai);
          }
          System.out.println("\nangka setelah di ubah nilainya:");
          angka[0] = 1;
          angka[1] = 2;
          angka[2] = 3;
          angka[3] = 4;
          
          for (int nilai : angka){
              System.out.println("angka : "+nilai);
          }
          
                  
                  
        
    }
   
            
    
}
