
package niingg_31;


public class Day31 {
    public static void main(String[] args) {
        // Contoh String
        String strByte = "127";
        String strShort = "32000";
        String strInt = "123456";
        String strLong = "9876543210";
        String strFloat = "45.67";
        String strDouble = "12345.6789";
        String strChar = "A";
        String strBoolean = "true";
        
        // Konversi String ke tipe data primitif dengan nama variabel nama warna
        byte red = Byte.parseByte(strByte);
        short green = Short.parseShort(strShort);
        int blue = Integer.parseInt(strInt);
        long yellow = Long.parseLong(strLong);
        float orange = Float.parseFloat(strFloat);
        double purple = Double.parseDouble(strDouble);
        char black = strChar.charAt(0); // Untuk karakter, ambil karakter pertama dari string
        boolean white = Boolean.parseBoolean(strBoolean);

        // Output hasil konversi
        System.out.println("String ke byte (red): " + red);
        System.out.println("String ke short (green): " + green);
        System.out.println("String ke int (blue): " + blue);
        System.out.println("String ke long (yellow): " + yellow);
        System.out.println("String ke float (orange): " + orange);
        System.out.println("String ke double (purple): " + purple);
        System.out.println("String ke char (black): " + black);
        System.out.println("String ke boolean (white): " + white);
    }
}