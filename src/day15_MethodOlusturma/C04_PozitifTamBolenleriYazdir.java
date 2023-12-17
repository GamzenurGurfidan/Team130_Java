package day15_MethodOlusturma;

import java.util.Scanner;

public class C04_PozitifTamBolenleriYazdir {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        //        Girilen sayinin pozitif tam bolenlerini yanyana yazdiran
        //        bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("tam sayi girin");
        int sayi = scanner.nextInt();

        pozirifBolenleriYazdir(sayi);

        pozirifBolenleriYazdir(640);

        // No String
        // No Boolen

        pozirifBolenleriYazdir('z'); // ascii tablosuna göre bakiyor

        /*
            method callda kullanılan argument ile
            method parametreleri uyumlu OLMALIDIR

            eger method ya da parametreker uyumlu olmazsa CTE olusur
            kod calismaz
         */

    }
    public static void pozirifBolenleriYazdir(int sayi){

        for (int i = 1; i <= sayi ; i++) {

            if (sayi %i == 0){
                System.out.print(i + " ");
            }

        }
        System.out.println("");
    }
}
