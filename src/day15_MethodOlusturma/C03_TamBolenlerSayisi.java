package day15_MethodOlusturma;

import java.util.Scanner;

public class C03_TamBolenlerSayisi {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        //         Girilen sayinin pozitif tam bolenleri sayisini bulup
        //         bize donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("tam sayi girin");
        int sayi = scanner.nextInt();

        System.out.println(pozitifTamBolenSayisi(sayi));

    }

    public static int pozitifTamBolenSayisi(int sayi) {
        // 20 ==> 1,2,4,5,10,20,, 20 sayisinin 6 tane pozitif tam böleni vardır.

        int sayac = 0;

        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0){
                sayac ++;
            }

        }

        return sayac;

    }

}
