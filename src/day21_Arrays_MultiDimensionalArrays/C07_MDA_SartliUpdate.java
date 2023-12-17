package day21_Arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C07_MDA_SartliUpdate
{
    public static void main(String[] args)
    {
        // verilen iki katli bir arrayde
        // pozitif sayilarin degerini 3 azaltip
        // negatif sayilarin degerini 4 arttirin

        int[][] arr = {{4, -1, -5}, {6, -9, 2}, {1, 5, -8, -4, 3, 6}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > 0) {

                    arr[i][j] -= 3;

                } else if (arr[i][j] < 0) {
                    arr[i][j] += 4;
                }

            }

        }
        System.out.println(Arrays.deepToString(arr));
        //[[1, 3, -1], [3, -5, -1], [-2, 2, -4, 0, 0, 3]]
    }

}
