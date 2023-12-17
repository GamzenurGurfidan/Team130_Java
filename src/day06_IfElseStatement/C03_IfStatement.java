package day06_IfElseStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        //kullanıcıdan bir sayi isteyin
        // sayi 5'e bölünüyorsa sayi %5in tam katı yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0){
            System.out.println("5in tam katı");
        }


        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi1 = scanner.nextInt();

        if (sayi1 % 5 == 0){
            System.out.println("Sayi 5'in tam katıdır");
        }

         */
    }
}
