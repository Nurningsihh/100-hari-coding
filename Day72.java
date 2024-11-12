
package niingg_31;

public class Day72 {

    public static int jumlah(int n) {

        if (n == 1) {
            System.out.println("Base case tercapai: jumlah(1) = 1");
            return 1;
        }
        
        else {
            System.out.println("Memanggil jumlah(" + n + "), di mana n = " + n);
            int hasil = n + jumlah(n - 1);
            System.out.println("Hasil sementara untuk jumlah(" + n + ") = " + hasil);
            return hasil;
        }
    }

    public static void main(String[] args) {
        int n = 5;  
        System.out.println("Menghitung jumlah dari 1 hingga " + n);

       
        int hasil = jumlah(n);  

       
        System.out.println("Jumlah dari 1 hingga " + n + " = " + hasil);  

       
        System.out.println("\nMenghitung jumlah dari 1 hingga 3");
        System.out.println("Jumlah dari 1 hingga 3 = " + jumlah(3));

        System.out.println("\nMenghitung jumlah dari 1 hingga 7");
        System.out.println("Jumlah dari 1 hingga 7 = " + jumlah(7));
    }
}

