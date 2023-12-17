package day32_Encapsulation;

public class C03_Encapsulation {
    private String strPrivate;
    String strDefault;
    protected String strProtected;
    public String strPublic;

    // baska classlar satis tutari variableina deger atayabilsin
    // atanan her deger toplam satis tutarına otomatik olarak eklensin
    // ama satis tutarı variableinin degerini kimse yazdiramasin
    // deger atanabilsin ama atanan degerler gorulemesin

    private int satisTutari;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }

    // toplam satis tutari degerini baska classlar gorebilsin
    // ama kimse toplam satis tutari variableina deger atayamasin
    // degeri gorulebilsin ama deger atanamasin

    private  int toplamSatisTutari;

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }







    public static void main(String[] args) {
        /*
            Direkt erisim icin sadece access modifier yeterli olmaz
            static keyworde bakmak gerekir


         */
        C03_Encapsulation obj = new C03_Encapsulation();


        obj.strDefault = "Default variable";
        System.out.println(obj.strDefault); // Default variable

        obj.strPrivate = "Private variable";
        System.out.println(obj.strPrivate); // Private variable

    }

}
