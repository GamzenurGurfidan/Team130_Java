package day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenenHarfinOlduguIsimleriListelemek {
    public static void main(String[] args) {
        // verilen bir String arrayde istenen harfi iceren isimleri Liste olarak yazdirin

        String[] isimler ={"Şevket","Ayberk","Halil","Gamzenur","Selçuk","İlkin"};

        String istenenHarf = "e";

        List<String> silinmeyecekIsimler = new ArrayList<>();

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].toLowerCase().contains(istenenHarf)){
                silinmeyecekIsimler.add(isimler[i]);

            }
        }
        System.out.println(silinmeyecekIsimler);

    }
}
