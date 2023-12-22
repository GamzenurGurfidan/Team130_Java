package day07_IfElseStatement;

import java.util.Scanner;

public class C07_Emeklilik {
    public static void main(String[] args) {

        // Soru 1-  Kullanicidan cinsiyetini ve yasini alin, +
        //          Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //          Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //          veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cinsiyetiniz: ");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Yasiniz: ");
        int yas = scanner.nextInt();

        if (cinsiyet == 'E'){
            if(yas < 18 || yas >85){
                System.out.println("gecersiz yas");
            } else if (yas >= 65){
                System.out.println("Emekli olabilirsiniz");
            }else {
                System.out.println("erkeğin emekli olması için " + (65-yas) + " yıl daha çalışması gerek");
            }
        } else if (cinsiyet == 'K') {
            if(yas < 18 || yas >85){
                System.out.println("gecersiz yas");
            } else if (yas >= 60){
                System.out.println("Emekli olabilirsiniz");
            }else {
                System.out.println("erkeğin emekli olması için " + (60-yas) + " yıl daha çalışması gerek");
            }
        }else {
            System.out.println("gecersiz giriş");
        }


        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cinsiyetiniz ");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Yaşınız ");
        int yasin = scanner.nextInt();

        if (cinsiyet == 'E' && yasin >= 65){
            System.out.println("erkek 65 yaşından büyük emekli oabilir");
        } else if (cinsiyet == 'E' && yasin <65) {
            System.out.println("erkek çalışması lazım " + (65 - yasin) + "yıl daha");
        } else if (cinsiyet == 'K' && yasin >= 60) {
            System.out.println("kadın 60 yaşındna büyük emekli olabilir");
        } else if (cinsiyet == 'K' || yasin < 60) {
            System.out.println("kadın " + (60-yasin) + " daha çalışacak" );
        } else {
            System.out.println("hatalı giriş");
        }
        */


/*
        if (cinsiyet == 'E' && yasin >= 65){
            System.out.println("65 yas ve üzeri erkek emekli olabilir ");
        } else if (cinsiyet == 'E' && yasin <65) {
            System.out.println("Emekli olmak için " + (65 - yasin) + " yıl daha çalışmalısın");
        } else if (cinsiyet == 'K' && yasin >= 60) {
            System.out.println("60 yas üstü emekli olabilir");
        } else if ( cinsiyet=='K' && yasin < 60) {
            System.out.println("Emekli olmak için " + (60 - yasin) + " yıl daha çalışmalısın ");
        }else {
            System.out.println("hatalı giriş");
        }

 */

    }
}
