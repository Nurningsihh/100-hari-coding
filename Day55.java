package niingg_31;

public class Day55 {

    public static void main(String[] args) {

        System.out.println("Looping : for Decrement");
        
       // Loop dari 10 turun ke 1, dengan decrement 1
        for (int i = 10; i > 0; i--) {
            System.out.println("nilai: " + i);
        }
       
        
        // Loop dari 8 turun ke 0, dengan decrement 2 
        for (int i = 8; i >=0; i -= 2){
            System.out.println("decrement dua: "+i);
        }
        
        for (int i =15; i>=3 ; i -=3){
            System.out.println("decrement tiga: "+i);
        }
        
        for (int i = 20; i >4; i -= 4){
            System.out.println("decrement empat: "+i);
        }
        
        for ( int i = 20; i >=5; i -= 5){
            System.out.println("decrement lima: "+i);
        }
      
              
    }

}
