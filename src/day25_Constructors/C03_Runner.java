package day25_Constructors;

public class C03_Runner {
    public static void main(String[] args) {

        /*
                Java da herhangi bir classda obje olusturdugunuzda
                java ilk olarak o objeyi olusturur


         */
        // java da bir obje olusturmak istedigimizde

        C02_Araba araba1 = new C02_Araba();
        araba1.marka = "Tofaşk";

        C02_Araba araba2 = new C02_Araba();
        System.out.println(araba2.marka); // marka belirtilmemiş
        araba2.marka = "Mercedes";

        C02_Araba araba3 = new C02_Araba();
        System.out.println(araba3.marka);

    }
}
