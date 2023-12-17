package day29_ImmutableClassees;

import java.util.Scanner;

public class C01_PassByValueVariable {
    // bir method yapip, verilen sayinin karesini dondurun

    public static void main(String[] args) {
        int sayi = 11;

        System.out.println(getSquare(sayi));

        /*
               Verilen sayinin kupunu donduren bir method olusturun
               main methodda kullanıcıdan bir deger alıp, kupunu hesaplatalım
               ve yeni degeri kullanıcıdan alinan deger olarak kaydedelim
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        girilenSayi = getCube(girilenSayi);
        System.out.println(girilenSayi);

    }

    public static int getCube(int girilenSayi) {
        return girilenSayi * girilenSayi * girilenSayi;
    }

    private static int getSquare(int a) {

        return a * a;
    }

}
