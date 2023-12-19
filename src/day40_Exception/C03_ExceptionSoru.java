package day40_Exception;

import java.util.Scanner;

public class C03_ExceptionSoru {
    public static void main(String[] args) {
        // Kullaniciya istedigi kadar sayi girmesini soyleyin
        // girdigi sayilardan pozitif olanlari toplayin
        // negatif sayi veya 0 girerse, toplamaya eklemeyin
        // toplama islemini bitirmek icin kullanici Q'ya basmalidir
        // kullanici Q'ya bastiginda
        // toplam kac pozitif sayi girdigini ve toplamlarinin kac oldugunu yazdirin

        int toplananSayiAdedi = 0;
        int toplam = 0;
        int girilenSayi = 0;
        String girilenHarf = "a"; // Q dışında bir deger atadım :)
        Scanner scanner = new Scanner(System.in);

        while (!girilenHarf.equalsIgnoreCase("Q")){

            System.out.println("toplamak üzere pozitif tam sayilar giriniz"+
                    "\nBitirmek için Q'ya basın");

            try {
                girilenSayi = scanner.nextInt();

                if (girilenSayi > 0 ){
                    toplam += girilenSayi;
                    toplananSayiAdedi++;
                }else {
                    System.out.println("negatif sayilar veya 0 isleme dahil edilmez");
                }
            } catch (Exception e) {

                girilenHarf = scanner.next();
                if (!girilenHarf.equalsIgnoreCase("q")){
                    System.out.println("lütfen bir tamsayi yazın veya Qya basin");
                }
            }
        }
        System.out.println(toplananSayiAdedi + " adet sayi girildi ve toplamları: " + toplam);

    }
}
