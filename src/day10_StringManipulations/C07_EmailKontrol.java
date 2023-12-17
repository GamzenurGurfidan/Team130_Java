package day10_StringManipulations;

import java.util.Scanner;

public class C07_EmailKontrol {
    public static void main(String[] args) {

        // Kullanıcıdan mail isteyin
        // Eğer @ işareti icermiyorsa "yanlis giriş"
        // Eger @gmail.com icermiyorsa "mail gmail olmalı"
        // mail @gmail.com bitmiyorsa "gecersiz mail"
        // mail bosluk iceriyorsa "yazım hatası"
        // eger hata yoksa "mail katdedildi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("E-mail adresinin");
        String email = scanner.nextLine();


        if (!email.contains("@")){
            System.out.println("yanlıs giris");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("girilen mail, gmail olmalı");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("gecersiz mail");
        } else if (email.contains(" ")) {
            System.out.println("yazım hatası");
        } else {
            System.out.println("mailiniz kaydedildi");
        }


    }
}
