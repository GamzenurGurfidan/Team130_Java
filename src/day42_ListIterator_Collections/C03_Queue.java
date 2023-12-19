package day42_ListIterator_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        /*
            Queue (kuyruk) yapısı gereği
            eklenenler otomatik olarak sona eklenir
            Silinenler bastan silinir
         */

        Queue<Integer> queue = new LinkedList();

        queue.add(6);
        queue.add(9);
        queue.add(2);

        System.out.println(queue); // [6, 9, 2]

        queue.remove();

        System.out.println(queue); // [9, 2]

        System.out.println(queue.element()); // en bastaki elementi silmeden bize getirir // 9

        System.out.println(queue); // [9, 2]

        System.out.println(queue.peek()); // en bastaki elementi silmeden bize getirir // 9

        System.out.println(queue); // [9, 2]

        Queue<Integer> bosQ = new LinkedList<>();

        // System.out.println(bosQ.element()); // NoSuchElementException

        System.out.println(bosQ.peek()); // null
        // ikisi aynı işlemi yapar ama aralarındaki fark
        // boş Queue da biri exception fırlatır öteki null dondurur

        queue.offer(7); // true
        System.out.println(queue); //[9, 2, 7]
        // add ile yanı işlevi yapar
        // aralarındaki fark, add her durumda ekler
        // ama offer kapasite sınırlaması yoksa ekler

        System.out.println(queue.poll()); // 9
        // queue'nun basındaki elementi siler va bize getirir

        System.out.println(queue); // [2, 7]

        // bosQ.remove(); // NoSuchElementException
        System.out.println(bosQ.poll()); // null

        System.out.println(queue.isEmpty()); // false



    }
}











