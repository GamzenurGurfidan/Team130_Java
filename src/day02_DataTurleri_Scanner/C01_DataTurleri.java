package day02_DataTurleri_Scanner;

public class C01_DataTurleri {
    public static void main(String[] args) {

        int sayi = 23; // hafızada 32 bit kullanır

        byte sayi1 = 23; // hafızada 8 bit kullanır

        short sayi2 = 23; // hafızada 16 bit kullanır

        long sayi3 = 23; // hafızada 64 bit kullanır

        char ch1 = '4';
        char ch2 = ' '; // space de bir karakterdir

        String str1 = "Java Candır";
        String telNo = "5552344567";
        // tel no matematik işlemlerinde kullanılmadığndan ve intten büyük olduğundan String olarak tutulabilir

        System.out.println("str1"); // str1
        System.out.println(str1);   // Java Candır

        int x = 23;
        int y = 12;

        // iki sayının toplamı

        System.out.println("iki sayının toplamı " + (x + y)); // 35

        x = 15;

        System.out.println("x: " + x);

        x = 3 * x + 1;

        System.out.println("x'in yeni değeri: " + x); // x'in yeni değeri: 46

        float fl1 = 20f;
        float fl2 = 6f;

        System.out.println(fl1 / fl2); // 3.3333333 "yedi tane yazdırır floatta"

        double dbl1 = 20;
        double dbl2 = 6;

        System.out.println( dbl1 / dbl2); //3.3333333333333335

    }
}
