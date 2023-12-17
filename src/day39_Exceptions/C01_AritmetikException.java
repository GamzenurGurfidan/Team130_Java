package day39_Exceptions;

import java.util.Scanner;

public class C01_AritmetikException {
    public static void main(String[] args) {
        // kullanıcıdan 2 tam sayi isteyin
        // birinci sayiyi ikinci sayiya bolup
        // sonucun tam sayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bolenecek tamsayiyi girin");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen bolecek tamsayiyi girin");
        int sayi2 = scanner.nextInt();

        if (sayi2 == 0 ) {
            System.out.println("bolecek sayi 0 olamaz");
        }else {
            System.out.println("ilk sayi / ikinci sayi = " + sayi1 / sayi2);
        }
    }
}
