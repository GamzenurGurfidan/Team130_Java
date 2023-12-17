package day25_Constructors;

public class C05_DefaultConstructor {
    public static void main(String[] args) {

        /*
            Java bir class olusturuldugunda
            OOP kullanılarak bu classdan obje olusturulabilmesi için
            class'a default bir constuctor koyar

            default constructor Gorunmez
            ve body'sinde kod yoktur
         */

        C02_Araba araba = new C02_Araba();

        // araba objesinin özelliklerini yazdirin

        System.out.println(araba); // day25_Constructors.C02_Araba@6d03e736

        System.out.println("Marka: " + araba.marka + "," +
                "\nmodel: " + araba.model + "," +
                "\nrenk: " + araba.renk + "," +
                "\nyil: " + araba.yil + "," +
                "\nfiyat: " + araba.fiyat);
        // Marka: Marka belirtilmemiş,
        // model: Model belirtilmemiş,
        // renk: Renk belirtilmemiş,
        // yil: 1900,
        // fiyat: 0

        System.out.println("---------------------");

            araba.marka = "BMW";
            araba.model = "5.20";
            araba.renk = "Kirmizi";
            araba.yil = 2010;
            araba.fiyat = 15000;

        System.out.println("Marka: " + araba.marka + "," +
                "\nmodel: " + araba.model + "," +
                "\nrenk: " + araba.renk + "," +
                "\nyil: " + araba.yil + "," +
                "\nfiyat: " + araba.fiyat);

        // Marka: BMW,
        // model: 5.20,
        // renk: Kirmizi,
        // yil: 2010,
        // fiyat: 15000

        System.out.println("-------------------");
        System.out.println(araba);
    }
}
