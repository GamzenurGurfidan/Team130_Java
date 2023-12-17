package day10_StringManipulations;

import java.util.Locale;

public class C01_StringManipulations {
    public static void main(String[] args) {

        String str = "Java Candır";

        //büyük harfle yazdırma
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        //küçük harfle yazdırma
        System.out.println(str.toLowerCase()); // java candır

        // String methodlar kullanıldığında orijinal metinler değişmez!
        // Değişiklik yapmak için atama olması gerekmekte,

        System.out.println(str); // Java Candır

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        // str'ı küçük harfe cevirin
        // ancak I harfe cevrildiginde ingilizce i olur

        // eğer metinde ingilizce de olmayan I'yı
        // türkçe kucuk ı'ya cevirmek istersek

        System.out.println(str.toLowerCase(Locale.ENGLISH));


    }
}
