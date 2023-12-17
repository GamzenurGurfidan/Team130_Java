package day06_IfElseStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        /*
            bağımsız if cümleleri kodun geriye kalanıyla ilgilenmez
            sadce if parantezindeki booolean şarta odaklanır
            boolean şart true ise if bodysi çalısir
            boolean şart false ise if bodysi calismaz

            birden fazla bagimsiz if cümlesi kullanıldığında
            girilen değerlere bagli olarak
            tüm if bodyleri devreye girebileceği gibi hiç bir if bodysi devreyebilir.
         */

        //kullanıcıdan 2 değer alın

        Scanner scanner = new Scanner(System.in);
        System.out.println("2 sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // 1. sayi 2. sayidan büyükse aferin yazdırın

        if (sayi1 > sayi2){
            System.out.println("Aferin!");
        }

        // 1. sayi cift ise cift sayilari severim

        if (sayi1 %2 == 0){
            System.out.println("Çift sayilari severim.");
        }

        // 2. sayi 50den büyükse büyük sayilarla işim olmaz

        if (sayi2 > 50){
            System.out.println("Büyük sayilarla isim olmaz.");
        }

        // toplamları 100den küçükse ufak sayilarla işim olmaz

        if (sayi1 + sayi2 < 100){
            System.out.println("Ufak sayılarla isim olmaz.");
        }
    }
}
