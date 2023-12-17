package day26_Constructor;

public class C05_Car {
    String marka = "Marka belirtilmemiş";
    String model = "Model belirtilmemiş";
    String renk = "Renk belirtilmemiş";
    int yil = 1900;
    int fiyat;

    C05_Car() {


    }

    // marka ve model parametreli bir constructor olusturalim
    C05_Car(String mrk, String mdl) {
        marka = mrk;
        model = mdl;

    }
    // tum variableların oldgu bir constructor olusturalim

    C05_Car(String marka, String model, String renk, int yil, int fiyat) {
        /*
             Constructor icinde atama yapmanin amaci parametre
             olarak gelen degeri class leveldeki inctance variable atamaktadir

             eger parametre ve instance isimleri Aynı degilse
             renk = rnk;
             yil = yl;
             java burada class leveldaki ile scopedaki variablelari ayriran

             eger parametre ismi ile instance variable ismi AYNI ise
             marka = marka;
             model = model;
             java burada hangisinin parametreden gelen variable,
             hangisinin class leveldaki variable olduguna bakmaz
             cunku java kolayi  tercih eder
             scopeda variableı bulursa class level
         */

        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;

    }

    @Override
    public String toString() {
        return "Arabanın özellikleri: " +
                "marka: '" + marka + '\'' +
                ", model : '" + model + '\'' +
                ", renk : '" + renk + '\'' +
                ", yil : " + yil +
                ", fiyat : " + fiyat ;
    }
}
