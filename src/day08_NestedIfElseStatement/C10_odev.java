package day08_NestedIfElseStatement;

import java.util.Scanner;

public class C10_odev {
    public static void main(String[] args) {
        // kullanıcıdan bir sayi alın ve mutlak degerini yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println(sayi < 0 ? -sayi : sayi );




    }
}
