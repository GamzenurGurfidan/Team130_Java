package day08_NestedIfElseStatement;

import java.util.Scanner;

public class C01_IfElseIfStatement {
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

        double indirimsizToplamSatisFiyati = urunAdedi * indirimsizFiyat;

        if (kartVarMi == 'E' && urunAdedi > 10) {
            System.out.println("%20li fiyat: " + indirimsizToplamSatisFiyati * 80 / 100);
        } else if (kartVarMi == 'E' && urunAdedi <= 10) {
            System.out.println("%15li fiyat: " + indirimsizToplamSatisFiyati * 85 / 100);
        } else if (kartVarMi == 'H' && urunAdedi > 10) {
            System.out.println("%15li fiyat: " + indirimsizToplamSatisFiyati * 85 / 100);
        } else if (kartVarMi == 'H' && urunAdedi <= 10) {
            System.out.println("%10li fiyat: " + indirimsizToplamSatisFiyati * 90 / 100);
        } else {
            System.out.println("girilen değer hatalı");
        }


    }
    }
