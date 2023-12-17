package day04_WrapperClasses_Increment;

import java.util.Scanner;

public class C02_Modules {
    public static void main(String[] args) {

        System.out.println(25 % 8); //1
        System.out.println(25 / 8); //3

        // 1245354423 8 böl kalan ?

        System.out.println(1245354423 % 8); //7
        System.out.println(741852963 % 113);

        System.out.println(56476586 % 3);

        // kullanıcıdan bir sayı iste , birler basamağını yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("Girilen sayının birler basamağı: " + (sayi % 10));

        // 375
        System.out.println(375 % 10); // 5 -> birler basamağını verir
        System.out.println(375 / 10); // 37 -> birler basamağı hariç, kalan sayıları verir

        System.out.println(37 % 10); //7
        System.out.println(37 / 10); //3

        System.out.println(3 % 10); //3
        System.out.println(3 / 10); //0




    }
}
