package day31_StringBuilder_AccessModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.capacity()); // 27
        System.out.println(sb1.length()); // 11


        sb1.append(", bundan suphe eden mi var ?");

        System.out.println(sb1);
        // Java Candir, bundan suphe eden mi var ?
        // StringBuilder mutable oldugundan
        // method ile yapilan degisiklikler kalici olur

        System.out.println(sb1.capacity()); // 56
        System.out.println(sb1.length()); // 39

        // capacity ve legthi esitlemek isterseniz


        sb1.trimToSize();
        System.out.println(sb1.capacity()); // 39
        System.out.println(sb1.length()); // 39

        String str = "Hava çok guzel";

        sb1.append(str, 5, 9);
        // sb1'in sonuna str'in belirtilen aralıgındaki karakterleri ekler

        System.out.println(sb1); // Java Candir, bundan suphe eden mi var ?çok

        sb1.insert(5,"niye bu kadar ");
        // sb1'nin istenen yerine, verilen Stringi inssert eder

        System.out.println(sb1); // Java niye bu kadar Candir, bundan suphe eden mi var ?çok

        sb1.insert(18,str,4,8); // 18. indexe str'in istenen parcasını insert eder
        System.out.println(sb1); // Java niye bu kadar çok Candir, bundan suphe eden mi var ?çok

        sb1.delete(5,10);
        System.out.println(sb1); // Java bu kadar çok Candir, bundan suphe eden mi var ?çok

        sb1.deleteCharAt(54);
        System.out.println(sb1); // Java bu kadar çok Candir, bundan suphe eden mi var ?ço

        sb1.delete(52,55);
        System.out.println(sb1); // Java bu kadar çok Candir, bundan suphe eden mi var ?

        // bu cumleyi tersine cevirin

        System.out.println(sb1.reverse()); // ? rav im nede ehpus nadnub ,ridnaC koç radak ub avaJ
        System.out.println(sb1); // kalici oldu
        System.out.println(sb1.reverse()); // Java bu kadar çok Candir, bundan suphe eden mi var ?

        // StringBuilder mutable oldugundan
        // soutun icinde bile yaptıgımız degisiklikler kalıcı olur

        sb1.replace(24,52,"");
        System.out.println(sb1); // Java bu kadar çok Candir



    }
}
