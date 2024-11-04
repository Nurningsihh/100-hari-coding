
package niingg_31;


public class Day64 {
    public static void main(String[] args) {
    
        outerLoop: 
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop luar, i: " + i);

           
            if (i == 1) {
                System.out.println("  i sama dengan 1, loop dalam akan dimulai.");
            } else if (i == 2) {
                System.out.println("  i sama dengan 2, periksa kondisi dalam loop.");
            } else {
                System.out.println("  i lebih dari 2, perulangan akan berakhir setelah ini.");
            }

            for (int j = 1; j <= 3; j++) {
                System.out.println("  Loop dalam, j: " + j);


                if (j == 1) {
                    System.out.println("    j adalah 1, lanjutkan ke nilai berikutnya.");
                } else if (j == 2) {
                    System.out.println("    j adalah 2, cek kondisi break.");
                } else {
                    System.out.println("    j lebih dari 2, hampir keluar dari loop dalam.");
                }

                
                if (i == 2 && j == 2) {
                    System.out.println("    Kondisi terpenuhi (i=2 dan j=2), keluar dari loop dengan label.");
                    break outerLoop; 
                }
            }
            System.out.println("  Selesai dengan loop dalam untuk i = " + i);
        }
        
       
        System.out.println("Keluar dari kedua loop.");
        System.out.println("Selesai.");
    }
}
