
package niingg_31;

public class Day73 {
    public static void main(String[] args) {
        String kata = "Halo, Ningsih!";
        
        System.out.println("String yang digunakan: " + kata);
        System.out.println("Jumlah karakter dalam string: " + kata.length());
        System.out.println("Menampilkan karakter pada setiap indeks:");
        
        int jumlahVokal = 0;
        int jumlahKonsonan = 0;

        
        for (int i = 0; i < kata.length(); i++) {
            char karakter = kata.charAt(i);
            System.out.println("Karakter pada indeks " + i + " adalah: " + karakter);

            
            if (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u' ||
                karakter == 'A' || karakter == 'E' || karakter == 'I' || karakter == 'O' || karakter == 'U') {
                
                jumlahVokal++;
            }
            
            else if ((karakter >= 'a' && karakter <= 'z') || (karakter >= 'A' && karakter <= 'Z')) {
                jumlahKonsonan++;
            }
        }

        
        System.out.println("\nJumlah vokal dalam string: " + jumlahVokal);
        System.out.println("Jumlah konsonan dalam string: " + jumlahKonsonan);
    }
}
