package day20_Arrays;

import java.util.Arrays;

public class C04_ArrayElemanEkletme {
    public static void main(String[] args) {

        // Soru 7 - Verilen bir array’e istenen bir elemani ekleyip
        //          bize donduren bir method yazin,
        //          eski array’e yeni degeri atayin.

        int[] arr = {3, 6, 7, 9};

        int eklenecekEleman = 1;

        // arr[3] = eklenecekEleman; //HATA VERİR

        // once 4 kisilik bir arr olustur

        int[] yeniArr = new int[arr.length + 1]; // [0, 0, 0, 0]


        //bir for loop olusturup
        // eski arraydeki tum elementleri yeni arraye kopyalayalim

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];

        }

        //en son element olarak yeniArr'e eklenecek sayiyi atayalim

        yeniArr[yeniArr.length - 1] = eklenecekEleman;

        arr = yeniArr;

        System.out.println(Arrays.toString(arr)); //

        // arraye 5, 7 ,3 ekleyelim

        arr = arrayElemetEkle(arr,5);
        arr = arrayElemetEkle(arr, 7);
        arr = arrayElemetEkle(arr,3);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] arrayElemetEkle (int[] arr , int eklenecekSayi){
        //once uzunlugu eski arrayden 1 fazla olan yeni bir arraye atayalım

        int[] yeniArr = new int[arr.length+ 1];

        // eski arraydeki tum elementleri yeni arraye atayalım

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];
        }
        // en son elementolrak eklenecej sayiyi atayalim

        yeniArr[yeniArr.length-1] =eklenecekSayi;

        return yeniArr;



    }

}
