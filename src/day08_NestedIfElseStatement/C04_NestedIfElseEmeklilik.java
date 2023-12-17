package day08_NestedIfElseStatement;

import java.util.Scanner;

public class C04_NestedIfElseEmeklilik {
    public static void main(String[] args) {
        // Soru 1-  Kullanicidan cinsiyetini ve yasini alin, +
        //          Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //          Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //          veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cinsiyetiniz ");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Yaşınız ");
        int yasin = scanner.nextInt();

        if (cinsiyet == 'K'){
            if (yasin > 75 || yasin < 15){
                System.out.println("bu yaşlar için sorgumuz yoktur");
            } else if (yasin >= 60){
                System.out.println("Kadın emekli olabilirsin");
            } else {
                System.out.println("emekli olamazsın " + (60 - yasin) + " yıl çalışmalısın");
            }

        } else if (cinsiyet == 'E') {
            if (yasin > 80 || yasin < 15){
                System.out.println("bu yaşlar için sorgumuz yoktur");
            } else if (yasin >= 65){
                System.out.println("Erkek emekli olabilirsin");
            } else {
                System.out.println("emekli olamazsın " + ( 65 - yasin) + " yıl çalışmalısın");
            }

        }else {
            System.out.println("hatalı cinsiyet girişi");
        }


    }
}
