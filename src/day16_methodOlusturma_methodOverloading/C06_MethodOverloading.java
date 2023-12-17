package day16_methodOlusturma_methodOverloading;

public class C06_MethodOverloading {
    public static void main(String[] args) {

        /*
                Java bir classda ayni isimde birden fazla method olmasına izin verir
                ANCAK SIGNATURE'ları farkli olmak Zorundadır

                Signature => method ismi + parametre data turleri demektir

                Eger ayni isimde birden fazla method varsa
                1- java oncelikle argument ve parametreler arasında %100 uyum olan var diye kontrol eder
                2- eger %100 uyum yoksa casting ile kullanilabilecek var mi diye tumunu kontrol eder

        */

        topla(6); //1 --- Tek integer : 12
        topla(3,5); //2 --- int int : 8
        topla(6.3,5); //3 --- double int : 11.3
        topla(2.4f,5); //4 --- float int : 7.4
        topla(2.3,3.4);  //5 --- double double : 5.699999999999999
        topla('a',5); // topla char, int yok --- int int: 102
        topla(2.3f,3.5f); // topla float float --- double double : 5.799999952316284
        topla(4,5.2); // topla int double --- double double : 9.2


    }
    public static void topla (int sayi){ // topla int
        System.out.println("Tek integer : " + (sayi + sayi));

    } //1
    public static void topla (int a, int b){ // topla int int
        System.out.println("int int : " + (a+b));

    } //2
    public static void topla (double c, int d){ // topla double int
        System.out.println("double int : " + (c+d));

    } //3
    public static void topla (float c, int d){ // topla float int
        System.out.println("float int : " + (c+d));

    } //4
    public static void topla (double c, double d){ // topla double double
        System.out.println("double double : " + (c+d));

    } //5

}
