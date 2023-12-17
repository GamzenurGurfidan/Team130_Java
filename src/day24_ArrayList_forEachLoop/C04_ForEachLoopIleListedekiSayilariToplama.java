package day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoopIleListedekiSayilariToplama {
    public static void main(String[] args) {

        /*
                For each loop
                birden cok element barindiran yapilar için kullanılır

                For each loopun gorevi
                verdigimiz cok eleman baridiran yapidaki
                TUM ELEMENTLERİ bize getirmektir

                bu işlem için for each loopa 3 bilgi gereklidir
                1- bize getirecegi elementlerin data turu
                2- Loop icinde bu elementlere verecegimiz isim (bizim oglanin adi)
                3- bu elementleri nereden alip bize getirecegi
         */

        Integer[] arr = {3,5,1,2,6,4,5,1,7,8,4,2,5,6};

        List<Integer> sayilar = new ArrayList<>();

        // Index kullanmadan arrdeki tum elementleri
        // sayilar listesinde kopyalayin

        for (Integer each: arr) {
            sayilar.add(each);

        }

        System.out.println("Sayilar Listesi: " + sayilar);
        // Sayilar Listesi: [3, 5, 1, 2, 6, 4, 5, 1, 7, 8, 4, 2, 5, 6]

        // index kullanmadan sayilar listesindeki
        // tum elementlerin toplami yazdirin

        int toplam = 0;

        for (Integer each: sayilar) {
            toplam += each;
        }

        System.out.println("sayilar listesindeki tum elementleri toplami: " + toplam); // 59


    }
}
