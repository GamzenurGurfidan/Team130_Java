package day13_ForLoop;

public class C03_DikkatEdilecekler {
    public static void main(String[] args) {

        // eger i'nin ilk degeri icin bile bitis sarti true olmazsa
        // loop bodysi hiç devreye girmez
        // LOOP ÇALIŞIR ama hiç bir islem yapmaz

        for (int i = 10; i > 20; i++) {
            System.out.println("bu loop bodysi hiç calışmaz");
        }

        // EGER inin bütün degerleri icin bitis sartı true oluyorsa
        // bu duruma teknik olarak SONSUZ LOOP denir

        for (int i = 10; i > 0; i++) {
            System.out.println(i + " ");
        }

    }
}
