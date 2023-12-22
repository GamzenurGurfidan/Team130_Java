package day07_IfElseStatement;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z'){
            System.out.println("büyük harf");
        } else if (karakter >= 'a' && karakter <= 'z') {
            System.out.println("küçük harf");
        } else {
            System.out.println("yanlış karakter girişi");
        }



        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z'){
            System.out.println("Girilen karakter büyük harftir");
        }else{
            System.out.println("Girilen karakter büyük harf değildir");
        }
         */

    }
}
