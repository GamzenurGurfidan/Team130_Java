package day40_Exception;

public class C04_BaziExceptionTurleri {
    public static void main(String[] args) {
        // 1 - NullPointerException
        // null olarak isaretlenen bir string
        // method ile kullanılırsa olusur

        String str = null;

        System.out.println(str); // null
        System.out.println(str + 555); // null555

        // System.out.println(str.concat("555")); //NullPointerException

        // System.out.println(str.substring(1)); // NullPointerException

        // 2 - StringIndexOutOfBoundException
        // verilen Stringde sinirlarin disinda index kullanilirsa

        str = "Java Candir";
        //System.out.println(str.substring(15,18)); // StringIndexOutOfBoundsException

        // 3 - ArrayIndexOutOfBoundException
        // verilen arrayde sinirlarin disinda index kullanılırsa

        // 4 - NumberFormatException
        // icinde sayi olmayan karakter barindirqn bir String
        // Integera parse edilmeye calisilirsa

        str = "12"; // "12*"

        // String olarak verilen sayinin karesini yazdirin

        System.out.println(Integer.parseInt(str) * Integer.parseInt(str)); // 144

        // 5 - ClassCastException
        // cast edilmesi mümkün olmayan bir degeri object üzerinden bir variablea
        // atamak istersek olusur

        Integer a = 6;
        Object b = "a"; // a
        String s = (String) b;

        System.out.println(s); // sedat

    }
}
