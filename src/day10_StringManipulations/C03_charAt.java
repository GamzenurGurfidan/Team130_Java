package day10_StringManipulations;

public class C03_charAt {
    public static void main(String[] args) {

        String str = "Java Candir. Gün geçtikçe güzellesecek";

        //ilk harf yazdirin

        System.out.println(str.charAt(0)); // J

        System.out.println(str.charAt(7)); // n

        // soh harfi yazdirin

        System.out.println(str.charAt(10)); // r
        System.out.println(str.charAt(11-1)); // r

        System.out.println(str.charAt(str.length()-1)); // k
        // eger bir kod yazaken verilen inputtaki degisimleri algilasin ve
        // yeni haline göre isteneni yapsin istiyorsak dinamik kod yazmaliyiz

        //bunun icin elle yazacagımız index degerleri yerine
        //metnin lenght'ini kullanabiliriz

        System.out.println(str.length()); // 38

        //sondan 3. harfi yazdirin
        System.out.println(str.charAt(str.length() -3 )); // c

        //olmayan bir index kullansak
        // System.out.println(str.charAt(40)); //sınırların disinda StringIndexOutOfBoundsException

        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException

    }
}
