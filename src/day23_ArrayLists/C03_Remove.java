package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(0);

        System.out.println(sayilar); // [3, 5, 2, 0]

        /*
            remove 2 sekilde yapilabilir
            remove (index)
            remove (object)

            sayilar(0) eleman 0 mi yoksa index 0 mi?

            Javada hersey nettir
            eger listemiz Integerlardan olusuyorsa
            Java parametre olarak yazdıgımız int sayiyi direkt index kabul eder

            Eger element olarak herhangi bir sayiyi silmek isterseniz
            once bir Object olarak o sayiyi tanımlamali
            sonra silmeliyiz
         */

        System.out.println(sayilar.remove(0)); // 3

        System.out.println(sayilar); // [5, 2, 0]

        // eleman olarak 5 i silmesini istersek
        // once bir obje olarak 5i tanımlamalıyız

        Object silinecekElement = 5;

        sayilar.remove(silinecekElement);

        System.out.println(sayilar); // [2, 0]





    }
}
