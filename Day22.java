
package niingg_31;


public class Day22 {
    public static void main(String[] args) {
        // Tipe data reference Integer
        Integer a = 30;
        Integer b = 40;
        Integer c = 50;
        
        // mencetak nilai variabel
        System.out.println("MENAMPILAKAN NILAI");
        System.out.println("nilai a = "+a);
        System.out.println("nilai b = "+b);
        System.out.println("nilai c = "+c);
        
        // Melakukan operasi dengan tipe reference Integer
        Integer penjumlahan = a + b; 
        Integer pengurangan = b - c;
        Integer perkalian = c * a;
        Integer pembagian = c / b;
        
        // Menampilkan hasil operasi dengan tipe reference Integer
        System.out.println("MELAKUKAN OPERASI");
        System.out.println("hasil penjumlahan: "+penjumlahan);
        System.out.println("hasil pengurangan: "+pengurangan);
        System.out.println("hasil penjumlaha: "+penjumlahan);
        System.out.println("hasil perkalian: "+perkalian);
        System.out.println("hasil pembagian: "+pembagian);
        
        //max dan min 
        int maxVal = Integer.max(a, b); // Memilih nilai maksimum
        int minVal = Integer.min(a, b); // Memilih nilai minimum
        //mencetak max min
        System.out.println("MENAMPILKAN MAX DAN MIN ");
        System.out.println("Nilai maksimum antara a dan b: " + maxVal);
        System.out.println("Nilai minimum antara a dan b: " + minVal);
    



     
        
    }
            
    
}
