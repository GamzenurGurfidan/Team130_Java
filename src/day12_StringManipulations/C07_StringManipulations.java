package day12_StringManipulations;

import java.util.Scanner;

public class C07_StringManipulations {
    public static void main(String[] args) {

        // Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //          - ismi daha uzun ise, isim ve soyismi
        //          ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //          - soyisim daha uzun ise ismi
        //          ilk harf buyuk digerleri kucuk,
        //          soyismi buyuk harflerle yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("soyismnizi giriniz");
        String soyIsim = scanner.nextLine();

        if (isim.length() > soyIsim.length()){
            System.out.println(
                    isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase()
            + " " +
                    soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1).toLowerCase()
            );

        }

        if (isim.length() < soyIsim.length()){
            System.out.println(
                    isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase()
            + " " +
                    soyIsim.substring(0).toUpperCase()
            );
        }


    }
}
