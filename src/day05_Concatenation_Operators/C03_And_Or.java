package day05_Concatenation_Operators;

import java.util.Scanner;

public class C03_And_Or {
    public static void main(String[] args) {

        // Kullanicidan not isteyin
        // girilen not 0 ile 100 arasinda ise true, yoksa false yazdiralim
        // 0 ve 100 dahil true

        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu giriniz: ");
        double not = scanner.nextDouble();

        System.out.println(not >= 0 && not <= 100 );
        System.out.println(not < 50 || not > 80);




        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        int not = scanner.nextInt();

        System.out.println(not >= 0 && not <= 100);

        // not 50den küçükse veya 80den büyükse true
        //arasında ise false yazsın

        System.out.println( not < 50 || not > 80 ); // istenen durum

        // önce istenmeyen durumu yazalim
        // sonra başına ! koyalım

        System.out.println( ! (not >= 50 && not <= 80) ); //istenmeyen durumun (istenenin tersi)-
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("notunuzu giriniz: ");
        double notun = scanner.nextDouble();

        System.out.println(notun >= 0 && notun <= 100);
        System.out.println(notun < 50 || notun > 80);
        System.out.println(!(notun >= 50 && notun <= 80));
        */

    }
}
