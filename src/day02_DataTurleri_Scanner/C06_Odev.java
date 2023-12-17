package day02_DataTurleri_Scanner;

import java.util.Scanner;

public class C06_Odev {
    public static void main(String[] args) {

        // Türkçe matematik ve fizik ders notlarını girdiğimiz
        // ve bu notların ortalamasını kullanıcıya veren programı yazınız.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Türkçe notunuzu giriniz: ");
        int turk = scanner.nextInt();

        System.out.println("Matematik notunuzu giriniz: ");
        int mate = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        int fizik = scanner.nextInt();

        double ort = ((turk + mate + fizik) / 3);
        System.out.println("Notların ortalaması: " + ort );

    }
}
