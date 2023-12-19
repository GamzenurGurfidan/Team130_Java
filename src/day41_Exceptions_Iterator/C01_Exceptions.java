package day41_Exceptions_Iterator;

public class C01_Exceptions {
    public static void main(String[] args) {

        int sayi = 10;

        // eger sayi negatifse sadece 1. satir calissin
        // sonra 5. satirdan normal calısmaya devam etsin
        // sayi cift ise 1.2. satir calissin
        // sonra 5. satirdan normal calısmaya devam etsin
        // diger durumlarda da 5 satir dacalıssım


        try {

            System.out.println("satir1");
            if (sayi < 0) throw new IllegalArgumentException();

            System.out.println("satir2");

            if (sayi % 2 == 0) throw new RuntimeException();

            System.out.println("satir3");
            System.out.println("satir4");
            System.out.println("satir5");

        } catch (IllegalArgumentException e) {
            System.out.println("Sayi negatif oldugundan 2,3,4,5 atlandi ");
        } catch (RuntimeException e) {
            System.out.println("sayi cift oldugu için 3,4,5 atlandi");
        }

        System.out.println("burudan itibaren calışmaya devam");

    }
}
