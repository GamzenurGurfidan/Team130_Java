package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_NotOrtalamasiBulma {
    public static void main(String[] args) {

        // bir ogretmenden not ortalmasi bulmak icin notlari alin
        // ogretmen islemi bitirmek icin negatif bir sayi girmelidir
        // ogretmen negatif sayi girdiginde
        // toplam kaç not girdigini
        // not ortalamasinin kaç oldugunu
        // ve en yuksek notu yazdirin

        Scanner scanner = new Scanner(System.in);
        double not = 0;
        double toplam = 0;
        int sayac = 0;
        double enYuksekNot = 0;

        while (not >= 0) {
            System.out.println("ortlama icin notlari giriniz, \nislemi bitirmek icin negatif bir sayi gir");
            not = scanner.nextDouble();

            if (not >= 0) {
                toplam += not;
                sayac++;

                // en yukske not icin her girilen notu
                // o andaki en yüksek not ile karsilastiralim
                //ve girilen not en yuksek nottan buyukse
                // onu en yuksek not olarak atayalım

                if (not > enYuksekNot) enYuksekNot = not;

            }
        }

        System.out.println(" not girilen ogrenci sayisi: " + sayac +
                           "\nGirilen not ortalaması : " + toplam/sayac +
                           "\nGirilen en yuksek not: " + enYuksekNot);
    }
}
