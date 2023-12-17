package day16_methodOlusturma_methodOverloading;

public class C03_StringMethodlari {

    public static void main(String[] args) {

        String str = "Java cok kolay, yeter ki anlayalim";

        str.toLowerCase(); // metni kucuk harfe cevirir
                           // ama yazdirmadigimiz veya atama yapamadigimiz icin
                           // bosa calismis olur

        C02_ReturnTypeIleMethodOlusturma.ismiIstenenFormataCevir("Asli","Nehaber" );


        // bize bir sey döndüren methodlari ya uygun bir variable'a atamaliyiz
        // veya direk olarak yazdirmaliyiz
        // aksi takdirde method calişir, bize sonucu döndürür (getirir)
        // ama kullanmadigimiz ici havaya ucar

        // bu method void oldugunda
        // sadece cagirabilirim
        C01_voidMethodOlusturma.kisiBilgileriYazdir("Ayse","Hanci","123456789123456");
        // isim : Ays* Han**
        //kart no : **** **** **** 3456

        C02_ReturnTypeIleMethodOlusturma.ismiIstenenFormataCevir("Kemal","Yanci");
        // bu method bana methodda donusturulen halini dondurur(getirir)
        // K*** Y***
        // ama yazdirmazsak konsolda birsek göremeyiz

        String donusmusIsim = C02_ReturnTypeIleMethodOlusturma.ismiIstenenFormataCevir("Kemal","Yanci");

        System.out.println(donusmusIsim); // K**** Y****





    }

}
