package day30_Timedate_Varargs;

public class C06_Varargs {
    public static void main(String[] args) {

        islemYap("Ali","Veli","Sahil","Saido"); // 6
        islemYap("Meltem"); // 6
        islemYap("Gamzenur","Halil","Selçuk","Sevket"); // 11

    }

    public static void islemYap (String s, String... t){

        System.out.println(s.length() + t.length);
    }
}
