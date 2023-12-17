package day12_StringManipulations;

public class C01_Replace {
    public static void main(String[] args) {

        String str = "Hava Candır.";

        System.out.println(str.replace("H", "J")); // Java Candır
        System.out.println(str); // atama yapmadığı için kalıcı olmaz

        str = str.replace("Hava","J").replace(".",",");

        System.out.println(str);

        System.out.println(str.replaceFirst("a","A")); // hepsini değil ilk a'yi degistirecek // JAva Candır,

        System.out.println(str.replace("a","A")); // JAvA CAndır,

        System.out.println(str.replace(" ","")); //boşluğu hiçlikle degistirdik

        str = "Ali uzunkavaklaraltindayatauyumazoglu";

        System.out.println(str.replace("u", "U"));

        System.out.println(str.replace("l", "XYZ"));

    }
}
