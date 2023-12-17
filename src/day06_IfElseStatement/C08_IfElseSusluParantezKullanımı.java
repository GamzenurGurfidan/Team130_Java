package day06_IfElseStatement;

import java.util.Scanner;

public class C08_IfElseSusluParantezKullanımı {
    public static void main(String[] args) {

        // kullanıcıdan 2 tamsayı
        // eğer sayi1 sayi2den büyükse sayi1i 1 azalt sayi2yi 1 artır
        // sayı1 ikiden büyük değilse o zaman sayı1i 3le çarp sayi2yi 2 ile çarp
        // son değerlerini yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("İki sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        /*
            Eğer eğer if ve elseden sonra {} kullanmazsak
            Java if body ve else body olarak ilk noktalı virgile kadar kısmı alır.

            Eğer if ve else bodyleri tek bir satırda oluyorsa
            süslü paratez kullnamasak da olur
            amma if bodysi veya else bodysinde bir satırdan fazla kod varsa kullanmka şart
            
         */

        if (sayi1 > sayi2) {
            sayi1--;
            sayi2++;
        } else {
            sayi1 *= 3;
            sayi2 *= 2;
        }

        System.out.println("sayi1'in yeni değeri " + sayi1 + ", sayi2'nin yeni değeri " + sayi2);

    }
}
