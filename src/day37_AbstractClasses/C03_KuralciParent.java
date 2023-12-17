package day37_AbstractClasses;

public abstract class C03_KuralciParent {

    public abstract void method1();
    // Abstract methods cannot have a body
    // bunlara bir method oalrak degil,
    // resmi gazetede yazan bir standart olarak dusunun


    public abstract String method2();
    public void method3() {
    }

    public int method4() {
        return 0;
    }


    /*
        eger bir classin child classlar uzerinde kural koyucu olmasını istiyorssanız
        Java iki alternatif sunar
        1- Abstract classes
        2- Interfaces

        Bir classi abstract class yapmak için
        class deklarasyonuna abstract yazmaniz yeterlidir

        Abstract class kismi abstraction saglar
        Yaniii icinde child classlarin
         - Mutlaka Override etmesi gereken methodlar olacagi gibi
           (abstract method olarak olusturmalıyız)

         - override etmenin mecbur olmadigi,
           child classin insiyatifi birakildigi methodlar da olabilir
           (simdiye kadar olusturdugumuz methodlar gibi olusturmaliyiz)
     */
}
