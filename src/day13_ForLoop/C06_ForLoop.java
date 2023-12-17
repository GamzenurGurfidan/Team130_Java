package day13_ForLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfwn baslangıc bitis degeri için pozitif tam sayilar girin");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();

        int toplam = 0;


        if (baslangic < bitis) {

            for (int i = baslangic; i <= bitis ; i++) {
                toplam += i;
            }
        } else { // bitis < baslangıctan
            for (int i = bitis; i <= baslangic ; i++) {
                toplam += i;
            }
        }

        System.out.println("girilen sayiların arasındaki tüm sayıların toplamı: " + toplam );

    }
}
