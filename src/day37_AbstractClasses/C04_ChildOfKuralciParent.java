package day37_AbstractClasses;

public class C04_ChildOfKuralciParent extends C03_KuralciParent {

    // Class 'C04_ChildOfKuralciParent' must either be declared abstract
    // or implement abstract method 'method2()' in 'C03_KuralciParent'

    /*
        KURAL 1 - Bir abstract classı parent edinen
                  abstract olmayan(concrete) bir child class
                  parent classda abstract olarak olusturulan
                  tum methodlari
                  kendisine IMPLEMENT etmek ZORUNDADIR

                  parent classdaki concrete methodlar için
                  boyle bir mecburiyeti YOKTUR

       KURAL 2 -  Bir abstract class ve/veya concrete methodlar barindirabilir
                  Bir conctrete class ise abstract method BARINDIRAMAZ
     */

    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    // public abstract void method5();
    // Abstract method in non-abstract class
}
