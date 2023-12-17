package day24_ArrayList_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C06_HarfKullanımSayisiniBulma {
    public static void main(String[] args) {
        // Soru 4 - Kullanicidan bir cumle ve bir harf alin,
        //          harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //          kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("aranacak harfi giriniz");
        String harf = scanner.next().substring(0,1);

        /*
            cumledeki herbir harfe iki turlu ulasabiliriz
            1- for loop ve substring ile
            2- split ile arraye cevirip, for-each loop ile

         */

        String[] cumleHarfArray = cumle.split("");

        // System.out.println(Arrays.toString(cumleHarfArray));

        int sayac = 0 ;

        for (String each: cumleHarfArray){

            if (each.equalsIgnoreCase(harf)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("harf cumlede kullanılmamiş");
        }else {
            System.out.println("verilen harf " + sayac + " kez kullnaılmıştır");
        }


    }
}
