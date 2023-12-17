package day37_AbstractClasses;

public class C00_Kurallar {
        /*
        KURAL 1 - Bir abstract classı parent edinen
                  abstract olmayan(concrete) bir child class
                  parent classda abstract olarak olusturulan
                  tum methodlari
                  kendisine IMPLEMENT etmek ZORUNDADIR

                  parent classdaki concrete methodlar için
                  boyle bir mecburiyeti YOKTUR

        KURAL 2 - Bir abstract class ve/veya concrete methodlar barindirabilir
                  Bir conctrete class ise abstract method BARINDIRAMAZ

        KURAL 3 - Abstract bir classi parant edinen
                  Abstract bir class, kendisi de abstract oldugundan
                  parent classdaki abstract methodlari
                  ibplement etmek ZORUNDA DEGİLDİR

                  Abstract parent - abstract child arasindaki iliskisi
                  concrete parent - child iliskisi gibidir
                  child class isterse override eder, isterse parent classdan kullanir

        KURAL 4 - Abstract bir silsileden sonra gelen
                  ilk CONCRETE Class
                  Parent abstract class(lar)daki
                  concreteleştirilmemiş olan
                  tum abstract methodlari implement etmek ZORUNDADIR

        KURAL 5 - Abstract classlar class olduklari için
                  constructora sahiptirler
                  AMMA abstract classlardan obje olusturulamaz

                  Cunku abstract classtan bir obje olusturursanız
                  o classdan methodlari çalistirabilmelisiniz
                  amma abstract methodlar bodysi olmadigindan calisamaz



     */
}
