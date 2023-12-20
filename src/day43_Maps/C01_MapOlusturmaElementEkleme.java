package day43_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturmaElementEkleme {
    public static void main(String[] args) {

        /*
            Bir ogrenciyi map'e eklemek icin put (key, value) kullanırız

            Bir ogrencinin valuesune ulaşmak içn
            - ogrenciMap.get(ogrenciNo) ile String olarak tum valueyu alıp kaydederiz
            - value, pek cok bilgi barındırdıgından, her bir bilgiye ulasmak icin
            value.split("-") ile valueyu arraye ceviririz
            - arraydeki tum bilgilerin indexlerine sahip oldugumuzdan
            istenen bilgileri arrayden alıp yazdirabilir veya kullanabilirz
         */

        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-K-MF");
        // bu ogrenci için key: 101
        //               value: "Ali-Can-10-K-MF"
        // value string olmak zorunda degil list, array, Integer, Map, Queue

        String value101 = ogrenciMap.get(101);
        System.out.println("101in tum bilgisi: " + value101); // 101in tum bilgisi: Ali-Can-10-K-MF

        // 101 numaralı ogrencinin soyismini yazdırın

        String[] ogrenci101BilgilerArr = value101.split("-");

        System.out.println(Arrays.toString(ogrenci101BilgilerArr)); // [Ali, Can, 10, K, MF]

        System.out.println("101 numaralı ogrenci soyismi: " + ogrenci101BilgilerArr[1]); // Can

        // 101 numaralı ogrencinin bolumunu yazdirin
        System.out.println("101 numaralı ogrencinin bolumu: " + ogrenci101BilgilerArr[4]);// MF

        // 101 numaralı ogrencinin isim ve soyismini yazdirin
        System.out.println("101 numaralı ogrencinin ismi ve soyismi: " +
                            ogrenci101BilgilerArr[0] + " " + ogrenci101BilgilerArr[1]); // Ali Can

        // 101 numaralı ogrencinin isim ve soyismini yazdirin, Soyisim buyuk harfle yazdırılsın
        System.out.println("101 numaralı ogrencinin ismi ve soyismi: " +
                ogrenci101BilgilerArr[0] + " " + ogrenci101BilgilerArr[1].toUpperCase()); // Ali CAN


    }
}
