package day18_Scope;

public class C04_BaskaClasstanVariableVeMethodKullanimi {
    public static void main(String[] args) {

        // baska classtan static class uyesi kullanmak icin
        // classIsmi.staticUyesIsmi yamamız yeterli

        System.out.println(C03_Scope_ClassVariableKullanim.s); //null
        System.out.println(C03_Scope_ClassVariableKullanim.a); // 0
        C03_Scope_ClassVariableKullanim.method1(); // static method çalıştı


        // static olamyan uyelere ulasmak icin
        // kullanmak istedigimiz classtan obje olusturmaliyiz

        C03_Scope_ClassVariableKullanim obj = new C03_Scope_ClassVariableKullanim();
        System.out.println(obj.chr); // hiçlik
        System.out.println(obj.bl); // false
        obj.method2(); // static olmayan method calisti

        // static olan bir class uyesine
        // static olmayan yolla ulasmak istersek
        // java kullanılmamıza itiraz etmez
        // ama intelliJ bizi uyarız
        //Static member 'day18_Scope.C03_Scope_ClassVariableKullanim.method1()' accessed via instance reference
        // static bir class uyesşne neden static olmayan yöntemle ulasıyorsun

        System.out.println(obj.s); // null
        System.out.println(obj.a); // 0
        obj.method1(); // static method çalıştı




    }
}
