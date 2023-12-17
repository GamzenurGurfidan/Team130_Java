package day28_PassByValue;

public class C02_StaticOlmayanBloklar {

    C02_StaticOlmayanBloklar(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println( "main method calisti");

        C02_StaticOlmayanBloklar obj = new C02_StaticOlmayanBloklar();
        C02_StaticOlmayanBloklar obj2 = new C02_StaticOlmayanBloklar();

    }

    {
        // static olmayan block'lar
        // obje olusturulacagi zaman
        // constructordan hemen once calisir

        // bir obje olusturulmadan once
        // yapilmasi gereken on ayarlar varsa kullanılır
        System.out.println("static olmayan block calisti");
    }

}
