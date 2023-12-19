package day42_ListIterator_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_Queue {
    public static void main(String[] args) {

        List<Integer> sayilar = new LinkedList<>();

        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(10);

        System.out.println(sayilar);

        sayilar.add(2,44);
        System.out.println(sayilar);

        // sayilar.remove(5); // IndexOutOfBoundsException

        List<Integer> digerList = new LinkedList<>();

        digerList.add(44);
        digerList.add(23);
        digerList.add(10);

        System.out.println(digerList); // [44, 23, 10]

        sayilar.retainAll(digerList);
        // sayilar listesinden diger listede olmayan elementleri siler

        System.out.println(sayilar); // [44, 10]

        System.out.println(sayilar.hashCode()); // 2335

    }
}
