package day43_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C05_IstenenogrencininSoyisminiUpdateEtme {
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");
        ogrenciMap.put(108, "Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109, "Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110, "Azim-Kayisi-11-K-TM");

        // 110 numaralı ogrencinin soyismini Mismis yapin

        ogrenciMap.put(103,"Ali-Han-12-M-MF");

        System.out.println(ogrenciMap.get(103)); // Ali-Han-12-M-MF-

        // eger bir mapde varolan key ile yeni bir element eklerseniz
        // o key'e ait eski value'yu siler, yeni value'yu kabul eder

        // soruyu manuel olarak yapacak olsaydık
        // ogrenciMap.put(110, "Azim-Mismis-11-K-TM");

        /*
            update islemlerini dinamik olarak yapabilmek için
            once degistirmek istediginiz bilgiye ulasmalıyız
            bunu onceki sorularda yaptıgımız gibi
            once value'ya ulasıp, value'yu split edip
            istedigimiz bilgiye ulasabiliriz
         */

        // 1- istenen ogrencinin value'sune ulasıp kaydedin

        String value110 = ogrenciMap.get(110);

        // 2- value110 da istedigimiz bilgiye ulasabilmek için split yapip kaydedin

        String[] value110Arr = value110.split("-");  // [Azim, Kayisi, 11, K, TM]

        // 3- simdi istenen degisikligi array'de yapin

        value110Arr[1] = "Mismis"; // [Azim, Mismis, 11, K, TM]

        // istenen degisikliği arrayde yaptıktan sonra, mapi guncelleyebilmek icin
        // array'i yeniden String value formuna donusturmeliyiz
        // Azim-Mismis-11-K-TM

        // 4- degisen arrayi yeniden value formatina getir

        String yeniValue = value110Arr[0] +"-"+value110Arr[1] + "-"+value110Arr[2]+"-"+
                value110Arr[3] + "-" + value110Arr[4]; // Azim-Mismis-11-K-TM


        // 5- map'i guncelle

        ogrenciMap.put(110,yeniValue);

        System.out.println(ogrenciMap);

    }
}
