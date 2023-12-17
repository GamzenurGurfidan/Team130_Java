package day06_IfElseStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        // kullanıcıdan 2 sayı alın

        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayi giriniz: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        // ilk sayi ikinciden büyükse büyüksün sayi1
        /*
        if (sayi1 > sayi2 ){
            System.out.println("Büyüksün sayi1 abi!");
        } */

        boolean sonuc = sayi1 > sayi2;
        if (sonuc ){
            System.out.println("Büyüksün sayi1 abi!");
        }

        // ikinci sayi 0dan büyükse büyüksün sayi 2

        /*
        if (sayi2 > 0){
            System.out.println("Büyüksün sayi2 abi!");
        }*/

        sonuc = sayi2 > 0;
        if (sonuc ){
            System.out.println("Büyüksün sayi2 abi!");
        }

        // 2 sayının toplamı 100den büyüksen ikinizde büyüksünüz
        sonuc = sayi1 + sayi2 > 100 ;
        if (sonuc) {
            System.out.println("Büyüksünüz eyvallah!");
        }

    }
}
