package day22_mutiDimensionalArrays_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArraydenTekrarEdenleriSilme {
    public static void main(String[] args) {

        // verilen bir arrayde tekrar eden elementleri silip
        // arrayi her elementin sadece 1 kere kullanildigi hale getirin

        int[] arr = {3,6,1,4,7,3,9,4,2,3,6,1,4,3};

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])){

                tekrarsizList.add(arr[i]);

            }

        }
        System.out.println(tekrarsizList); // [3, 6, 1, 4,  97,, 2]

        //tekrarsiz hale gelen array Degil, bizim olusturdugumuz liste
        // arraye yeni bir array degeri atayip, listedeki elementleri yeni array'e tasimalıyiz

        arr = new int[tekrarsizList.size()];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {

            arr[i] = tekrarsizList.get(i);

        }
            Arrays.sort(arr);

        System.out.println("Arrayin son hali:  "+ Arrays.toString(arr)); // [1, 2, 3, 4, 6, 7, 9]


    }
}
