package day26_Constructor;

public class C02_CarRunner {
    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        System.out.println(car1);
        // Araba özellikleri:
        // marka :'Marka belirtilmemiş',
        // model :'Model belirtilmemiş',
        // renk :'Renk belirtilmemiş',
        // yil : 1900, fiyat : 0

        car1.marka = "Opel";
        car1.model = "Vectra";
        car1.renk = "Siyah";
        car1.yil = 2008;
        car1.fiyat = 50000;

        System.out.println(car1);
        // Araba özellikleri:
        // marka :'Opel',
        // model :'Vectra',
        // renk :'Siyah',
        // yil : 2008, fiyat : 50000

        // bana toyota, corolla araba uret

        C01_Car car2 = new C01_Car("Toyota","Corolla");

        System.out.println(car2);
        // Araba özellikleri:
        // marka:'Toyota',
        // model:'Corolla',
        // renk:'Renk belirtilmemiş',
        // yil:1900, fiyat:0

        C01_Car car3 = new C01_Car("Volvo","C40");
        System.out.println(car3);
        // Araba özellikleri:
        // marka:'Volvo',
        // model:'C40',
        // renk:'Renk belirtilmemiş',
        // yil:1900, fiyat:0

        C01_Car car4 = new C01_Car("Nissan", "Mavi", 2012);
        System.out.println(car4);
        // Araba özellikleri:
        // marka:'Nissan',
        // model:'Model belirtilmemiş',
        // renk:'Mavi',
        // yil:2012, fiyat:0

        C01_Car car5 = new C01_Car("Tofaş","Sahin","Kirmizi",1990,150000);

        System.out.println(car5);
        // Araba özellikleri:
        // marka:'Tofaş',
        // model:'Sahin',
        // renk:'Kirmizi',
        // yil:1990, fiyat:150000


    }
}
