package day12_StringManipulations;

import java.util.Scanner;

public class C03_ReplaceAll {
    public static void main(String[] args) {

        // kullanıcıdan bir metin isteyin
        // kullanicinin girdiği metinden space disindaki tum karakterleri
        // ve sayilari silip, metni yeni haliyle yazdirin

        // input : "J1*a34_va+12 C87an.90d654ir,";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scanner.nextLine();

        metin = metin.replaceAll("\\d","");
        System.out.println(metin);

        // spaci korumak için harhangi bir rakamla replca yap

        metin = metin.replaceAll("\\s","5");
        System.out.println(metin);

        // özel karakterlerden kurtulalım

        metin = metin.replaceAll("\\W","");
        System.out.println(metin);

        metin = metin.replaceAll("_","").replaceAll("5"," ");

        System.out.println(metin);

    }
}
