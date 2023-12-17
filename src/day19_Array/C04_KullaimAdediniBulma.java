package day19_Array;

public class C04_KullaimAdediniBulma {
    public static void main(String[] args) {
        // Soru 4 - Verilen bir array’de istenen bir elemanin var olup olmadigini
        //          ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        String[] harfler = {"a","c","r","s","a","a","s","k","a"};

        String arananHarf = "s";

        int sayac = 0;

        for (int i = 0; i < harfler.length; i++) {

            if (harfler[i].equals(arananHarf)){
                sayac++;
            }

        }

        if (sayac == 0){
            System.out.println("verilen " + arananHarf + " harfi arrayde yok");
        } else {
            System.out.println("verilen " + arananHarf + " harfi arrayde " + sayac + " kere kullanılmıs");
        }
    }

    public static void elemanArama (String[] arr, String arananEleman){
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arananEleman)){
                sayac++;

            }
        }
        if (sayac == 0){
            System.out.println("istenen eleman " + arananEleman + " harfi arrayde yok");
        } else {
            System.out.println("istenen eleman " + arananEleman + " harfi arrayde " + sayac + " kere kullanılmıs");
        }

    }

}
