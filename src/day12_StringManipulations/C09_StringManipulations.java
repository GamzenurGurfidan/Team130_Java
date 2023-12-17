package day12_StringManipulations;

import java.util.Scanner;

public class C09_StringManipulations {
    public static void main(String[] args) {

        // kullanıcıdan isim, soyisim ve kredi karti numarasını alin
        // gorunurIsim olarak A****** N******* şeklinde
        // sadece ilk harrfler buyuk gözüksün, diğer harfler yıldız
        // gorunur kart no **** **** **** 1234 oolsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("İsim  giriniz");
        String isim = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("soyisim giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Kart no giriniz");
        String kkNo = scanner.nextLine();

        String gorunurIsim = isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\w","*") +
                " " +
                soyisim.substring(0,1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S","*");

        String gorunurKart = "**** **** ****" + kkNo.substring(kkNo.length()-4);

        System.out.println(gorunurIsim );
        System.out.println(gorunurKart);
    }
}
