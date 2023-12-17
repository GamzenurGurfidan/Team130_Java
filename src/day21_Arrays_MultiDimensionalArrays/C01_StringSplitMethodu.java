package day21_Arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_StringSplitMethodu {
    public static void main(String[] args) {

        String str = "java gun gectikce guzellesiyor";

        System.out.println(Arrays.toString(str.split("")));

        // cumleyi "gec" metninden parçalara ayırın
        System.out.println(Arrays.toString(str.split("gec")));

        System.out.println(Arrays.toString(str.split(" ")));

        // e harflerinden str'ı parcalara ayirin

        System.out.println(Arrays.toString(str.split("e")));
        // [java gun g, ctikc,  guz, ll, siyor]

        // verilen bir arama sonucunda
        // arama sonucunun 1000'den fazla oldugunu test edin

        String aramaSonucu = "1-48 of over 700 result for java";

        String[] kelimeler = aramaSonucu.split(" ");

        System.out.println(Arrays.toString(kelimeler));
        // [1-48, of, over, 5,000, result, for, java]

        String aramaSonucuSayisiStr = kelimeler[3]; //5,000

        aramaSonucuSayisiStr = aramaSonucuSayisiStr.replaceAll("\\D", ""); // 5000

        int aramaSonucSayisi = Integer.parseInt((aramaSonucuSayisiStr)); // int 5000

        if (aramaSonucSayisi > 1000){

            System.out.println("arama sonuc sayisi testi PASSED");
        } else {
            System.out.println("arama sonuc sayisi testi FAIL");
        }




    }
}
