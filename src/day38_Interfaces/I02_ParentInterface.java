package day38_Interfaces;

public interface I02_ParentInterface {

    void method1();

    void method2();

    public abstract String method3();

    public default void method20(){

    }
    public static void method21 (){

    }

    /*
        java 8 ile birlikte developerlardan gelen talepler dogrultusunda
        java interfaceler icin bir istisna olusturmus

        Talep: interfacee sonradan bir method eklememiz gerekirse
               onceden bu interfacei inherit eden
               tum classlar kizariyor
               sonradan ekledigimiz bu methodu mecburi olmaktan kurtar

        Interfacelere sonradan eklenen methodlari
        IMPLEMENT etmenin mecbur olmamasi için
        bu methodların bodysi olmalıdir
        interfacede bodysi olan method olusturabilmemiz için

        Java bildigmiz 2 keywordu ozel kullanım için yetkilendirmiş
        bu iki kelime
                -default
                -static
        iki kywordun kullanımdaki farki bu methodlara erisim yontemi ile ilgilidir

        - static keyword ile olusturulan methoda static yontemle
          yani intefaceIsmi.staticMethodismi( ile ulaşabiliriz
        - default keyword ile olusturulan methoda ise
          obje olusturup, obje uzerinden ulaşabiliriz

     */


}
