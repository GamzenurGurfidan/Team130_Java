package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_MethodlaSifreKontrolu {
    public static void main(String[] args) {

            // Kullanicidan sifre isteyi
            // sifreyi bir method'da kontrol edin
            // method'da asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
            // method'dan sifrenin durumunu true veya false olarak dondurun
            // main method'da kullanici
            // gecerli bir sifre yazincaya kadar bu islemi tekrar edin
            // gecerli sifre yazilinca "sifreniz basari ile kaydedildi" yazdirin
            // sartlar :
            // - ilk harf kucuk harf olmali
            // - son karakter rakam olmali
            // - sifre bosluk icermemeli
            // - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        int flag = 7;
        String sifre = "";

        while (flag > 0) {
            System.out.println("lütfen sifre gir ");
            sifre = scanner.nextLine();

            boolean sonuc = sifreKontrol(sifre); //true veya false

            if (sonuc){
                System.out.println("sifreniz basarili kaydedildi");
                break;
            }
        }



    }

    public static boolean sifreKontrol (String sifre){

        int flag = 0;
        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')){

            System.out.println("ilk harf küçük olmali");
            flag++;
        }

        // -son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (!(sonKarakter >= '0' && sonKarakter<= '9')){

            System.out.println("son karakter rakam olmali");
            flag++;
        }
        if (sifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
            flag++;
        }

        // -uzunlugu en az 10 karakter olmali
        if (sifre.length() < 10){
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;
        }
        if (flag == 0){
            return true;
        }else {
            return false;
        }

    }


}
