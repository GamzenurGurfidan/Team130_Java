package day33_Inheritance;

public class C07_Vectra extends C06_Opel{

    C07_Vectra(){
        super();
        System.out.println("Vectra constructor calisti");
    }

    String strChild = "Vectra class Child";
    String model = "Vectra";

    public static void main(String[] args) {
        /*
            Bir classdan obje olusturup,
            o classda var olan ozellikleri edinebilmek icin
            MUTLAKA bir CONSTRUCTOR calismalidir

            extends keyword kullanan bir classda
            her constructur ilk satirina
            MUTLAKA bir constructor call bulunur

            EGER gorunur bir constructor call yoksa
            Java default olara super() constructor call koyar
            yani default olarak once parentdaki
            parametresiz constructorin calismasini ister
         */

        C07_Vectra vectra = new C07_Vectra();

        System.out.println(vectra.strGP); // Car class Grand Parent
        System.out.println(vectra.strP);  // Opel class Parent
        System.out.println(vectra.strChild); // Vectra class Child
        System.out.println(vectra.marka); // Opel
        System.out.println(vectra.model); // Vectra

    }
}
