
package niingg_31;


public class Day28 {
    public static void main(String[] args) {
        //tipe data reference Boolean
        
        // Data diri
        Boolean isNingsih = true; 
        Boolean likesSports = false;
        Boolean likesDancing = true; 
        Boolean likesMusic = true; 
        Boolean likesIceCream = false; 

        //Mencetak nilai variabel manggunakan println
        System.out.println("Apakah ini Ningsih? " + isNingsih);
        System.out.println("apakah kamu  Suka Olahraga: " + likesSports);
        System.out.println("apakah kamu Suka Menari: " + likesDancing);
        System.out.println("apakah kamu Suka Musik: " + likesMusic);
        System.out.println("apakah kamu Suka Es Krim: " + likesIceCream);

        // operator AND (true jika keduanya bernilai true)
        Boolean likesDancingAndMusic = likesDancing && likesMusic; 
        System.out.println("apakah kamu Suka menari DAN suka musik? " + likesDancingAndMusic); // true

        //operator OR (jika salah satu true maka hasilnya true)
        Boolean likesSportsOrIceCream = likesSports || likesIceCream; 
        System.out.println("apakah kamu Suka olahraga ATAU suka es krim? " + likesSportsOrIceCream); // false

        //operator XOR musik (salah satu harus true, tetapi bukan keduanya)
        Boolean likesSportsXORMusic = likesSports ^ likesMusic; 
        System.out.println("apakah kamu Suka olahraga XOR suka musik? " + likesSportsXORMusic); // true (karena likesSports false dan likesMusic true)

        //operator NOT ( Memeriksa kebalikan dari isNingsih)
        Boolean isNotNingsih = !isNingsih; 
        System.out.println("Apakah kamu bukan Ningsih? " + isNotNingsih); // false (karena isNingsih true)
        
    }
    
}
