package day10_StringManipulations;

public class C06_StartsWith_EndsWith {
    public static void main(String[] args) {

        String str = "Java Candır";

        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Ja")); //true
        System.out.println(str.startsWith("Java")); //true
        System.out.println(str.startsWith("Java Candır")); //true
        System.out.println(str.startsWith("")); // true

        System.out.println(str.endsWith("r")); //true
        System.out.println(str.endsWith("dır")); //true
        System.out.println(str.endsWith("Candır")); //true
        System.out.println(str.endsWith("Java Candır")); //true
        System.out.println(str.endsWith("")); // true

    }
}
