package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        /*
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen isminizi giriniz: ");
            char isim = scanner.nextLine().charAt(0);

            scanner = new Scanner(System.in);
            System.out.println("Lütfen soyisminizi giriniz: ");
            String soyisim = scanner.nextLine().toUpperCase();

            System.out.println("Lütfen yaşınızı giriniz: ");
            int yası = scanner.nextInt();

            System.out.println("Girilen bilgiler: " + isim + " " + soyisim + ", " + yası);
          */

        Scanner scanner =new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
        char isim = scanner.nextLine().charAt(0);

        System.out.println("Soyisminizi giriniz: ");
        String soyisim = scanner.nextLine();

        System.out.println("Yasınızı giriniz: ");
        byte yasınız = scanner.nextByte();

        System.out.println("Girilen bilgiler: " + isim + " "+ soyisim +", "+ yasınız);




    }
}
