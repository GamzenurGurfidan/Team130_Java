package day41_Exceptions_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(3);


        System.out.println(sayilar); // [5, 1, 7, 3]

        // index kullanmadan listedeki sayilari 2ser artirin

        for (Integer each : sayilar){

            System.out.print(each + 2 + " ");
        }

        System.out.println(""); // 7 3 9 5

        System.out.println(sayilar); // [5, 1, 7, 3]

        // javada çoklu obje bulunduran her yapi indexi desteklemez
        // index olmadan bazi işlemleri yapabilrmek için
        // java Iterator interfaceini olusturmustur

        // iterator kullanarak tum sayilar toplayın

        int toplam = 0;
        Iterator iterator = sayilar.iterator();

        System.out.println(iterator.hasNext()); // true
        // yanında eleman varsa true yoksa false dondurur


        // yanındaki sayıdan sonraya gecirir
        // ve gectigi sayiyi bize dondurur
        toplam += (Integer)iterator.next();

        toplam += (Integer)iterator.next();

        toplam += (Integer)iterator.next();

        toplam += (Integer)iterator.next();

        System.out.println(toplam);

        // iterator ile calisirken dikkat etmemiz gereken en onemli konu
        // iterator'i nerede bıraktıgımızdır
        // bu soru için düsünürsek en sona kadar gitti
        // bir kere daha gidersek

        // System.out.println(iterator.next()); // NoSuchElementException

        // budurumda iteratora yeniden sifirdan baslayacak deger atamasi yapmak lazim

        iterator = sayilar.iterator();

        // listedeki tum sayilari iterator ile silin

        while (iterator.hasNext()){ // iteratorin yanında eleman oldugu surece true doner
                                    // böylece while loop calısmaya devam eder

            iterator.next();
            iterator.remove();

        }
        System.out.println(sayilar); // []
    }
}
