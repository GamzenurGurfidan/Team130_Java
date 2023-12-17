package day02_DataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz: ");
        int girilenTamSayi = scanner.nextInt();

        System.out.println("Bir ondalıklı sayı giriniz: ");
        double girilenDblSayi = scanner.nextDouble();

        System.out.println("Girilen sayıların toplamı: " + (girilenDblSayi + girilenTamSayi));
        System.out.println("Girilen sayıların çarpımı: " + (girilenDblSayi * girilenTamSayi));

    }
}
