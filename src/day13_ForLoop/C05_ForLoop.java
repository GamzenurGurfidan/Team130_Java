package day13_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfwn baslangıc bitis degeri için pozitif tam sayilar girin");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (bitis < baslangic){
            System.out.println("bitiş degeri baslangictan kucuk olamaz");
        }else {
            for (int i = baslangic; i <= bitis ; i++) {
            toplam += i;
            }
        }
        System.out.println("aralarındaki sayiların toplamı : " + toplam);
    }
}
