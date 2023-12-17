package day10_StringManipulations;

public class C05_Contains {
    public static void main(String[] args) {

        String str = "Java Candır";

        // Adet gozetmeksizin, bir Stringde
        // aranan bir metin var olup olmadigina bakar
        // metin varsa true, yoksa false

        System.out.println(str.contains("a")); //true
        System.out.println(str.contains("b")); //false
        System.out.println(str.contains("java")); // false Java
        System.out.println(str.contains("a C")); //true

        System.out.println(str.contains(" ")); //true
        System.out.println(str.contains("")); //true

    }
}
