package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_ElementleriSagaKaydirma {
    public static void main(String[] args) {

        // Soru 3 - Verilen bir array’deki tum elementleri bir saga kaydirip,
        //          sondaki elementi de basa tasiyacak bir method olusturun,
        //          array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]

        int[] arr = {4, 5, 6, 7, 1, 0};

        int temp = arr[arr.length - 1]; //dinamik olmasi için son eleman
        // boş kovaya koyduk

        for (int i = arr.length - 1; i >= 1; i--) {

            arr[i] = arr[i - 1];

        }

        // bos kovaya aldıgımız elementi en basa koyalim
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));

        int[] sayilar = {3, 0, 2, 5};

        sayilar = elementleriSagaKaydir(sayilar);
        System.out.println("yeni sayilar " + Arrays.toString(sayilar));
    }

    public static int[] elementleriSagaKaydir(int[] arr) {

        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = temp;

        return arr;

    }

}
