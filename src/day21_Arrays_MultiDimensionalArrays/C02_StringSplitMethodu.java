package day21_Arrays_MultiDimensionalArrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {

        // Verilen bir metin'de
        // istenen karakterin kac kere kullanildigini yazdirin

        String metin = "Java da hergun yeni seyler ogreniyoruz";

        String arananKaranter = "e";

        String[] karakterler = metin.split("");
        int sayac = 0;

        for (int i = 0; i < karakterler.length; i++) {

            if (karakterler[i].equals(arananKaranter)){
                sayac++;
            }

        }

        System.out.println("aradiginiz karakter metinde " + sayac + " defa kullanılmıştır" );




    }
}
