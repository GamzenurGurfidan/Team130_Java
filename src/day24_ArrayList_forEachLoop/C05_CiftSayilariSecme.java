package day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_CiftSayilariSecme {
    public static void main(String[] args) {

        // verilen int bir arrayden
        // cift sayilari alip, ayri bir array olarak kaydedin

        int[] arr = {3,5,1,7,9,0,4,2,6,7,8,1,5,8,7,6,};

        /*
            istenen elementleri bir array olarak istedigi için
            iki sekilde yapabiliriz

            1- once kac tane cift sayi oldugunu bulur
            sayiya göre bir array olusturup
            cift sayilari olusturan yeni arraye kopyalarız

            2- arraydeki tum elementleri gözden gecirip
            cift olanları bir listeye atariz
            listenin uzunluguna gore yeni array olusturup
            listedeki elementleri yeni arraye kopyalarız

         */

        // arraydeki tum elementleri gozden gecirip
        // cift olanları bir listeye atariz

        List<Integer> ciftSayilarListesi = new ArrayList<>();

        for (int each : arr) {

            if (each % 2 == 0){
                ciftSayilarListesi.add(each);

            }
        }// [0, 4, 2, 6, 8, 8, 6]

        int[] ciftSayilarArrayi = new int[ciftSayilarListesi.size()];

        /*
            Mantıklı olan yontem for loop ile elemntleri
            ciftSayilarArray'ine kopyalamaktir

            for (int i = 0; i < ciftSayilarArrayi.length ; i++) {

                ciftSayilarArrayi[i] = ciftSayilarListesi.get(i);

            }
         */
        // for-each loop ile yapmak istersek
        int index = 0 ;

        for (int each: ciftSayilarListesi){
            ciftSayilarArrayi[index] = ciftSayilarListesi.get(index);
            index++;

        }
        System.out.println("çift sayilar arrayi: " + Arrays.toString(ciftSayilarArrayi));

    }
}
