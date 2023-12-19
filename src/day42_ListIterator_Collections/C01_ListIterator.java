package day42_ListIterator_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {
    public static void main(String[] args) {

        // listIterator interface'i Iterator interface'inin childidir
        // dolayisiyle Iteratora gore daha fazla methoda sahiptir

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(3);

        System.out.println(sayilar); // [5, 1, 7, 3]

        // listedeki tum sayilari, index kullanmadan 2 artirin

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()) {

            Integer sayi = (Integer) lit.next(); // bir yana gecip, uzerinden gectigi elementli bize getirir
            lit.set(sayi + 2);
        }
        System.out.println(sayilar); // [7, 3, 9, 5]

        // iterator da takip etmemiz gereken en onemli konu
        // iteratori nerede biraktigimizdir
        // ornegin bu soruda iterator 34.satir itibariyle en sonda

        // listedeki elementleri, index kullanmadan
        // sondan basa dogru yazdirin

        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println("");

        // index kullanmadan bir kere daha sondan basa tum elementleri yazdirin
        // su anda iterator en basta
        // tekrar sondan basa gelebilmesi icin
        // once iteratori sona yollamaliyiz

        while (lit.hasNext()) {
            lit.next();
        }
        // bu loop iterator i sona goturur

        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println("");

        // tum elmeenleri gozden gecirip
        // 5den buyuk olanları silin

        System.out.println(sayilar); // [7, 3, 9, 5]

        // ilk dusunecegimiz iterator nerede
        // iteratorin yerinden emin degilsek
        // yeniden deger atayabiliriz

        lit = sayilar.listIterator(); // iteratori en basa koyar

        while (lit.hasNext()) {
            if ((Integer) lit.next() > 5) {
                lit.remove();
            }
        }
        sayilar.set(1, -4);
        System.out.println(sayilar); // [3, 5]


        // listedeki sayilari kontrol edip
        // 0dan buyuk olanlara 7 ekleyin

        lit = sayilar.listIterator();

        while (lit.hasNext()) {

            Integer sayi = (Integer) lit.next();
            if (sayi > 0) {
                lit.set(sayi + 7);
            }
        }
        System.out.println(sayilar); // [3, 12]


    }
}
