
package niingg_31;


public class Day16 {
    public static void main(String[] args) {
        float A1 ;
        float A2;
        float A3;
        float A4;
        float B1 = 1.2f;
        float B2 = 1.3f;
        float B3 = 1.4f;
        float B4 = 1.5f;
        System.out.printf("B1= %.1f,B2= %.1f,B3= %.1f, B4= %.1f",B1,B2,B3,B4);
        A1 = B1;
        A2 = B2;
        A3 = B3;
        A4 = B4;
        System.out.print("A1 ="+A1);
        System.out.print("A2 ="+A2);
        System.out.print("A3 ="+A3);
        System.out.print("A4 ="+A4);
        
       B1 = 4f;
       B2 = 8f;
       B3 = 12f;
       B4 = 16f;
       float B5 = B1;
       B1 = B3;
       B3 = B4;
       B4 = B2;
       B2 = B5;
       System.out.println("B1 = "+B1);
       System.out.println("B2 = "+B2);
       System.out.println("B3 = "+B3);
       System.out.println("B4 = "+B4);
        
        
        
        
       
    }

    
}
