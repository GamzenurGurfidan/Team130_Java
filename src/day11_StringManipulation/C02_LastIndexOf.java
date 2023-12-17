package day11_StringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {

        String str = "Bu Java ogrenilecek";

        // e nın ilk kullanımının indexini yazdırın

        System.out.println(str.indexOf("e")); //11

        // e nin son kullanınmının indexini yazdırın

        System.out.println(str.lastIndexOf("e")); // 17

        // u'nun ilk kullanım ve son kullanım indexlerini yazdirin

        System.out.println("ilk index: " + str.indexOf("u")); // 1

        System.out.println("son index: " + str.lastIndexOf("u")); // 1

        // J harfinin bu metinde hiç olmadigini ya da sadece bir defa kullanıldıgını yazdirin

        if (str.indexOf("J") == -1){
            System.out.println("metinde J harfi yoktur");
        } else if (str.indexOf("J") == str.lastIndexOf("J")) {
            System.out.println("metinde J sadece bir dafa kullanılmış");
        }

        System.out.println(str.lastIndexOf("e", 14)); // 15
        System.out.println(str.lastIndexOf("x")); // -1


    }
}
