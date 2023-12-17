package day32_Encapsulation;

public class C04_EncapsulationRunner {
    public static void main(String[] args) {

        // Access Modifier ile bir variablea erisim yetkimiz varsa onu
        // HEM onu yazdırabilir HEM DE deger atayabiliriz
        // ulaşamıyorsak da hiç bir işlem yapamayiz

        C03_Encapsulation obj = new C03_Encapsulation();
        C03_Encapsulation obj2 = new C03_Encapsulation();

       // obj.strPrivate = "Private";
       // System.out.println(obj.strPrivate);

        obj.strDefault = "Default";
        System.out.println(obj.strDefault);

        obj.strProtected = "Protected";
        System.out.println(obj.strProtected);

        obj.strPublic = "Public";
        System.out.println(obj.strPublic);

        // PEKİİ okuma yani degerini goruntuleme yetkisi ile
        // write yani deger atayabilme yetkisini ayirabilir misiniz?

        /*
            İlgili variablelari private yaptıgımız için
            acces Modifier onlari kullanmamıza hiçbir sekilde
            İZİN VERMEZ


            obj.satisTutari = 20;
            System.out.println(obj.satisTutari);
            obj.toplamSatisTutari = 50;
            System.out.println(obj.toplamSatiTutari);

         */

        System.out.println(obj.getToplamSatisTutari()); // 0

        obj.setSatisTutari(50);
        obj.setSatisTutari(100);
        obj.setSatisTutari(100);

        System.out.println(obj.getToplamSatisTutari()); // 250

        // satis tutarı variablenin degerini yazdirana
        // 100 €

        // System.out.println(obj.satisTutari);

        // toplam satis tutari variableina deere atayana da
        // 100 €

        // obj.toplamSatisTutari = 200;
    }
}
