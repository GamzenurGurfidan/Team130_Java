package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_WhileLoopDikkatEdilecekler {
    public static void main(String[] args) {

        // 1-  while parantezinde kontrol ettiğimiz degisken
        //     loop içerisinde degistirtilmezse sonsuz loop olusur

        int sayi = 5;
        int sayac = 0;

        while (sayi<= 10){

            sayac++;
            System.out.println(sayac + " ");
            sayi++ ;

        }
        // 2- eger loop olusturulmadan once
        //    ihtiyac duydugumuz variablelari biz olusturuyorsak
        //    loopun ilk defa calışmasını ve kullanicidan degerler almasini ,ENGELLEMEYECEK
        //    bir deger atamaya DİKKAT ETMELİYİZ

        // kullanicidan sayilar isteyin
        // verilen sayilar pozitif oldugu muddetce
        // sayilari toplayalım ve negatif sayi girildiginde toplami yazdiralım

        sayi = 20;
        int toplam = 0;

        Scanner scanner =new Scanner(System.in);

        while (sayi> 0) {
            System.out.println("lütfen toplanmak üzere pozitif tamsayilar girin ");
            sayi = scanner.nextInt();
            if (sayi>0) toplam += sayi;
        }
        System.out.println(toplam);

        // 3- eger loop parantezinde yazdigimiz degisken icin
        //    loop icerisinde kullanicidan deger aliyorsak
        //    aldigimiz degerin, loopu bitirme özelligi olmayan bir deger oldugundan
        //    emin olduktan sonra islemimizi yapmaliyiz
        //    42. satirda oldugu gibi

    }
}
