package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        /*
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen çemberin yarı çapını giriniz: ");
            double yaricap = scanner.nextDouble();

            System.out.println("Çemberin çevresi: " + (2 * 3.14 * yaricap));
            System.out.println("Dairenin alanı: " + (3.14 * yaricap * yaricap));
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Çemcerin yarı çapını giriniz: ");
        double yaricap = scanner.nextDouble();

        System.out.println("Çemberin çevresi: " + (yaricap * 2 * 3.14));
        System.out.println("Çemberin alanı: " + (3.14 * yaricap * yaricap));


    }
}
