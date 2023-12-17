package day03_Scanner_dataCasting;

public class C06_ExpilicitNarrowing {
    public static void main(String[] args) {

        // Expilicit narrowing yaptığımızda data kayıtları olabilir
        // hatta bazen data başka bir şeye dönüşebilir

        double dbl = 34.7;
        int sayi = (int)dbl;

        System.out.println(sayi); // 34 ondalıklı kısmı siler.

        int sayi1 = 23;
        byte byt = (byte)sayi1;
        System.out.println("byte mav value: "+ Byte.MAX_VALUE);

        System.out.println("23'ün byte olarak değeri: " + byt); // 23

        int sayi2 = 130;
        byt = (byte)sayi2;
        System.out.println("130'un byte olarak değeri " + byt); // -126

        int sayi3 = 260;
        byt = (byte)sayi3;
        System.out.println("260'un byte olarak değeri " + byt); // 4

        int sayi4 = 2600;
        byt = (byte)sayi4;
        System.out.println("2600'un byte olarak değeri " + byt);

        int sayi5 = 2100000000;
        sayi5 = sayi5 + 500000000; // casting yok ama sınırlar aşıldı
        System.out.println(sayi5); // -1694967296


    }
}
