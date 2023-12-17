package day10_StringManipulations;

public class C02_equals {
    public static void main(String[] args) {

        String str1 = "Ahmet";
        String str2 = "AHMET";
        String str3 = "ahmet";
        String str4 = "AhMeT";
        String str5 = "Ahmet";
        String str6 = new String("Ahmet");
        String str7 = "Ah";
        String str8 = "met";
        String str9 = str7 + str8; // Ahmet

        // 1 - String case sensetivedir.
        // str1, str2, str3, str4 değerleri birbirinden farklıdır
        //str1, str5, str6 ve str9 değerleri ise aynıdır

        // Stringde karsılastirma icin == kullanirsaniz
        // metni ayni olan Stringlerde bile false donebilir.
        // == hem metin degerine hem de referansa baktiği icin metni ayni olan
        // farklı Stringler için farkli sonuclar dönebilir

        System.out.println(str1 == str5); //Ahmet == Ahmet true

        System.out.println(str1 == str6); //Ahmet == Ahmet false

        System.out.println(str1 == "Ahmet"); //Ahmet == Ahmet true

        System.out.println(str1 == str9); //Ahmet == Ahmet false

        // iki String metin olarak ayni olup olmadigini kontrol etmek için
        // simdilik == kullanmayacagiz
        // Stringlerde metin olarak ayni olmayi kontrol için
        // equals() kullanilir

        //equals ayni metinler için true döner

        System.out.println(str1.equals(str5)); //true
        System.out.println(str1.equals(str6)); //true
        System.out.println(str1.equals("Ahmet")); //true
        System.out.println(str1.equals(str9)); //true-

        //equals ayni metnin farki yazımlari için
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //false
        System.out.println(str1.equals(str4)); //false

        //EĞER buyuk kucuk harf farkli yazimlari da esit kabul edelim derseniz

        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true
        System.out.println(str1.equalsIgnoreCase(str4)); //true

    }
}
