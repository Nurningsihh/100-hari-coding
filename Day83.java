
package niingg_31;


public class Day83 {
    
    public static void main(String[] args) {
        
        
      int [] angka = {1,2,3,4,5};
      
      String [] nama = {"Ningsih", "ulfa"," tirta", "mia", "anggi"};
      
      
      //Menampilkan elemen array angka
        System.out.println("elemen array angka: ");
        for (int i = 0; i < angka.length;i++){
            System.out.println("indeks "+ i+ " = " + angka[i]);    
        }
        
        //Mengubah nilai elemen array angka
       angka [2] = 30;
       angka [3] = 40;
        System.out.println("\nsetelah menguabah  elemen ketiga dan keempat pada array angka: ");
        for (int i = 0; i < angka.length;i++){
            System.out.println("indeks "+ i+ " = " + angka[i]); 
        }
        
         //Menampilkan elemen array nama
        System.out.println("elemen array nama: ");
        for (int i = 0; i < nama.length;i++){
            System.out.println("indeks "+ i+ " = " + nama[i]); 
        }    
    }
}
