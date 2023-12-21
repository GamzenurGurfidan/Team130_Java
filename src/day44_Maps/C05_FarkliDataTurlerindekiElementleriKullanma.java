package day44_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C05_FarkliDataTurlerindekiElementleriKullanma {
    public static void main(String[] args) {

        List<String> things = new ArrayList<>();
        things.add("Gul");
        // things.add(10);
        // things.add(false);
        // things.add('K');

        int[] arr = {4, 5, 6};
        //things.add(arr);


        // ben farkli data turundeki her turku seyi
        // bir listeye eklemek istersem

        List<Object> seyler = new ArrayList<>();
        seyler.add("Gamze");
        seyler.add(10);
        seyler.add(false);
        seyler.add('K');
        seyler.add(arr);

        System.out.println(seyler); // [Gamze, 10, false, K, [I@4dd8dc3]
        // 1. indexte bulunan sayinin 2 katini yazdirin

        System.out.println((Integer) seyler.get(1) * 2); // 20 // Operator '*' cannot be applied to 'java.lang.Object', 'int'

        // 0. indexteki ismi buyuk harflerle yazdirin

        System.out.println(((String) seyler.get(0)).toUpperCase()); // GAMZE

        // 4. indexteki arrayi yazdirin


        System.out.println(Arrays.toString ( (int[]) seyler.get(4) ) ); // [4, 5, 6]


    }
}
