package day34_InheritanceConstructorCall;

public class C01_GP {
    C01_GP(){
        System.out.println("GP Parametresiz constructor");
    }
    C01_GP(int sayi){
        this("Ali");
        System.out.println("GP int parametreli constructor");
    }
    C01_GP(String str){
        System.out.println("GP String parametreli constructor");
    }
    C01_GP(boolean bl){
        System.out.println("GP boolean parametreli constructor");
    }
}
