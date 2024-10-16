
package niingg_31;


public class Day45 {
    public static void main(String[] args) {
        //membuat 4 variabel
        boolean isNingsih = true;
        boolean likeicecream = false;
        boolean likesport = false;
        boolean likedancing = true;
        
        //operasi logika OR
        boolean isNingsihORlikedancing = isNingsih || likedancing ;
        boolean likeicecreamORlikesport = likeicecream || likesport ;
        boolean likesportORlikedancing = likesport ||  likedancing;
        boolean likeicecreamORlikedancing = likeicecream ||  likedancing;
        
        System.out.println("apakah kamu Ningsih atau kamu suka menari? "+isNingsihORlikedancing);
        System.out.println("apakah kamu suka ice cream atau kamu suka olah raga? "+likeicecreamORlikesport);
        System.out.println("apakah kamu suka olah raga atau kamu suka menari? "+likesportORlikedancing);
        System.out.println("apakah kamu suka ice cream atau kamu suka menari? "+likeicecreamORlikedancing );
        
        
        
     int a = 10;
        int b = 20;
        int c = 0;

        // Logika OR pada operasi perbandingan dengan variabel int
        boolean jin = (a > b) || (a == 10);
        boolean jimin = (b < 30) || (c != 0);
        boolean taehyung = (c == 0) || (a > b);
        boolean suga = (a != b) || (c < a);
        boolean jungkook = (b == 20) || (a <= 5);

        
        System.out.println("Hasil operasi OR (a > b || a == 10) [jin]: " + jin);
        System.out.println("Hasil operasi OR (b < 30 || c != 0) [jimin]: " + jimin);
        System.out.println("Hasil operasi OR (c == 0 || a > b) [taehyung]: " + taehyung);
        System.out.println("Hasil operasi OR (a != b || c < a) [suga]: " + suga);
        System.out.println("Hasil operasi OR (b == 20 || a <= 5) [jungkook]: " + jungkook);
    }
    
}
