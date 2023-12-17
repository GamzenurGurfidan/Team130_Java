package day21_Arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C08_MDA_SartliUptade {
    public static void main(String[] args) {

        // verilen 2 katli multi dimensional arrayde
        // elementleri icinde bulundugu inner arraydeki indexi kadar artirin

        int[][] arr = {{4,-1,-5},{6,-9,2},{1,5,-8,-4,3,6}};


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] += j;

            }

        }

        System.out.println(Arrays.deepToString(arr));
        // [[4, 0, -3], [6, -8, 4], [1, 6, -6, -1, 7, 11]]
    }
}
