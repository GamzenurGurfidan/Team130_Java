package day31_StringBuilder_AccessModifier;

public class C05_ChildOfC04 extends C04_AccessModifier{
    public static void main(String[] args) {
        /*
            Aynı package içinde farkli bir
            classdayiz ama child classdayiz
         */

        C04_AccessModifier obj  = new C04_AccessModifier();

        // System.out.println(obj.strPrivate);
        System.out.println(obj.sayiDefault);
        obj.sayiDefault = 30;

        System.out.println(obj.blProtected);
        obj.blProtected = true;

        obj.methodPublic();


    }
}
