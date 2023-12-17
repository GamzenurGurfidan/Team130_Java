package day08_NestedIfElseStatement;

public class C06_Ternary {
    public static void main(String[] args) {

        /*
            ternary il-elsein alternatifi değildir
            sadece basit işlemlerde if-elsein yerine tercih edilebilir

            ternary bir sonuc uretir
            java tek basına ternary nin sonucunu ne yapacağını bilemez
            YAZDIRMA ya da ATAMA yapmalısınız

            eger boolean sart true oldugunda elde edilen sonuc ile
            false oldugunda elde edilen sonuc farklı data turlerine sahipse
            bir variablea atama yapamazsını sadece yazdırabilirsiniz
         */
        int input = 24;

        //iki basamaklı mı?-
        //iki basamaklıysa sayiyi 2 katina çıkarın
        //iki basamakli değilse 2 basamakli degil yazdirin

        // String sonuc = input >= 10 && input <= 99 ? input * 2 : "iki basamakli değil";

        System.out.println(input >= 10 && input <= 99 ? input = input * 2 : "iki basamakli değil");
        System.out.println("inputun son hali: " + input);

    }
}
