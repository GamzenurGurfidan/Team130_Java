package day28_PassByValue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_PassByValue_CokElementliYapilar {
    public static void main(String[] args) {

        int[] arr = {3,4,5};

        // verilen int arrayin elementlerinin degerlerini
        // 2 artirip, arrayin yeni halini yazdirin bir method olusturun

        System.out.println( "main method öncesi " + Arrays.toString(arr));

        elemanlariArtiripYazdir(arr);
        System.out.println("main method, method call sonrasi " + Arrays.toString(arr));

        // verilen arraye 5 elemenlı yeni bir array atayip
        // yeni halini yazdiran bir method olusturun

        System.out.println( "main method 2. method call öncesi " + Arrays.toString(arr));

        yeniArrayAta(arr);
        System.out.println("main method,2. method call sonrasi " + Arrays.toString(arr));
    }
    public static void elemanlariArtiripYazdir (int[] arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + 2;
        }
        System.out.println("methodda arrayin degeri " + Arrays.toString(arr));

    }
    public static void yeniArrayAta (int[] arr){

        arr = new int[5];
        System.out.println("2. method'da arr : " + Arrays.toString(arr));

    }
}
