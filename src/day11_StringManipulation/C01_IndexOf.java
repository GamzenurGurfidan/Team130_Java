package day11_StringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str = "Java cok güzel bir programlama dili.";

        System.out.println(str.contains("a")); // var mı yok mu : true

        System.out.println(str.indexOf("a")); // ilk a hangi indexte : 1

        System.out.println(str.indexOf('c')); //char olarak da sorulur 5

        System.out.println(str.charAt(5)); // c

        System.out.println(str.indexOf("a ")); // nerden başladıgını söyle : 3

        System.out.println(str.indexOf("güzel")); // 9

        System.out.println(str.indexOf(" ")); // ilk boslgun indexini verir : 4

        System.out.println(str.indexOf(" ", 10)); // 10. satırdaki boşlugun indexini istiyor:

        // ikinci spacein indexi?

        System.out.println(str.indexOf(" ", 4 + 1)); // 4 yazarsan 4 deki spacei yakalar bir fazlasını söylemen lazım

        // ikinci i nin indexi
/*
        System.out.println(str.indexOf("i")); // 16
        str.indexOf("i", 17); // dinamik değil

 */

        System.out.println(str.indexOf("i", str.indexOf("i") + 1));
        ; //32

        // ikinci a

        System.out.println(str.indexOf("a", str.indexOf("a") + 1)); //3

        //olmayan string

        System.out.println(str.indexOf("x")); // olmayan degerden -1 döner

        //ikinci c olup olmadigini yazdir

        int ilkCindex = str.indexOf("c");

        if (ilkCindex == -1) {
            System.out.println("verilen metin de C harfi bulunamadı");
        } else if (str.indexOf("c", ilkCindex + 1) == -1) {
            System.out.println("İkinci C harfi yoktur.");
        } else {
            System.out.println("2. c vardır");
        }

        System.out.println(str.indexOf("c", str.indexOf("c")+1));


    }
}
