package day08_NestedIfElseStatement;

import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {
         // Kullanıcıdan iki sayi alın ve buyuk olmayan sayiyi yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("2 tane sayi girin: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println( sayi1 > sayi2 ? "sayi2: "+ sayi2 : "sayi1: "+sayi1);
    }
}
