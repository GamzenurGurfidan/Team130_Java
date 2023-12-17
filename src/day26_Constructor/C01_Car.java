package day26_Constructor;

public class C01_Car {


    String marka = "Marka belirtilmemiş";
    String model = "Model belirtilmemiş";
    String renk = "Renk belirtilmemiş";
    int yil = 1900;
    int fiyat;

    public C01_Car() {

    }

    public C01_Car(String mrk, String rnk, int yl) {
        marka = mrk;
        renk = rnk;
        yil = yl;
    }
    public C01_Car(String mrk, String mdl, String rnk, int yl, int fyt) {
        marka = mrk;
        model = mdl;
        renk = rnk;
        yil = yl;
        fiyat = fyt;
    }


    public void motor() {

        System.out.println("Tüm arabaların motoru olur");
    }

    public void guvenlik() {
        System.out.println("Tüm arabaların guvenlik donanımları olmalıdır");
    }

    C01_Car(String mrk, String mdl) {
        marka = mrk;
        model = mdl;
    }

    public String toString() {
        return "Araba özellikleri" +
                ": marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", renk:'" + renk + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat
                ;
    }
}
