package day12_StringManipulations;

import java.util.Scanner;

public class C06_StringManipulations {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip,
        //          asagidaki sartlari kontrol edin ve
        //          kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //          eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir şifre giriniz: ");
        String sifre = scanner.nextLine();

        int flag = 10;

        // ilk harf kücük harf olmalı

        char ilkHarf = sifre.charAt(0);
        if (ilkHarf < 'a' || ilkHarf > 'z'){
            System.out.println("ilk harf küçük harf olmali");
            flag ++;
        }

        // son karakter rakam olmali

        char sonHarf = sifre.charAt(sifre.length()-1);
        if (!(sonHarf >= '0' && sonHarf <= '9')){
            System.out.println("son karakter rakam olmali");
            flag++;
        }

        // şifre boşluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("şifre boşluk icermemeli");
            flag++;
        }

        // uzunlugu en az 10 karakter olmalı

        if (sifre.length()< 10){
            System.out.println("sifre en az 10 karakter olmalı");
            flag++;
        }

        if (flag == 10 ){
            System.out.println("sifre basarıyla kaydedildi");
        }

    }
}
