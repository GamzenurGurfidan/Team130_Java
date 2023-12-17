package day25_Constructors;

public class C06_ArabaRunner {
    public static void main(String[] args) {

        C02_Araba araba;
        // Constructor kullanildigindan obje olusturulacagi soylenmişs
        // ama obje olusturulup ilk deger atamasi Yapılmamiştir

        // System.out.println(araba.fiyat);
        // Variable 'araba' might not have been initialized

        // araba.motor();
        // Variable 'araba' might not have been initialized

        C02_Araba araba1 = new C02_Araba();

        // Eger constructor bodysinde atama yoksa
        // veya default constructor kullanılmışsa
        // olusturulan obje
        // olusturuldugu classda ilk atanmış olan degerlere sahip olur

        System.out.println(araba1);
        // Araba özellikleri: marka='Marka belirtilmemiş', model='Model belirtilmemiş', renk='Renk belirtilmemiş', yil=1900, fiyat=0

        // 2000 model, yeşil, fiyati 3000 olan bir opel corsa olusturun
        // once bir obje olusturup, sonra istenen degerlerin atamasini yapabiliriz

        C02_Araba araba2 = new C02_Araba();

        araba2.motor();
        araba2.guvenlik();

        araba2.marka = "Opel";
        araba2.model = "Corsa";
        araba2.yil = 2000;
        araba2.renk = "Yeşil";
        araba2.fiyat = 3000;

        System.out.println(araba2);
        // Araba özellikleri: marka='Opel', model='Corsa', renk='Yeşil', yil=2000, fiyat=3000

    }
}
