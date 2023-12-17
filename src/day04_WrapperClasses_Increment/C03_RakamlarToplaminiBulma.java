package day04_WrapperClasses_Increment;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        // kullanıcıdan 3 basamaklı bir tam sayı alıp
        // sayının rakamlar toplamını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif tam sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        // diyelimki kullanıcı 375 sayısını girdi
        // bize birler basamağını ve rakamlar toplamını kaydedeceğimiz 2 variable

        int birlerBasma = 0;
        int rakamlarTop = 0;

        birlerBasma = girilenSayi % 10; //5
        rakamlarTop = rakamlarTop + birlerBasma; // 0=0+5 5

        // 5'i rakamlar toplmına ekledik
        // 5'den kurtulalım
        girilenSayi = girilenSayi / 10; // 37


        birlerBasma = girilenSayi % 10; //7
        rakamlarTop = rakamlarTop + birlerBasma; //5=5+7 12
        girilenSayi = girilenSayi / 10; // 3

        birlerBasma = girilenSayi % 10 ; //3
        rakamlarTop = rakamlarTop + birlerBasma; //12=12+3
        girilenSayi = girilenSayi / 10; //0

        rakamlarTop = rakamlarTop + girilenSayi;
        System.out.println("girilen sayını rakamlar toplamı: " + rakamlarTop);


    }
}
