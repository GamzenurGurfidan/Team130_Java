package day22_mutiDimensionalArrays_ArrayLists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_MDa {
    public static void main(String[] args) {

        // Soru 2 - Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        //          yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //          input :     int[][] arr = {{3,4,5}, {2,3,6,7,8},{1,2,3},{2,4}};
        //          output:                      [5, 7, 11]

        // output arrayi kisa inner arrayin uzunluguna esit olacak
        // inner array sayisini dinamik olacak şekilde dusunelim

        int[][] arr = {{3,4,5}, {2,3,6,7,8},{1,2,3},{2,4}};

        // outputun uzunlugu en kisa arrayin uzunluguna esit olacak
        // o zaman once en kisa inner arayin uzunlugunu bulalim

        int enKisaInnerleght = arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length < enKisaInnerleght){
                enKisaInnerleght = arr[i].length;
            }
        }

        System.out.println(enKisaInnerleght);

        int[] output = new int[enKisaInnerleght];

        for (int i = 0; i < output.length; i++) { // outputun içine konacak index

            for (int j = 0; j < arr.length; j++) { // arr'deki herbir inner arrayin elementini bulacak
                output[i] += arr[j][i];

            }

        }
        System.out.println(Arrays.toString(output));
    }
}
