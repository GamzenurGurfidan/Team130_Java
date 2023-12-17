package day18_Scope;

public class C01_Scope_LocalVariables {

    public static void main(String[] args) {

        // KURAL 1 - Bir method icerisinde olusturulan variablellara loca variable denir
        // local variabllar sadece olusturdukları methodda kullanılabilir
        // diger methodlarda KULLANILAMAZ


        String str = "Java Candir";
        // System.out.println(sayi); // bu da aşagı mahallede diyor istemiyor

        int a;
        boolean bl;
        char c;

        // System.out.println(a);

        // a++;

        bl = true;
        c = 'a';

        // KURAL 2 - Local variablelar deger atamadan olusturulabilir amma deger atamadan kullanılamazlar

        for (int i = 0; i < 10; i++) {
            System.out.println(i); // 0123456789
            String s = "Java";
        }
        // System.out.println(s);
        // System.out.println(i);

        // KURAL 3 - Her ne kadar bir methodun içinde olsa da looplar da ayri bir local alandir
        //           Loop içinde olusturulan variablelar loop dısında KULLANILAMAZ

    }

    public static void mothod1(){

        // System.out.println(str); // yukarı mahallede kabul etmez

        int sayi = 10;

    }

}
