package day34_InheritanceConstructorCall;

public class C05_Child extends C04_Parent{

    String str = "Java daha güzeldir";
    String t = "Java java  java";
    int sayi = 15;
    int b = 25;

    public static void main(String[] args) {

        C05_Child obj = new C05_Child();
        obj.method1();

    }
    public void method1 (){
        /*
          her hangi bir scopta bir variable kullanmak istedigimizde
          o variableın degerini bulmak için Java:
            - once içinde bulundugu scopa
            - orada yoksa class levela
            - orada da bulamazsa parenta
            - parentta da bulamazsa grand parentlara bakar
          ve ilk buldugu degeri kullanır.

          Eger this.variable dersek
          bu durumda arama islemini yaparken
          içinde bulundugumuz scopu atlayıp
          aramaya class leveldan baslar

          Eger super.variable dersek
          scop ve class levelı atlayıp armaya parent classtan baslar

          ONEMLI NOT : Aramaya baslayacağı yeri javaya soyleyince
                       java soyledigimiz yerden baslar
                       ve yukarıda yazılan sıralama ile aramaya devam eder
                       Eger aradıgı variableı, aradıgı basamaklarda
                       bulamazsa CTE verir
        */

        String t = "Hava çok guzel";
        int a = 27;
        int b = 37;
        String str = "Her sey guzel olacak";

        System.out.println(s); // Java candir
        System.out.println(this.s); // Java candir
        System.out.println(super.s); // Java candir

        System.out.println(sayi); // 15
        System.out.println(this.sayi); // 15
        System.out.println(super.sayi); //20

        System.out.println(t); // Hava çok guzel
        System.out.println(this.t); // Java java  java
        // System.out.println(super.t); CTE

        System.out.println(b); //37
        System.out.println(this.b); // 25
        // System.out.println(super.b); // CTE

        System.out.println(str); // Her sey guzel olacak
        System.out.println(this.str); // Java daha güzeldir
        System.out.println(super.str); // Java güzeldir

        System.out.println(a); // 27
        System.out.println(this.a); // 30
        System.out.println(super.a); // 30

    }

}
