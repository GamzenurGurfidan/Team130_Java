package day32_Encapsulation;

import day31_StringBuilder_AccessModifier.C04_AccessModifier;

public class C01_ChildClass extends C04_AccessModifier {
    // extends keyword içinde bulundugumuz C01 classini
    // C04_AccessModifier classinin childi yapar


    public static void main(String[] args) {

        C04_AccessModifier obj = new C04_AccessModifier();

        // System.out.println(obj.strPrivate); // sadece kendi classo
        // System.out.println(obj.sayiDefault); // kendi packageı // Package Private
        // System.out.println(obj.blProtected);
        obj.methodPublic();

        C01_ChildClass objChild = new C01_ChildClass();
        System.out.println(objChild.blProtected);
        objChild.blProtected = true;

    }
}
