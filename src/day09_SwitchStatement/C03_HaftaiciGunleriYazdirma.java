package day09_SwitchStatement;

import java.util.Scanner;

public class C03_HaftaiciGunleriYazdirma {
    public static void main(String[] args) {

        // Kullanıcıdan gün ismini isteyin
        // girilen günün hafta ici ya da hafta sonu oludğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gün ismini giriniz: ");
        String günIsmi = scanner.next().toLowerCase();

        switch (günIsmi){

            case "pazartesi" :

            case "salı" :

            case "carşamba" :

            case "persembe" :

            case "cuma" :
                System.out.println("haftaici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("gun ismi yanlis");
        }

    }
}
