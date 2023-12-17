package day39_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        // kullanıcıdan 2 tam sayi isteyin
        // birinci sayiyi ikinci sayiya bolup
        // sonucun tam sayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);
        /*
            iyi bir coder
            yazdıgı kodun neresinde, ne tur sorunlar olusabilecegini ongorup
            sorun olusabilecek durumlar icin
            Javaya yapması gerekenleri tembihler

            eger ongorulen risk birden fazla ise
            bu riski tasıyan kodlar
            ayri ayri try catch bloklari ile
            handle edilebilir

            ama bu durumda ikisi ayri ayri oldugundan sekronize çalışmayabilir

         */
        int sayi1 = 0;
        int sayi2 = 1;

        try {
            System.out.println("Lütfen bolenecek tamsayiyi girin");
            sayi1 = scanner.nextInt();

            System.out.println("Lutfen bolecek tamsayiyi girin");
            sayi2 = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Tamsayi dedik TAMSAYI..");
        }
        try {
            System.out.println("ilk sayi / ikinci sayi = " + sayi1 / sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Bölünecek sayi 0 olamaz");
        }
    }
}
