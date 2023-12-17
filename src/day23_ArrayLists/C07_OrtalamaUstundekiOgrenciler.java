package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_OrtalamaUstundekiOgrenciler {

    public static void main(String[] args) {

        // bir ogretmenden ogrenci ismini ve notunu isteyin
        // ogretmen Qya bastiginda islemi bitirip
        // ortalama uzerşne not alan ogrencilerin isimlerini list olarak yazdırın

        // ipucu : isimleri ve notlari 2 ayri liste alarak tutun

        Scanner scanner = new Scanner(System.in);
        List<String> isimlerListesi = new ArrayList<>();
        List<Double> notlarListesi = new ArrayList<>();
        double girilenNot = 0;
        double notToplami = 0;
        String girilenIsim = "";

        while (!girilenIsim.toUpperCase().equals("Q")) {

            System.out.println("lütfen öğrenci ismini girin");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.toUpperCase().equals("Q")) {

                isimlerListesi.add(girilenIsim);

                System.out.println("lutfen ogrecinin notunu giriniz");
                girilenNot = scanner.nextDouble();
                scanner.nextLine();
                notToplami += girilenNot;
                notlarListesi.add(girilenNot);


            }

        }
        double ortalama = notToplami / notlarListesi.size();

        System.out.println("ortalama not: " + ortalama);
        System.out.println("ortalamanın ustunde not alan ogrenciler");


        // elimizde notlarListesi ve isimlerListesi var
        // ayni indexdeki isim ve not ilintili
        // notlarListesindeki notlari gozden gecirip
        // ortalamanin ustunde olanlarin
        // once ismini, yanina notunu yazdirin

        for (int i = 0; i < isimlerListesi.size() ; i++) {


            if (notlarListesi.get(i) >= ortalama){
                System.out.println(
                        isimlerListesi.get(i)
                        + " "
                        + notlarListesi.get(i)
                );


            }

        }


    }
}