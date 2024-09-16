
package niingg_31;


public class Day15 {
    public static void main(String[] args) {
        //deklarasi 5 variabel awal
       double a ;
       double b ;
       double c ;
       double d ;
       double e ;
       //inisialisasi 5 variabel awal
       a = 1.1234567;
       b = 2.1234567;
       c = 3.1234567;
       d = 4.1234567;
       e = 5.1234567;
       //inisialisasi 9 variabel
       double merah = 1.11111111111;
       double kuning = 2.22222222222;
       double hijau = 3.33333333333;
       double biru = 4.44444444444;
       double ungu = 5.55555555555;
       double pink = 6.66666666666;
       double putih = 7.77777777777;
       double hitam = 8.88888888888;
       double abuabu = 9.99999999999;
       
       // Inisialisasi variabel pi dengan nilai 22/7
         double pi = 22/7;

        
        System.out.printf("a : %.1f/n",a);
        System.out.printf("b : %.2f/n",b);
        System.out.printf("c : %.3f/n",c);
        System.out.printf("d : %.4f/n",d);
        System.out.printf("e : %.5f/n",e);
        
        //cetak 9 variabel 7 angka di belakang koma menggunakan println
          System.out.println(String.format("merah: %.7f", merah));
          System.out.println(String.format("kuning: %.7f", kuning));
          System.out.println(String.format("hijau: %.7f", hijau));
          System.out.println(String.format("biru: %.7f", biru));
          System.out.println(String.format("ungu: %.7f", ungu));
          System.out.println(String.format("pink: %.7f", pink));
          System.out.println(String.format("putih: %.7f", putih));
          System.out.println(String.format("hitam: %.7f", hitam));
          System.out.println(String.format("abuabu: %.7f", abuabu));
          
          // Pencetakan nilai pi dengan angka desimal bertambah dari 2 hingga 11
        System.out.println(String.format("pi = %.2f", pi));
        System.out.println(String.format("pi= %.3f", pi));
        System.out.println(String.format("pi = %.4f", pi));
        System.out.println(String.format("pi = %.5f", pi));
        System.out.println(String.format("pi = %.6f", pi));
        System.out.println(String.format("pi = %.7f", pi));
        System.out.println(String.format("pi = %.8f", pi));
        System.out.println(String.format("pi = %.9f", pi));
        System.out.println(String.format("pi= %.10f", pi));
        System.out.println(String.format("pi = %.11f", pi));
      
                    
         
    }
    
}
