package day18_Scope;

public class C03_Scope_ClassVariableKullanim {

    /*
        Kural 4 - static variablelar her yere gidebilirler
                  static olmayan variablelar (instance variable)lar ise
                  static olanlara girmezler

        Kural 5 - class level variblelar deger atanmadan olusturulabildigi gibi
                  deger atanmadan kullanılabilirler
                  biz deger atamazsak, java default deger olarak
                  - non-primitivelere ==> null
                  - sayisal primitivelere ==> 0
                  - boolean variablelara ==> false
                  - char variablelara ==> hiçlik degeri atar
     */

    static String s;
    static int a;
    boolean bl;
    char chr;

    public static void main(String[] args) {

        System.out.println(s); // null
        System.out.println(a); // 0

        // eger static olmayan class uyelerine static alandan ulasmak istersek
        // once classtan bir obje olusturulmalı
        // sonra o obje uzerinden static olmayan uyeler kullanılmalıdır

        C03_Scope_ClassVariableKullanim obj = new C03_Scope_ClassVariableKullanim();

        System.out.println(obj.chr); //
        System.out.println(obj.bl); // false

    }
    public static void method1(){
        System.out.println("static method çalıştı");


    }
    public void method2 (){
        System.out.println("static olmayan method calisti");


    }


}
