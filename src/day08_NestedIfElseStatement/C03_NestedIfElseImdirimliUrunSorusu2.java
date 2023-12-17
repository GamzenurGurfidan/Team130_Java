package day08_NestedIfElseStatement;

import java.util.Scanner;

public class C03_NestedIfElseImdirimliUrunSorusu2 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satın aldiğiniz ürün adedini giriniz");
        int urunAdedi = scanner.nextInt();

        System.out.println("aldiğiniz ürünün indirimsiz fiyatını giriniz");
        double indirimsizFiyat = scanner.nextDouble();

        System.out.println("musteri kartiniz var mi?");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        int indirimOranı = 0;

        if (urunAdedi > 10) {
            //urun miktari 10dan çok olanlar
            if (kartVarMi =='E'){
                indirimOranı = 20;
            } else if (kartVarMi =='H') {
                indirimOranı = 15;
            }else {
                System.out.println("kart bilgisi hatalı");
            }

        } else if (urunAdedi > 0) {
            //urun miktari 1-10 (dahil) arasına olanlar

            if (kartVarMi == 'E'){
                indirimOranı = 15;
            } else if (kartVarMi =='H') {
                indirimOranı = 10;
            }else {
                System.out.println("kart bilgisi hatali");
            }

        } else {
            //urun miktarı 0 veya negatif olanlar
            System.out.println("urun miktarı hatalı");
        }

        System.out.println( indirimOranı + " indirimli toplam fiyat " +
                urunAdedi * indirimsizFiyat * ( 100- indirimOranı) / 100);


    }
}
