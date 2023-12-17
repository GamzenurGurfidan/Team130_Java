package day15_MethodOlusturma;

import java.util.Scanner;

public class C02_AsalSayiMethodu {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        //         Girilen sayinin asal sayi olup olmadigini kontrol edip,
        //         sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tam sayi girniz");
        int sayi = scanner.nextInt();

        asalSayiMi(sayi);



    }


    public static void asalSayiMi(int sayi){
        // asal sayi veya asal sayi degil yazdiran
        
        int flag = 20;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                flag ++;
                break;
            }
        }

        if (flag == 20){
            System.out.println("Asal sayidir");
        }else {
            System.out.println("Asal sayi degildir");
        }

    }

    public static int asalSayiMi2 (){


        return 0;
    }

}
