package day31_StringBuilder_AccessModifier;

public class C04_AccessModifier {
    private String strPrivate;
    int sayiDefault; // goruunr bir access yoksa, DEFAULT gecerlidir
    protected boolean blProtected;


    public void methodPublic(){}

    /*
        Nasıl ki class level da olusturulan ama deger atanmayan variablelara
        java default deger tanımlıyorsa

        methodlar veya class levelda  olusturulan variablelar icin
        access modifier yazılmazsa
        java access modifier olarak "Default access modifier" tanımlar

        1 - en geniş access modifier PUBLIC ==> herkes erişebiliri
        2 - PROTECTED ==> içinde bulundugumuz class, package ve baska packagedaki child classlar
        3 - default access modifier ==> içinde bulundugu class ve içinde buludugu packagedaki diger classlar
        4 - en dar access modifier PRIVATE ==> sadece icinde bulundugu classtan kullanılabilir
     */
    public static void main(String[] args) {
        /*
            Bir obje olusturursak
            içinde bulundugumuz classdaki
            tum access lere ulaşabiliriz
         */

        C04_AccessModifier obj  = new C04_AccessModifier();

        System.out.println(obj.strPrivate);
        System.out.println(obj.sayiDefault);
        System.out.println(obj.blProtected);
        obj.methodPublic();
    }


}
