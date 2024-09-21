
package niingg_31;


public class Day20 {
    public static void main(String[] args) {
     //Tipe Data Reference Byte
     
   /* Menampilkan jumlah kelereng masing-masing pemain sebelum pertukaran 
      dengan menggunakan System.out.printf. */ 
   Byte Ali = 20;
   Byte Budi = 15;
   Byte Cici = 18;
   Byte Dedi = 22;
   Byte Evi = 17;
        System.out.printf("SBELUM PERTUKARAN%n");
        System.out.printf("Ali memiliki %d kelereng%n",Ali);
        System.out.printf("Budi memiliki %d kelereng%n",Budi);
        System.out.printf("Cici memiliki %d kelereng%n",Cici);
        System.out.printf("Dedi memiliki %d kelereng%n",Dedi);
        System.out.printf("Evi memiliki %d kelereng%n",Evi);
        
      //Melakukan pertukaran kelereng antara Ali dan Budi, serta Cici dan Dedi. 
      Byte a= Cici;
      Cici = Dedi;
      Dedi = a;
      a = Ali;
      Ali = Budi;
      Budi = a;
      
      // mencetak dengan menggunkan println
      
        System.out.println("SETELAH PERTUKARAN");
        System.out.println("Ali memiliki " + Ali + " kelereng");
        System.out.println("Budi memiliki " + Budi + " kelereng");
        System.out.println("Cici memiliki " + Cici + " kelereng");
        System.out.println("Dedi memiliki " + Dedi + " kelereng");
        
        /*  Menambahkan jumlah kelereng: 
            • Ali mendapat tambahan 5 kelereng. 
            • Budi mendapat tambahan 3 kelereng. 
            • Cici mendapat tambahan 2 kelereng. 
            • Dedi mendapat tambahan 4 kelereng. 
            • Evi tidak menambah kelereng. */
        Ali = 20;
        Budi =  23;
        Cici = 24;
        Dedi = 22 ;
        
        // mencetak menggunkan println
        System.out.println("SETELAH PENAMBAHAN KELERENG");
        System.out.println("Ali memiliki " + Ali + " kelereng");
        System.out.println("Budi memiliki " + Budi + " kelereng");
        System.out.println("Cici memiliki " + Cici + " kelereng");
        System.out.println("Dedi memiliki " + Dedi + " kelereng");
        System.out.println("Evi memiliki " + Evi + " kelereng");
        
        

              
      
              
      
        
        
   
   
   
    }
    
}
