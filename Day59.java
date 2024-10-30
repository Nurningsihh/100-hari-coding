
package niingg_31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Day59 {
  
    public static void main(String[] args) {
        // Membuat daftar siswa
        List<String> siswaList = new ArrayList<>();
        siswaList.add("Ningsih");
        siswaList.add("Geby");
        siswaList.add("Rana");
        siswaList.add("Rahmi");
        siswaList.add("Madani");
        
        // Membuat peta nilai untuk setiap siswa
        Map<String, Integer> nilaiMap = new HashMap<>();
        nilaiMap.put("Ningsih", 85);
        nilaiMap.put("Geby", 78);
        nilaiMap.put("Rana", 92);
        nilaiMap.put("Rahmi", 67);
        nilaiMap.put("Madani", 88);
        
        // Menampilkan daftar siswa dan nilai mereka
        System.out.println("Daftar Siswa dan Nilai:");
        for (String siswa : siswaList) {
            System.out.println(siswa + ": " + nilaiMap.get(siswa));
        }
        
        // Menghitung total nilai dan rata-rata
        int totalNilai = 0;
        for (int nilai : nilaiMap.values()) {
            totalNilai += nilai;
        }
        double rataRata = (double) totalNilai / nilaiMap.size();
        
        // Menampilkan rata-rata nilai
        System.out.println("\nRata-Rata Nilai: " + rataRata);
        
        // Menampilkan siswa yang memiliki nilai di atas rata-rata
        System.out.println("Siswa dengan Nilai di Atas Rata-Rata:");
        for (String siswa : siswaList) {
            if (nilaiMap.get(siswa) > rataRata) {
                System.out.println("- " + siswa + ": " + nilaiMap.get(siswa));
            }
        }
    }
}

    
