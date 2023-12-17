package day02_DataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz: ");
        int yasiniz = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String isim = scanner.nextLine();

        System.out.println("Lütfen Soyismin-izi giriniz: ");
        String soyisim = scanner.nextLine();

        System.out.println("İsminiz: " + isim );
        System.out.println("Soyisim: " + soyisim);
        System.out.println("Yasınız: " + yasiniz);
        System.out.println("kaydınız başarıyla oluşturulmuştur");

    }
}
