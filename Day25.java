
package niingg_31;


public class Day25 {
    public static void main(String[] args) {
         // membuat 2 variabel Double (panjang dan lebar)
        Double panjang = 15.2;
        Double lebar = 6.8;
        
        //mencetak panjang dan lebar
         System.out.println("Panjang persegi panjang: " + panjang);
        System.out.println("Lebar persegi panjang: " + lebar);

        // Menghitung luas dan keliling persegi panjang
        Double Luas = panjang * lebar;
        Double Keliling = 2 * (panjang + lebar);

        // Menampilkan hasil perhitungan persegi panjang ( luas dan keliling
        
        System.out.println("Luas persegi panjang: " + Luas);
        System.out.println("Keliling persegi panjang: " + Keliling);
        
        //membuat 3 variabel baru
        Double a = 7.9999;
        Double b = 3.888;
        Double c = 11.785;
         
        //mencetak variabel dengan prinf( a tiga angka di belakang koma),(b dua angka dibelakang koma) dan (c satu anka dibelakang komaa)
        System.out.printf("nilai a: %.3f%nniali b: %.2f%nnilai c: %.1f%n",a,b,c);
        
        //membuat final variabel
        final Double d = 70.333;
        final Double e = 80.555;
        
        //mencetak nilai variabel d dan e
        System.out.println("nilai d = "+d);
        System.out.println("nilai e = "+e);
        
        
        
    }
            
            
    
}
