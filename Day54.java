
package niingg_31;


public class Day54 {
    public static void main(String[] args) {
        System.out.println("memulai program.....");
  
        System.out.println("===== menambah i dengan 2 setiap kali iterasi batas hingga 10 =====");  
     for (int i = 2; i <= 10;) {
    System.out.println("Nilai i: " + i);
    i += 2;  // Increment dilakukan di dalam badan loop
   
}
        System.out.println("===== mengurangi i dengan 1 setiap kali iterasi hingga 0 =====");
        
     for (int i = 5; i >=0; i--){
         System.out.println("nilai: "+i);
     }
        System.out.println("===== menambah i dengan 1 setiap kali iterasi hingga 5 =====");
     for (int i = 1; i<=5; i++){
         System.out.println("nilai: "+i);
        if (i % 2 == 0){
            System.out.println(i+" adalah angka genap");
        }else {
            System.out.println(i+ " adalah angka ganjil");
        }
         
     }
        System.out.println("-----program selesai-----");
       
    }
    
}
