package day39_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_CokluTryCatch {
    public static void main(String[] args) {
        // kullanıcıdan 2 tam sayi isteyin
        // birinci sayiyi ikinci sayiya bolup
        // sonucun tam sayi kismini yazdirin
        /*
            birden fazla risk varsa,
            cozum olarak
            1- riskler ayri ayri try catch icinde alınabilir
            2- ic ice try catch kullanılabilir
            3- tek try birden fazla catch blogu alabilir
            4- tek try, tum riskleri kapsayan bir catch blogu olabilir
         */

        Scanner scanner = new Scanner(System.in);

        int sayi1 = 0;
        int sayi2 = 1;

        try {
            System.out.println("Lütfen bolenecek tamsayiyi girin");
            sayi1 = scanner.nextInt();

            System.out.println("Lutfen bolecek tamsayiyi girin");
            sayi2 = scanner.nextInt();

            System.out.println("ilk sayi / ikinci sayi = " + sayi1 / sayi2);

        } catch (Exception e) { // exception her türlü exceptionı yakalar

            System.out.println("Yanlış bir seyler var..");

        }
    }
}
