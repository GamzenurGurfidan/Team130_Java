package day13_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*
            baslangıc ve bitis degerleri bilinen
            veya tekrar sayisi belli olan islemleri yapmak için
            for loop kullanılır
         */

        // 10'dan baslayarak, 30'dan kucuk olan sayilari yan yana yazdirin

        for (int i = 10; i < 30; i++) {
            //baslangıc degeri              loop bitirme sarti              i'nin artis bicimi
            //                          bu sart true oldugu muddetce
            //                              calismaya devam eder

            System.out.print(i + ", ");
        }
        System.out.println(" ");
        // iki basamaklı tek sayilari yan yana yazdirin

        //  bu soruyu iki türlü düsünelim
        // 1- eger biliyorsanız, ilk ve son yazdirilacak sayiyi belirler
        // tek sayilar dediği için 2 'ser gidecek

        for (int i = 11; i <= 99; i += 2) {
            System.out.print(i + ", ");
        }

        System.out.println(" ");
        // 2- baslangıc ve bitis degerleri bilmeyebiliriz
        // 2 basamaklı dediği için tum sayi elden gecirirm

        for (int i = 10; i < 100; i++) {
            // tek sayilari dediği icin
            // sayiyi kontrol edip tekse yazdırırım

            if (i % 2 == 1) {
                System.out.print(i + ", ");
            }
        }

        System.out.println(" ");

        // 752 ve 1326 dahil olmak üzere aralarında 19 ile bölünen sayilari yazdırın

        for (int i = 752; i <= 1326 ; i++) {

            if ( i % 19 == 0) {
                System.out.print(i + ", ");
            }

        }


    }
}
