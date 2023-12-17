package day14_ForLoop_NestedForLoop;

import java.util.Scanner;

public class C01_RakamlarToplami {
    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("pozitif tam sayi giriniz");
        int sayi = scanner.nextInt();

        int basSayisi = (sayi + "").length();
        int birlerBas = 0;
        int rakamlarTop = 0;
        int girilenSayi = sayi;

        for (int i = 0; i < basSayisi; i++) {
            birlerBas = girilenSayi % 10;
            rakamlarTop += birlerBas;
            girilenSayi /= 10;
        }

        System.out.println("girilen: " + sayi + ", sayının toplamı: " + rakamlarTop);

    }
}
