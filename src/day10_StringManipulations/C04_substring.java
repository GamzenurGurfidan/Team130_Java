package day10_StringManipulations;

public class C04_substring {
    public static void main(String[] args) {

        String str = "Java Candır";

        //String'de iki farkli yontemle substring elde edebiliriz.

        // 1- tek parametre yazarsak

        System.out.println(str.substring(3)); // a Candır
        System.out.println(str.substring(0)); // Java Candır
        System.out.println(str.substring(9)); // ir

        //son 3 karakteri yazdirin
        System.out.println(str.substring(8)); //dir
        System.out.println(str.substring(str.length()-3)); //dir

        //System.out.println(str.substring(20)); // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length())); //boş verir
        System.out.println("--");

       // System.out.println(str.substring(str.length()+1)); //StringIndexOutOfBoundsException

        // 2- tek parametre yazarsak
        //    ilk parametreye esit olan indexten baslar
        //    ikinci parametreye eşit olan indexe kadar yazdirir
        //    ilk index dahil - ikinci index dahil değil

        // "Java Candır"


        System.out.println(str.substring(1, 6)); // ava C
        System.out.println(str.substring(0, 7)); // Java Ca

        System.out.println(str.substring(1, 2)); //a

        //7. indexdeki elemanı yazdırın
        System.out.println(str.charAt(7)); //n
        System.out.println(str.substring(7, 8)); //n

        //str.charAt(7). char olduğu için yeni method kullanılamıyor
        //str.substring(7,8). String oldugu icin method kullanabiliriz

        System.out.println(str.substring(7, 7)); //hiçlik
        System.out.println("--");

        //System.out.println(str.substring(6, 4));

        // ilk 7 karakter
        System.out.println(str.substring(0, 7)); // Java Ca


    }
}
