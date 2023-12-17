package day30_Timedate_Varargs;

public class C05_VarargsDikkatEdilecekler {

    // argument olarak verilen sayilardan
    // ilki hariç geriye kalanlari toplayip
    // bulunan toplami ilk sayi ile çarpıp
    // sonucu yadiran bir method olusturun

    // input = 0, 2, 3, 4, 1   output ==> 0 * 10 = 0
    // input = 1, 2, 3         output ==> 1 * 5 = 5
    public static void main(String[] args) {

        islemYap(0,2,3,4,1); // 0 * 10 = 0
        islemYap(1,2,3); // 1 * 5 = 5
        islemYap(2,3,4,5,6,7,8,9); // 2 * 42 = 84
        islemYap(5); // 5 * 0 = 0

        // varargs çok elemanı sorun etmedigi gibi hiç elemani da sorun etmez

        // islemYap(); CTE array boş kalabilir ama bastaki parametre bos kalmaz



    }
    public static void islemYap (int ilkSayi, int... geriyeKalanlar ){

        int toplam = 0;
        for (int each : geriyeKalanlar){
            toplam += each;
        }
        System.out.println(toplam * ilkSayi);


    }
}
