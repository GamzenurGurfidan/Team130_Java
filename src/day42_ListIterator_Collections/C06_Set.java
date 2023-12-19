package day42_ListIterator_Collections;

import java.util.HashSet;
import java.util.Set;

public class C06_Set {
    public static void main(String[] args) {

        // set'in 2 ozelliği mutlaka bilinmeli
        // 1- her elemandan sadece 1 tane olabilir,
        //    var lan elementi yeniden eklemek isterseniz, eskiyi siler ayni elementin yenisini kaydeder
        // 2- index desteklemez

        int[] arr = {2,3,4,5,6,4,3,2,4,6,7,4,3,2,4,5,5,4,3,3};

        // verilen arryi unique elementlerden olusan
        // tekrarsiz bir array haline getirin

        Set<Integer> uniqueSet = new HashSet<>();

        // bir loop ile arraydeki tum sayilari uniqueSete ekleyelim

        for (int each : arr ){
            uniqueSet.add(each);
        }

        System.out.println(uniqueSet); // [2, 3, 4, 5, 6, 7]

    }
}
