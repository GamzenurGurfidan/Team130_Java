package day7_IfElseStatement;

import java.util.Scanner;

public class C05_BirimCevirme {
    public static void main(String[] args) {
        // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        // istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesefeyi km cinsinden giriniz: ");
        double km = scanner.nextDouble();

        scanner = new Scanner(System.in);
        System.out.println("Çevirmek istediğiniz birimi giriniz: ");
        String birim = scanner.nextLine();

        if (birim.equalsIgnoreCase("metre")){
            System.out.println("girilen mesafenin metre cinsinden değeri: " + km*1000);
        } else if (birim.equalsIgnoreCase("santimetre")) {
            System.out.println("girilen mesafenin santimetre cinsinden değeri: " + km*100000);
        }else {
            System.out.println("Sadece metre ve santimetreye cevirebiliyorum, \nistediğiniz birim sisteme kayitli değildir.");
        }

    }
}
