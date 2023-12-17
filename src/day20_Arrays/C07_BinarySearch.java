package day20_Arrays;

import day19_Array.C04_KullaimAdediniBulma;

import java.util.Arrays;

public class C07_BinarySearch {
    public static void main(String[] args) {

        String[] harfler = {"a","c","r","s","a","a","s","k","a"};

        // verilen harfler arrayinde "k" harfinin olup olmadıgını yazdirin

        C04_KullaimAdediniBulma.elemanArama(harfler,"k");
        //istenen eleman k, arrayde 1 kere kullanılmış

        //"A" var mı

        C04_KullaimAdediniBulma.elemanArama(harfler, "A");
        // istenen eleman A harfi arrayde yok

        int[] arr = {3,9,1,17,5,2,20};
        // 2 var mı

        System.out.println(Arrays.binarySearch(arr, 2)); // -1
        System.out.println(Arrays.binarySearch(arr,20)); // 6
        System.out.println(Arrays.binarySearch(arr, 1)); // -1
        System.out.println(Arrays.binarySearch(arr,17)); // 3
        System.out.println(Arrays.binarySearch(arr, 3)); // 0
        System.out.println(Arrays.binarySearch(arr,9)); // 1
        System.out.println(Arrays.binarySearch(arr, 5)); // -2

        // BinarySearc, binaryTree ozelliğni kullandigindan
        // aarama isleminden once sort islemi YAPILMALIDIR
        // sort islemi yapilmadan binarySearch kullanilirsa
        // sonuc ONGORULEMEZ, dogru da olabilir yanis da

        Arrays.sort((arr));
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 9, 17, 20]
        System.out.println(Arrays.binarySearch(arr, 2)); // 1
        System.out.println(Arrays.binarySearch(arr,20)); // 6
        System.out.println(Arrays.binarySearch(arr, 1)); // 0
        System.out.println(Arrays.binarySearch(arr,17)); // 5
        System.out.println(Arrays.binarySearch(arr, 3)); // 2
        System.out.println(Arrays.binarySearch(arr,9)); // 4
        System.out.println(Arrays.binarySearch(arr, 5)); // 3

        // [1, 2, 3, 5, 9, 17, 20]
        System.out.println(Arrays.binarySearch(arr, -3)); // -1
        System.out.println(Arrays.binarySearch(arr,0)); // -1
        System.out.println(Arrays.binarySearch(arr, 4)); // -4
        System.out.println(Arrays.binarySearch(arr, 6)); // -5
        System.out.println(Arrays.binarySearch(arr, 18)); // -7
        System.out.println(Arrays.binarySearch(arr, 50)); // -8
        System.out.println(Arrays.binarySearch(arr,100)); // -8
        System.out.println(Arrays.binarySearch(arr, 44)); // -8

        // olmayan sayilarda OLMADIGINI belirtmek için kullanılır
        // -0 anlamsız olacagindan
        // omayan elementlerin yerlerini SIRA olarak verir--





    }
}
