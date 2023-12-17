package day21_Arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class c04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int [][] arr = {{3,4,5}, {9,10},{7},{1,2,3,4,5,6}};

        System.out.println(Arrays.toString(arr[1])); // [9, 10]

        System.out.println(arr[1][1]); // 10

        System.out.println(Arrays.toString(arr[2])); // [7]
        System.out.println(arr[2][0]); // 7

        // 10 elementinin yerine deger olarak 5 atayin

        arr[1][1] = 5;

        // 6 elementinin yerine deger olarak 8 atayin

        arr[3][5] = 8;

        // tum arrayi yazdirin

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [9, 5], [7], [1, 2, 3, 4, 5, 8]]


        arr[1][1] += 3;

        System.out.println(Arrays.deepToString(arr));

    }
}
