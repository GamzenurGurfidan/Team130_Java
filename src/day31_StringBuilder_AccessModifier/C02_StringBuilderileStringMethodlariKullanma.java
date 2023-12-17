package day31_StringBuilder_AccessModifier;

public class C02_StringBuilderileStringMethodlariKullanma {
    public static void main(String[] args) {
        /*
            StringBuilder ile kullanılabilen methodlar
            String, char gibi başka data turunden sonuc dondurenler
            StringBuilder i kalici olarak degistirmezler
         */

        StringBuilder sb = new StringBuilder("Java candir");

        // sbyi buyuk harflerle yazdirin

        System.out.println(sb.toString().toUpperCase());

        // StringBuiler da olmayan String ozelliklerini kullanmak istersek
        // once toString ile Stringe cevirir, sonra istedigimiz String methodunu kullnabiliriz
        // peki bu degisiklik kalıcı oldu mu

        System.out.println(sb);

        // peki atama yapsak kalıcı olur mu

        // sb = sb.toString().toUpperCase();
        // farkli data turundeki non primitive variablelar
        // birbirine atanamaz ya da karşılaştırılamaz

        StringBuilder sb1 = new StringBuilder("Java");

        // eger sbnin degerini buyuk harf yapıp
        // kalici olarak degistirmek istiyorsa

        sb = new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb); // JAVA CANDİR

        System.out.println(sb.substring(5)); // CANDİR return type string
        System.out.println(sb); // JAVA CANDİR

        System.out.println(sb.charAt(6)); // A return type char
        System.out.println(sb); // JAVA CANDİR




    }
}
