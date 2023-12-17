package day02_DataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan isim alıp büyük harf yazdır

        Scanner scan = new Scanner(System.in);              // Scan objesi oluştur
        System.out.println("Lütfen isminizi giriniz: ");    // istediğin bilgiyi yazdır

        // istediğin bilgiye uygun veriable oluştur
        // scanner objesi ve uygun next() ile istediğin bilgiyi kullanıcıdan alıp oluşturduğun veriable'a atayın
        String girilenIsim = scan.nextLine();

        // next() bir kelime alır, nextline() bütün girilen satırı alır.

        System.out.println(girilenIsim.toUpperCase());



    }
}
