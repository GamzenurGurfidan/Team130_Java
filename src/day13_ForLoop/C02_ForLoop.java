package day13_ForLoop;

public class C02_ForLoop {
    public static void main(String[] args) {

        // 60 ve 23 dahil olmak üzere
        // 7 ile bölünebilen sayilari 60'dan geriye dogru yazdırın

        for (int i = 60; i >= 23; i--) {

            if (i % 7 == 0) {
                System.out.print(i + ", ");
            }

        }
        System.out.println(" ");
        // 3 basamakli pozitif tum tam sayilari toplayip, sonucu yazdirin

        int toplam = 0;

        for (int i = 100; i < 1000; i++) {

            toplam += i;

        }
        System.out.println("sayiların toplamı: " + toplam);

        // -1000 ile +1000 arasindaki tum tam sayıları toplayın

        toplam = 0;

        for (int i = -1000; i <= 1000; i++) {

            toplam += i;

        }
        System.out.println("sayilarin toplamı = " + toplam);
    }
}
