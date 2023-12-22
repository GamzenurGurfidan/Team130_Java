package day07_IfElseStatement;

import java.util.Scanner;

public class C03_NotYazdirma {
    public static void main(String[] args) {

        // kullanicidan 100 üzerinden notunu alin
        // negatif veya 100'den büyük deger girerse "geçersiz Not"
        // 85 ile 100 arasinda ise (sinirlar dahil) AA
        // 65 dahil büyük ve 85de küçükse BB
        // 50 dahil büyük ve 65den küçükse CC
        // 50'den kücükse DD kaldin yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu Giriniz: ");
        double not = scanner.nextDouble();

        if (not < 0 || not > 100){
            System.out.println("gecersiz not");
        } else if (not >= 85) {
            System.out.println("AA");
        } else if (not >= 65) {
            System.out.println("BB");
        } else if (not >= 50) {
            System.out.println("CC");
        } else if (not >= 40) {
            System.out.println("DD");
        } else{
            System.out.println("FF kaldın");
        }


            /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz: ");
        double not = scanner.nextDouble();

        if (not < 0 || not > 100) {
            System.out.println("geçersiz not");
        } else if (not >= 85) {
            System.out.println("AA");
        } else if (not >= 65) {
            System.out.println("BB");
        } else if (not >= 50) {
            System.out.println("CC");
        } else if (not < 50){
            System.out.println("kaldın");
        }
        
             */


        /*
                if
                else if
                else if
                ...
                else

            şeklinde yazılan bir kod için
            - sonu else ile bittiğinden
            bir sonuç yazdırmama ihtimali yoktur
            - else if ..ile bütün ifler birbirine bağladığından
            aynı anda 2 if bodysinin devreye girme ihtimali yoktur
         */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunu gir lan: ");
        double notun = scanner.nextDouble();

        if (notun< 0 || notun > 100) {
            System.out.println("Geçersiz not");
        } else if (85 <= notun ) {
            System.out.println("AA aldın aferin!!");
        } else if (65 <= notun ) {
            System.out.println("BB aldın tebrikler!!");
        } else if (50 <= notun ) {
            System.out.println("CC aldın ortalama.");
        } else {
            System.out.println("Kaldın defol!");
        }

 */

    }
}
