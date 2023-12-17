package day7_IfElseStatement;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {
        // Soru 3-  Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //          kullaniciya musteri karti olup olmadigini sorun.
        //          Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        //          Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Urun adedini giriniz: ");
        int urunAdedi = scanner.nextInt();

        System.out.println("Liste fiyatını giriniz: ");
        double listeFiyati = scanner.nextDouble();

        System.out.println("Müsteri kartınız var mı?: ");
        char kart = scanner.next().toUpperCase().charAt(0);

        double yuzde20 = listeFiyati * 0.20;
        double yuzde15 = listeFiyati * 0.15;
        double yuzde10 = listeFiyati * 0.10;

        if (kart == 'E'){
            if (urunAdedi > 10){
                System.out.println("%20 indirim kazandınız yeni fiyat: " + (listeFiyati * urunAdedi*(100 - yuzde20)/100));
            } else if (urunAdedi < 10){
                System.out.println("%15 indirim kazandınız yeni fiyat: " + (listeFiyati * urunAdedi*(100 - yuzde15)/100));
            }
        } else if (kart == 'H') {
            if (urunAdedi > 10){
                System.out.println("%15 indirim kazandınız yeni fiyat: " + (listeFiyati * urunAdedi*(100 - yuzde15)/100));
            } else if (urunAdedi < 10){
                System.out.println("%10 indirim kazandınız yeni fiyat: " + (listeFiyati * urunAdedi*(100 - yuzde10)/100));
            }
        } else {
            System.out.println("geçersiz");
        }

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("ürün adedini ");
        int urunAdedi = scanner.nextInt();

        System.out.println("liste fiyatı ");
        double listeFiyatı = scanner.nextDouble();

        System.out.println("Müsteri kartı var mı?");
        String musKart = scanner.next();

        double yuzde20 = listeFiyatı * 0.20;

        double yuzde15 = listeFiyatı * 0.15;

        double yuzde10 = listeFiyatı * 0.10;

        if (musKart.equalsIgnoreCase("evet")){

            if (urunAdedi >= 10){
                System.out.println("%20 indirim uygulanmış fiyatı:" + listeFiyatı*urunAdedi*(100 - yuzde20)/100);
            } else if (urunAdedi < 10){
                System.out.println("%15 indirim uygulanmış fiyatı:" + listeFiyatı*urunAdedi*(100 - yuzde15)/100);
            }
        } else if (musKart.equalsIgnoreCase("hayır")) {

            if (urunAdedi >= 10){
                System.out.println("%15 indirim uygulanmış fiyatı:" + listeFiyatı*urunAdedi*(100 - yuzde15)/100);
            } else if (urunAdedi < 10){
                System.out.println("%10 indirim uygulanmış fiyatı:" + listeFiyatı*urunAdedi*(100 - yuzde10)/100);
            }
        }else {
            System.out.println("yanlış değer.");
        }

         */


        /*
        if (musKart.equalsIgnoreCase("evet") && urunAdedi >= 10) {
            System.out.println("%20 indirim uygulanmış fiyatı:" + (listeFiyatı - yuzde20));
        } else if (musKart.equalsIgnoreCase("evet") && urunAdedi < 10) {
            System.out.println("%15 indirim uygulanmış fiyatı:" + (listeFiyatı - yuzde15));
        }

        if (musKart.equalsIgnoreCase("hayır") && urunAdedi >= 10) {
            System.out.println("%15 indirim uygulanmış fiyatı:" + (listeFiyatı - yuzde15));
        } else if (musKart.equalsIgnoreCase("hayır") && urunAdedi < 10) {
            System.out.println("%10 indirim uygulanmış fiyatı:" + (listeFiyatı - yuzde10));
        }
         */


    }
}
