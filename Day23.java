
package niingg_31;


public class Day23 {
    public static void main(String[] args) {
        // Membuat 5 variabel dengan tipe data reference long
        Long a = 10L; 
        Long b = 20L;
        Long c = 30L;
        Long d = 40L;
        Long e = 50L;
        
        //Mencetak nilai variabel
        System.out.println("MENCETAK NILAI MASING MASING VARIABEL");
        System.out.println("nilai a = "+a);
        System.out.println("nilai b = "+b);
        System.out.println("nilai c = "+c);
        System.out.println("nilai d = "+d);
        System.out.println("nilai e = "+e);
        
        //Menukar niali variabel a,b dan c (a=20.b=30,c=10
        Long f = a;
        a = b;
        b = c;
        c = f;
        System.out.println("MELAKUKAN PERTUKARAN NILAI ANTARA a,b DAN c");
        System.out.println("setelah pertukaran nilai a menjadi : "+a);
        System.out.println("setelah pertukaran nilai b menjadi : "+b);
        System.out.println("setelah pertukaran nilai c menjadi : "+c);
        
        // Mengupdate nilai variabel d menjadi 100000 dan mengubah nilai variabel e menjadi nilai variabel d
        d = 10000L;
        e = d;
        System.out.println("MENGUPDATE NIALAI d DAN e");
        System.out.println("nialai d = "+d);
        System.out.println("nilai e = "+e);
        
       
        
       
                   

    }
    
}
