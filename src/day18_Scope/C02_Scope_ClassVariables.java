package day18_Scope;

public class C02_Scope_ClassVariables {

    /*
       static keyword bir nevi statü belirtir
       static unvanını alan variable veya methodlar
       static olmayan class uyelerini kabul etmezler

       static uyeler ellerini kollarını sallayarak her yere gidebilirler
       ama kendi içlerine static olmayan uyeleri almazlar
     *//*
        Class leveldaki variablelar da static olarak veya static keyword kullanılmadan olusturulabilir
     */

    static String s;
    static int a;
    boolean bl;
    char chr;


    public static void main(String[] args) {

        staticMethod1();
        //staticOlmayanMethod2();
        // Non-static method 'staticOlmayanMethod2()' cannot be referenced from a static context

        s = "java";
        a = 10;
        // bl = true;
        // chr = 'a';

    }

    public static void staticMethod1() {

        //staticOlmayanMethod2();

        s = "hava";
        a = 30;
    }

    public void staticOlmayanMethod2() {

        staticMethod1();

        System.out.println(s);
        System.out.println(a);

        System.out.println(bl);
        System.out.println(chr);

    }
}
