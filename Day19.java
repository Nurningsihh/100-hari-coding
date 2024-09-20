
package niingg_31;


public class Day19 {
    public static void main(String[] args) {
       // Membuat beberapa objek string
        String a = new String("Selamat malam");
        String b = new String("SEMANGAT TERUS YA");
        String c= new String("Jangan lupa makan");

        // Menggabungkan string (concatenation)
        String result = a + " " + b; // Menggabungkan a dan b
        System.out.println("Gabungan a dan b " + result);

        // Menampilkan panjang dari string
        System.out.println("Panjang a: " + a.length());
        System.out.println("Panjang b: " + b.length());
        System.out.println("Panjang c: " + c.length());

        // Mengakses karakter individual dalam string
        char firstChar_a = a.charAt(0); // Mengambil karakter pertama dari a
        char lastChar_b = b.charAt(b.length() - 1); // Mengambil karakter terakhir dari b
        System.out.println("Karakter pertama dari a: " + firstChar_a);
        System.out.println("Karakter terakhir dari b: " + lastChar_b);

        // Mengambil substring dari string
        String subStr = c.substring(5, 16); // Mengambil substring dari c
        System.out.println("Substring dari c (5-16): " + subStr);

        // Mengubah string menjadi huruf besar dan huruf kecil
        String upper_a = a.toUpperCase(); // Mengubah a menjadi huruf besar
        String lower_b = b.toLowerCase(); // Mengubah b menjadi huruf kecil
        System.out.println("a dalam huruf besar: " + upper_a);
        System.out.println("b dalam huruf kecil: " + lower_b);

        
    }
}

    
    

