
package niingg_31;


public class Day18 {
    public static void main(String[] args) {
        boolean isNingsih = true;
        boolean isSiswa = false;
        boolean isMahasiswa = true;
        boolean isArmy = true;
        boolean isCoklat = false;
        
        // mencetak 4 variabel awal
        System.out.println("apakah nama kamu Ningsih? "+isNingsih);
        System.out.println("apakah kamu seorang siswa? "+isSiswa);
        System.out.println("apakah kamu mahasiswa? "+isMahasiswa);
        System.out.println("apakah kamu Army? "+ isArmy);
        System.out.println("apakah kamu suka coklat?"+isCoklat);
        
        //Melakukan beberapa operasi logika
        boolean a = isNingsih &&  isMahasiswa; // AND (true && true)
        boolean b = isSiswa || isArmy; // OR (false || true)
        boolean c = !isCoklat; // NOT (true karena !false)
        boolean d= isNingsih ^ isSiswa; // XOR (true ^ false)
        
        //menampilkan hasil dari operasi logika
        System.out.println("apakah nama kamu ningsih dan kamu mahasiswa? " +a);
        System.out.println("apakah kamu siswa atau kamu Army? "+b);
        System.out.println("apakah kamu suka coklat? "+c);
        System.out.println("apakah kamu Ningsih atau siswa (tapi tidak keduanya)? "+ d);
    }
    
}
