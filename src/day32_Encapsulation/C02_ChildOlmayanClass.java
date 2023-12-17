package day32_Encapsulation;

import day31_StringBuilder_AccessModifier.C04_AccessModifier;

public class C02_ChildOlmayanClass {
    public static void main(String[] args) {
        C04_AccessModifier obj  = new C04_AccessModifier();

        // System.out.println(obj.strPrivate); // sadece aynı classtakiler
        // System.out.println(obj.sayiDefault); // sadece ayni packagedakiler
        // System.out.println(obj.blProtected); // sadece child classdakiler
        obj.methodPublic();
    }
}
