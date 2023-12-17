package day20_Arrays;

import day19_Array.C02_ArrayinElemanlariniArtirma;

import java.util.Arrays;
import java.util.Scanner;

public class C01_KulalniciyaArrayOluşturtma {
    public static void main(String[] args) {

        // Soru 5 - Kullanicidan array’in boyutunu ve tam sayi elementlerini alip
        //          array’i olusturan ve bize donduren bir method olusturun.

        //System.out.println("ilk array" + Arrays.toString(arrayOlustur()));

        int[] benimArray = arrayOlustur();

        System.out.println("son eray " + Arrays.toString(benimArray));

        // benim arrayimdeki tum sayilari 4 artirin
        benimArray = C02_ArrayinElemanlariniArtirma.elemanlariArtir(benimArray, 4);

        System.out.println("son eray " + Arrays.toString(benimArray));

    }

    public static int[] arrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen array'e kac eleman koyacağınızı giriniz");
        int elamanSayisi = scanner.nextInt();
        
        int[] arr = new int[elamanSayisi];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Array'e eklemek icin bir tamsayi giriniz");
            arr[i] = scanner.nextInt();

        }

        return arr;
    }

}
