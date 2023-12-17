package day29_ImmutableClassees;

import java.util.ArrayList;
import java.util.List;

public class C03_Mutable_ImmutableClasses {
    public static void main(String[] args) {

        /*
            String class'i Immutable oldugu icin
            method ile yapilan degisiklikler kalici degisik yapmmaz
            sadece
         */

        String isim = "Ramazan";
        isim.toUpperCase();
        isim.replace("a",",");
        isim.concat(" Tatar");

        System.out.println(isim);

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.remove(1);
        sayilar.set(1,40);

        System.out.println(sayilar);


    }

}
