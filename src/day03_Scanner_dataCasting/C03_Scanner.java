package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip
        //                     ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz: ");
        int birinci = scanner.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int ikinci = scanner.nextInt();

        // diyelim ki ilk sayı 10, ikinci sayı 20
        // ilk sayıyı 20, ikinciyi 10 yap

        int boskova = 0;
        boskova = birinci;
        birinci = ikinci;
        ikinci = boskova;

        System.out.println("Verdiğin değerlerin yerini değiştirdim");
        System.out.println("birinci artık: " + birinci + ", ikinci artık: " + ikinci);



    }
}
