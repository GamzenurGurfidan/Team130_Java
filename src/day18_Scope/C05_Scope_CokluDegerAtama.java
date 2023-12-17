package day18_Scope;

public class C05_Scope_CokluDegerAtama {


    static String str;
    static int sayi;

    public static void main(String[] args) { // 1

        System.out.println(str); // null  // 2

        sayi = 20;  // 3

        method1();  // 4

        str = "Java"; // 10

        System.out.println(sayi); // 35 // 11
        sayi = 30; // 12

        method1(); // 13

    }

    public static void method1() { // 5 // 14

        System.out.println(sayi); // yirmi // 6 // otuz //15

        sayi = sayi + 15; // 7 // 16

        System.out.println(str); // null // 8 // java // 17

    }//9 // 18
}
