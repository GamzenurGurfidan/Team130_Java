package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_KullaniciyaSifreOlusturtma {
    public static void main(String[] args) {
/*
        Soru : Kullanicidan Kullanicidan sifre isteyin
               asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
               kullanicinin yeni sifre girmesi isteyin
               Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
               gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
               sartlar :
                    - ilk harf kucuk harf olmali
                    - son karakter rakam olmali
                    - sifre bosluk icermemeli
                    - uzunlugu en az 10 karakter olmali
 */
        Scanner scanner = new Scanner(System.in);
        int flag = 7; // while loopun çalışmaya baslayip
        // kullanıcıdan deger alabilmemiz için
        // 0 dişinda bir deger girdik
        String sifre = "";

        while (flag > 0) {

            flag = 0;

            System.out.println("lütfen bir şifre giriniz");
            sifre = scanner.nextLine();

            // -ilk harf kucuk harf olmalı
            char ilkHarf = sifre.charAt(0);

            if (!(ilkHarf >= 'a' && ilkHarf <= 'z')){

                System.out.println("ilk harf küçük olmali");
                flag++;
            }

            // -son karakter rakam olmali
            char sonKarakter = sifre.charAt(sifre.length()-1);

            if (!(sonKarakter >= '0' && sonKarakter<= '9')){

                System.out.println("son karakter rakam olmali");
                flag++;
            }
            if (sifre.contains(" ")){
                System.out.println("şifre boşluk içermemeli");
                flag++;
            }

            // -uzunlugu en az 10 karakter olmali
            if (sifre.length() < 10){
                System.out.println("uzunlugu en az 10 karakter olmali");
                flag++;
            }


        }
        System.out.println("şifreniz basarıyla kaydedildi");

    }
}
