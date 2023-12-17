package day27_ConstructorCall;

public class Deneme {

    String str = "a";


    Deneme() {

        str = str + "b";

    }

    Deneme(String c) {

        str = str + c;

    }

    public static void main(String[] args) {
        Deneme deneme1 = new Deneme("r");

        Deneme deneme2 = new Deneme();

        System.out.println(deneme1.str + deneme2.str);
    }

}

