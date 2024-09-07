
package niingg_31;


public class Day06 {
    public static void main(String[] args) {
        //Membuat deklarasi variabel dalam java
        //Membuat variabel nama yang bertipe teks (String) dan memberikan nilai "Nurningsih".
        String nama = "Nurningsih";
        //Membuat variabel dengan umur yang bertipe bilangan bulat (integer) dan memberikan nilai awal 21.
        int umur = 21;
        //Membuat variabel tinggiBadan yang bertipe bilangan desimal (double) dan memberikan nilai awal 1.60.
        double tinggiBadan= 1.60;
        //Membuat variabel jenisKelamin yang bertipe karakter tunggal (char) dan memberikan nilai 'P'.
        char jenisKelamin = 'P';
        //Membuat variabel isMahasiswa yang bertipe boolean (benar atau salah) dan memberikan nilai true (benar).
        boolean isMahasiswa = true;
        
        /*
            Variabel-variabel di atas digunakan dalam perintah System.out.println() untuk mencetak kalimat ke layar.
            Tanda + digunakan untuk menggabungkan string dengan nilai variabel.
        */
        System.out.println("nama saya adalah" +nama+ ",umur saya" +umur+ "tahun");
        System.out.println("tinggi badan saya yaitu"+tinggiBadan+ "meter"+ ",jenis kelamin"+ jenisKelamin);
        System.out.println("apakah saya mahasiswa?" + isMahasiswa);
    }
    
}
