package day12_StringManipulations;

public class C10_ForLoop {
    public static void main(String[] args) {

        // Java da başlagıc ve bitiş degeri belli olan veya
        // tekrar sayisi verilmiş olan islemler için
        // LOOP
        
        // 5 kere hello world yazdır

        String str = "Hello World\n";
        System.out.println(str.repeat(5));

        // 1den 10a kadar sayıları yazdırın

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }

        String text = "Can, Cananlara gitmek icin can atiyor";

        System.out.println(text.replace("Can", "Turk"));
    }
}
