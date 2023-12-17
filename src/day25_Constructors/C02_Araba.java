package day25_Constructors;

public class C02_Araba {

    String marka = "Marka belirtilmemiş";
    String model = "Model belirtilmemiş";
    String renk = "Renk belirtilmemiş";
    int yil = 1900;
    int fiyat;


    @Override
    public String toString() {
        return "Araba özellikleri" +
                ": marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", renk:'" + renk + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat
                ;
    }

    C02_Araba(){
        // Bu constructor default constructor ile
        // işleve sahiptir
        // AMMA gorunur oldugunda buna
        // default constructor denmez
        // parametresiz constructor denir
        // Bu constructor'in bodysine kod yazabiliriz
        // ama default contructor'in body'sinde kod olmaz
    }

    public void motor (){
        System.out.println("Tüm arabaların motoru olur");
    }
    public void guvenlik (){
        System.out.println("Tüm arabaların guvenlik donanımları olmalıdır");
    }
}
