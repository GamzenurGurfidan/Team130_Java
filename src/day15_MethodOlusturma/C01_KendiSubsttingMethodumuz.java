package day15_MethodOlusturma;

import java.util.Scanner;

public class C01_KendiSubsttingMethodumuz {
    public static void main(String[] args) {

        /*
            verilen bir string ve baslangic ve bitis indexleri icin asagidaki gorevi tamamlayin

            1- baslangic indexi bitis indexinden buyukse hata yazdirin
            2- baslangic ve/ya bitis indexi verilen Stringin disinda ise hata yazdirin
            3- indexler sinirlar icerisinde ise
               baskangic indexi dahil, bitis indexi haric olacak sekide
               iki index arasinda ki harflar yazidirn
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir metin girniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen baslagic indexini girniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis indexini girniz");
        int bitis = scanner.nextInt();

        if (baslangic > bitis){
            System.out.println("Baslangic indexi bitis indexinden kucuk olmalıdır");

        } else if (baslangic >= metin.length() && bitis > metin.length()) {
            System.out.println("verilen indexler metnin disinda");

        } else {
            for (int i = baslangic ; i < bitis ; i++) {
                System.out.print(metin.charAt(i));
            }

        }
        System.out.println("");
        System.out.println(metin.substring(baslangic,bitis));
    }
}
