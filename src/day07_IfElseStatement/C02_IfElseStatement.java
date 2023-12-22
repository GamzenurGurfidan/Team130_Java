package day07_IfElseStatement;

import java.util.Scanner;

public class C02_IfElseStatement {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0);

        // 1. yöntem

        if (Character.isLowerCase(karakter)) {
            System.out.println(Character.toUpperCase(karakter));
        } else {
            System.out.println(karakter);
        }

        // 2. Yöntem

        if (karakter >= 'a' && karakter <= 'z') {
            System.out.println((char) (karakter - 32));
        } else {
            System.out.println(karakter);
        }

    }
}
