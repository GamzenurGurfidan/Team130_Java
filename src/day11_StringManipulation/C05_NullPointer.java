package day11_StringManipulation;

public class C05_NullPointer {
    public static void main(String[] args) {

        String str;

        // deger yoksa yazdırırken hata verir

        String str2 = "";

        System.out.println("Str2 nin değeri: " + str2 + "=====");
        System.out.println("str2nin uzunlugu: " + str2.length()); //0

        // str2ye hiçlik atanabilir
        // ama bu durumda java bu variablea bir deger atandıgını kabul eder
        // deger atanmamıs elementleri say dediğimizde
        // "" degeri atananları dolu kabul eder
        // baska data turlerinde hiçlik atama sansi da olmaz

        // null pointer java tarafından özl bir görev ile olusturulmustur
        // bir variableın deger atanmamıs oldugunu isaretler
        // null bir deger degil isaretcidir

        String str3 = null; // deger atanmamıs null olarak isaretlenmiş
        System.out.println(str3); //null

        //null primitive variablelara yazılamaz sadece non primitivelere yazılır

        System.out.println(str3 + "Java"); //nullJava

        // null olarak işaretlenen variablelar sadece yazdirilabilir
        // deger atamadan başka islem yapmak  isterseniz
        // NullPointerException verir

        // System.out.println(str3.length()); //NullPointerException
        // System.out.println(str3.concat("Java")); //NullPointerException

        String str4 = "123";
        System.out.println(Integer.parseInt(str4) + 5);
    }
}
