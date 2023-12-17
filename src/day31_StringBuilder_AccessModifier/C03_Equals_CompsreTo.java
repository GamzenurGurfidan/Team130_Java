package day31_StringBuilder_AccessModifier;

public class C03_Equals_CompsreTo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        String str = "Java";
        StringBuilder sb1 = new StringBuilder(str);

        // System.out.println(sb == str);
        // farkli data turundeki non primitiveler == ile karşılastirilamaz

        System.out.println(sb == sb1); // false
        System.out.println(sb == sb); // true
        // == ile sblarin karsilastirilmasina itiraz etmez
        // ama kendisi ile karsilastirilmasi haric, sonuc hep false gelir

        System.out.println(sb.equals(str)); // false
        System.out.println(sb.equals(sb1)); // false
        System.out.println(sb.equals(sb)); // true
        // equals ile String veya StringBuilderlar ile
        // karsilastirilmasina itiraz etmez,
        // ama kendisi ile karsilastirilmasi hariz sonuc hep false doner

        // String builderlari aynı metne sahip olup olmadıgını ögrenmek icin
        // compareTo kullanılır

        StringBuilder sb2 = new StringBuilder("Hava");
        StringBuilder sb3 = new StringBuilder("Tava");
        StringBuilder sb4 = new StringBuilder("Jale");
        StringBuilder sb5 = new StringBuilder("Jandarma");

        System.out.println(sb.compareTo(sb1)); // Java => Java  0
        System.out.println(sb.compareTo(sb2)); // Java => Hava  2
        System.out.println(sb.compareTo(sb3)); // Java => Tava  -10
        System.out.println(sb.compareTo(sb4)); // Java => Jale  10
        System.out.println(sb.compareTo(sb5)); // Java => Jandarma  8

        /*
            CompareTo ile karsilastirilan StringBuiderlar
            metin olarak ayni ise sonuc 0 olur

            Metinler ayni degilse harf harf karsilastirir farkli olan
            ilk harfin diger String Builderdaki harf ile
            arasında ascii tablosunda kaç karakter
            oldugunu soyler
         */



    }
}
