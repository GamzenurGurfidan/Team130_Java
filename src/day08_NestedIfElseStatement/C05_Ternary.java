package day08_NestedIfElseStatement;

public class C05_Ternary {
    public static void main(String[] args) {
        // input olarak verilen bir tamsayinin
        // pozitif veya negatif değil yazdirin

        int input= 56;

        if (input > 0){
            System.out.println("sayi pozitif");
        }else {
            System.out.println("sayı negatif");
        }

        //input olarak verilen sayi çift ise
        //2 katına çıkartın
        //tek sayi ise değerini 5 artırın

        if (input % 2== 0){
            input *= 2;
        }else {
            input += 5;
        }

        System.out.println(input > 0 ? "sayi pozitif" : "sayi negatif");

        input = input %2 == 0 ? input * 2 : input + 3;

    }
}
