package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_KullanicidanAlinanSayilariToplama {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar alin
        // toplam 500'u gecerse
        // "Bu kadar sayi yeter, ... adet sayi girdinir ve toplami ... oldu" yazdirin
        // ve işlemi bitirin

        Scanner scanner = new Scanner(System.in);

        double sayi = 0;
        double toplam = 0;
        int sayac = 0;

        while (toplam <= 500){
            System.out.println("lutfen toplanmak uzere sayi giriniz");
            sayi = scanner.nextDouble();

            sayac++;
            toplam += sayi;
        }
        System.out.println("bu kadar yeter "+ sayac + " adet sayi girdiniz ve toplamı " + toplam);


    }
}
