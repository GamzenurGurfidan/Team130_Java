package day06_IfElseStatement;

import java.util.Scanner;

public class C04_AyIsmiYazdirma {
    public static void main(String[] args) {

        // Kullanicidan bir harf alın
        // harf ile başlayan bir AY varsa yazdırın
        // büyük küçük harf duyarlılığı olmasın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz: ");
        char harf = scanner.next().charAt(0);

        if (harf == 'o' || harf == 'O'){
            System.out.println("Ocak");
        }
        if (harf == 'ş' || harf == 'Ş'){
            System.out.println("Şubat");
        }
        if (harf == 'm' || harf == 'M'){
            System.out.println("Mart veya Mayıs");
        }
        if (harf == 'n' || harf == 'N'){
            System.out.println("Nisan");
        }
        if (harf == 'h' || harf == 'H'){
            System.out.println("Haziran");
        }
        if (harf == 't' || harf == 'T'){
            System.out.println("Temmuz");
        }
        if (harf == 'a' || harf == 'A'){
            System.out.println("Aralık veya Ağustos");
        }
        if (harf == 'e' || harf == 'E'){
            System.out.println("Eylül veya Ekim");
        }
        if (harf == 'k' || harf == 'K'){
            System.out.println("Kasım");
        }

    }
}
