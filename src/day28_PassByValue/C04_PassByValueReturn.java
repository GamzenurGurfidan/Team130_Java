package day28_PassByValue;

public class C04_PassByValueReturn {
    public static void main(String[] args) {

        /*
                Methodlar arasi geciste variablein kendisi degil degeri yollanır

                her methodun icindeki local variable o methodda gecerli oldugundan
                main methodda atama varsa, main methoddaki fiyat variablei kalici degisir
                diger methodda atama varsa o methoddaki variablein degeri degişir

                method her cagrildiginda sanki ilk defa calisiyor
                giib sifirdan baslar
         */

        // verilen bir fiyat icin
        // %10 indirimli fiyati hesaplayip
        // indirimli fiyati donduren bir method olusturun

        double fiyat = 200;

        System.out.println(fiyat); //200

        System.out.println(yuzde10IndirimliFiyatHesapla(fiyat));

        fiyat = yuzde10IndirimliFiyatHesapla(fiyat);

        System.out.println(fiyat);

    }

    public static double yuzde10IndirimliFiyatHesapla(double fiyat) {

        fiyat = fiyat * 90 / 100;

        return fiyat;
    }
}
