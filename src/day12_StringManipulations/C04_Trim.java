package day12_StringManipulations;

public class C04_Trim {
    public static void main(String[] args) {

        String str = "      Ali     topa        vur.        ";

        // metindeki fazla kullanılan spaceleri temizle

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        System.out.println(str);

    }
}
