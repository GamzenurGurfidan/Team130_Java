package day08_NestedIfElseStatement;

import java.util.Scanner;

public class C02_NestedIfElseIndirimliUrunSorunu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satın aldiğiniz ürün adedini giriniz");
        int urunAdedi = scanner.nextInt();

        System.out.println("aldiğiniz ürünün indirimsiz fiyatını giriniz");
        double indirimsizFiyat = scanner.nextDouble();

        System.out.println("musteri kartiniz var mi?");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);


        int indirimOranı = 0;

        /*
            if else ile soru cozerken
            degisken sayisi 1den fazla ise ic ice if else cumleleri kullanabiliriz

            once degiskenlerden birini
            asıl degisken secip yapiyi one göre kuralım

            bu classta musteri karti asıl değişken olsun-
         */

        if (kartVarMi == 'E') {
            if (urunAdedi > 10 ){
                indirimOranı = 20;
            } else if (urunAdedi > 0) {
                indirimOranı= 15;
            } else {
                System.out.println("urun miktarı hatali");
            }

        }else if(kartVarMi == 'H'){
            if (urunAdedi > 10 ){
                indirimOranı = 15;
            } else if (urunAdedi >0) {
                indirimOranı = 10;
            } else {
                System.out.println("urun miktarı hatalı");
            }
        }else {
            System.out.println("kart bilgisi hatalı");
        }

        if (indirimOranı > 0 ){
            System.out.println(indirimOranı +" indirimli toplam fiyat: " +
                    indirimsizFiyat * urunAdedi* (100 - indirimOranı) / 100 );
        }


    }
}
