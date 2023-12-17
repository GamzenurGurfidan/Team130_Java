package day06_IfElseStatement;

import java.util.Scanner;

public class C05_AyIsmiYazdirma2 {
    public static void main(String[] args) {

        // Kullanicidan bir harf alın
        // harf ile başlayan bir AY varsa yazdırın
        // eğer girilen harfle başlayan ay yoksa girdiğiniz harfla başlayan ay yoık yazdırın
        // büyük küçük harf duyarlılığı olmasın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz: ");
        char harf = scanner.next().charAt(0);

        int flag = 1;

        if (harf == 'o' || harf == 'O'){
            System.out.println("Ocak");
            flag++;
        }
        if (harf == 'ş' || harf == 'Ş'){
            System.out.println("Şubat");
            flag++;
        }
        if (harf == 'm' || harf == 'M'){
            System.out.println("Mart veya Mayıs");
            flag++;
        }
        if (harf == 'n' || harf == 'N'){
            System.out.println("Nisan");
            flag++;
        }
        if (harf == 'h' || harf == 'H'){
            System.out.println("Haziran");
            flag++;
        }
        if (harf == 't' || harf == 'T'){
            System.out.println("Temmuz");
            flag++;
        }
        if (harf == 'a' || harf == 'A'){
            System.out.println("Aralık veya Ağustos");
            flag++;
        }
        if (harf == 'e' || harf == 'E'){
            System.out.println("Eylül veya Ekim");
            flag++;
        }
        if (harf == 'k' || harf == 'K'){
            System.out.println("Kasım");
            flag++;
        }

        if(flag == 1){
            System.out.println("Girdiğiniz değerde bir AY yoktur");
        }

    }
}
