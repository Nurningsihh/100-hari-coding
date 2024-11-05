package niingg_31;

public class Day65 {

    public static void main(String[] args) {
        int n = 5;
        //membuat bintang segin empat
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
        
        //loop untuk setiap baris
        for (int i = 1 ;i <=n; i ++){
            for (int j =1 ;j <=i; j ++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //System.out.println("");
        
        for (int i = 4; i >=1 ;i--){
            for (int j = 1;j <=i;j++){
                System.out.print(j+" ");
                
            }
            System.out.println("");
        }
           
        

    }

}
