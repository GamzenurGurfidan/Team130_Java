package day26_Constructor;

public class C06_CarRunner {
    public static void main(String[] args) {

        C05_Car car1 = new C05_Car("Toyota", "Corolla");

        System.out.println(car1);
        // Arabanın özellikleri:
        // marka: 'Toyota',
        // model : 'Corolla',
        // renk : 'Renk belirtilmemiş',
        // yil : 1900, fiyat : 0


        C05_Car car2 = new C05_Car("reno", "clio", "kahve", 2010, 5000);

        System.out.println(car2);
        // Arabanın özellikleri:
        // marka: 'Marka belirtilmemiş',
        // model : 'Model belirtilmemiş',
        // renk : 'Renk belirtilmemiş',
        // yil : 1900, fiyat : 0

        C05_Car car3 = new C05_Car("Audi", "c4", "sari", 2010, 50000);

        System.out.println(car3);

    }
}
