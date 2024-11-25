
package niingg_31;



public class Day85 {
    
    public static void main(String[] args) {
        
        
       int [] angka = { 10,20,30,40,50}; 
       
       //menampilkan elemen array
        System.out.println("isi array angka: ");
        
        for (int i = 0;i < angka.length;i++){
            System.out.println("indeks "+i+" : "+ angka [i]);
        }
        
        System.out.println("");
        
        String [] kalimat = {"selamat siang","apa kabar hari ini","jaga kesehatan ya"};
        
               System.out.println("isi array kalimat: ");
               
        for (int i = 0;i < kalimat.length;i++){
            System.out.println("indeks "+i+" : "+ kalimat[i]);
        } 
    }
    
}
