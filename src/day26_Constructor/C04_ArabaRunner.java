package day26_Constructor;

public class C04_ArabaRunner {
    public static void main(String[] args) {

        C03_Araba araba1 = new C03_Araba();

        /*
            Kod okuma sorularında
            OLMASİ GEREKEN veya KODUN DOGRUSU BOYLE OLMALI
            diye dusunemeyiz

            Yapmamiz gereken
            Javanin yapacagi kod takibini yapip
            kod ne işlem yapıyorsa onlari anlamaktir
         */

        System.out.println(araba1);
        // Araba özellikleri:
        // marka : 'Toyota',
        // model : 'Model belirtilmemiş',
        // renk : 'Renk belirtilmemiş',
        // yil : 2010, fiyat : 0

        // verilen C03_Araba classi ile
        // asagidaki araba2 objesi olusturulursa
        // araba2nin modeli ne olur

        C03_Araba araba2 = new C03_Araba("Toyota","Corolla");

        System.out.println(araba2);
        // Araba özellikleri:
        // marka : 'Toyota',
        // model : 'A180',
        // renk : 'Renk belirtilmemiş',
        // yil : 2019, fiyat : 0

        // verilen C03_Araba classi ile
        // asagidaki araba3 onjesini olusturulsa
        // araba3'un marka, model ve fiyati ne olur?

        C03_Araba araba3 = new C03_Araba("Nissan", "Micra", 50000);
        System.out.println(araba3);
        // Araba özellikleri:
        // marka : 'Mercedes',
        // model : 'Micra',
        // renk : 'Yeşil',
        // yil : 1900, fiyat : 20000



    }
}
