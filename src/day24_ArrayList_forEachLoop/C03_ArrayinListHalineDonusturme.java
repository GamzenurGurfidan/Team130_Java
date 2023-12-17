package day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayinListHalineDonusturme {
    public static void main(String[] args) {
        Integer[] sayilarArray = {1, 2, 3, 6, 7, 4, 3, 5};

        /*
            Bir arrayi list haline getirmek icin
            en guvenilir yontem
            bi loop ile tum elementleri listeye kopyalamaktadir

            Aslinda daha kisa bir yol vardir
            ama iki buyuk yanetkisi olugundan
            bunlara dikkat etmek gerekiyor

            1 - olusturdugumuz liste arrays classı ile olusturuldugundan
            ekleme cıkarma gibi listenin uzunlugunu degistirecek işlemlere izin vermez

            2 - Array ve bu arrayden olusturulan List birbiri ile bagımlı kalır
            birinde sonradan yaplan degisiklikler
            otomatik olarak digerine de islenir

         */

        List<Integer> sayilarListesi = Arrays.asList(sayilarArray);

        System.out.println("sayilar Listesi: " + sayilarListesi);
        // sayilar Listesi: [1, 2, 3, 6, 7, 4, 3, 5]


        // sayilar listesine 9u ekleyin
        // sayilarListesi.add(9); //hata
        // listeden  7 yi silin

        Object silinecekEleman = 7;

        // sayilarListesi.remove(silinecekEleman); // hata

        System.out.println("sayilar Listesi: " + sayilarListesi);
        System.out.println("sayilar Listesi: " + Arrays.toString(sayilarArray));

        // arrayin 2. indexindeki sayiyi 10 yapın
        sayilarArray[2] = 10;

        System.out.println("Array update sonrası Sayılar listesi : " + sayilarListesi);
        System.out.println("Array update sonrası Sayılar listesi : " + Arrays.toString(sayilarArray));

        List<Integer> fiyatList = new ArrayList<>();

        fiyatList.add(10);
        fiyatList.add(20);
        fiyatList.add(30);

        Integer[] kontrolArrayi = {10,20,30};

        // fiyat listesinin, kontrol listesi olarak verilen ile ayni oldugunu test edin

        List<Integer> kontrolListesi = Arrays.asList(kontrolArrayi);

        if (fiyatList.equals(kontrolListesi)){
            System.out.println("test Passed-");
        }else {
            System.out.println("test Failed");
        }

    }
}
