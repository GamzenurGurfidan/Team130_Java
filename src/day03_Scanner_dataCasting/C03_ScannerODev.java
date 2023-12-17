package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C03_ScannerODev {
    public static void main(String[] args) {

        // Soru 8: Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan ikisinin değerlerini değiştirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı girin: ");
        int birinci = scanner.nextInt();

        System.out.println("İkinci sayıyı girin: ");
        int ikinci = scanner.nextInt();

        System.out.println("Birinci: " + birinci + ", İkinci: " + ikinci);

        birinci = ikinci + birinci;
        ikinci = birinci - ikinci;
        birinci = birinci - ikinci;

        System.out.println("Birinci: " + birinci + ", İkinci: " + ikinci);

    }
}
