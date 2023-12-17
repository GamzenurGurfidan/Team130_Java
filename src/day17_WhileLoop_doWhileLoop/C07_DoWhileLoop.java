package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {
        /*
            While loopta parantez içinde kontrol edilen degişkene
            biz loop dan önce deger atiyoruz

            eger bu degiskene uygun olmayan bir deger atamasi yaparsak loophiç çalışmaz

            java bu durumun onune gecmek için
            yani kontrolu kullanıcıdan deger aldiktan sonra yapabilememiz için
            do-while loop olusturmustur

            do while loop kullanıldıgında
            loop body'sinin calismama ihtimali yoktur
            loop bodysi en az 1 kere calisir
         */

        // bir ogretmenden not ortalmasi bulmak icin notlari alin
        // ogretmen islemi bitirmek icin negatif bir sayi girmelidir
        // ogretmen negatif sayi girdiginde
        // toplam kaç not girdigini
        // not ortalamasinin kaç oldugunu
        // ve en yuksek notu yazdirin


        Scanner scanner = new Scanner(System.in);
        double not = -5;
        double toplam = 0;
        int sayac = 0;
/*
        while (not >= 0) {
            System.out.println("ortalama için notları girin \nbitirmek için negatif sayi girmelisin");
            not = scanner.nextDouble();

            if (not>=0){
                toplam += not;
                sayac ++;
            }
        }

 */
        do {
            System.out.println("ortalama için notları girin \nbitirmek için negatif sayi girmelisin");
            not = scanner.nextDouble();

            if (not>=0) {
                toplam += not;
                sayac++;
            }
        } while (not >= 0);



        System.out.println("toplam girilen not sayisi " + sayac +
                "\nGirilen notların ortalması:  " + (toplam / sayac));
    }
}
