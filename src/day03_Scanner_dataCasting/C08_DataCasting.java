package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C08_DataCasting {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 3;

        System.out.println(sayi1 / sayi2); //ikisi de intse sonucu da int yapar ==>6

        double sayi3 = 3;

        System.out.println(sayi1 / sayi3); //fakat double işlem yaparsan ==> 6.666666666666667

        //kullanıcıdan 2 tamsayı al
        //1.sayıyı 2. sayıya böl
        //sonucu ondalıklı yazdır

        /*
            Scanner scanner = new Scanner(System.in);
            System.out.println("2 tamsayı giriniz ");

            sayi1 = scanner.nextInt(); //40
            sayi2 = scanner.nextInt(); //7

            double sonuc = (double) sayi1 / sayi2;
            System.out.println("verilen sayıların bölümü " + sonuc); //5.714285714285714
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("iki tam sayi giriniz: ");

        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        double sonuc = (double)sayi1 / sayi2;
        System.out.println(sonuc);


    }
}
