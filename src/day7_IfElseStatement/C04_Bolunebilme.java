package day7_IfElseStatement;

import java.util.Scanner;

public class C04_Bolunebilme {
    public static void main(String[] args) {

        // kullanıcıdan pozitif bir tamsayi alın
        // 3 ile bölünebiliyorsa "3'ün katı"
        // 5 ile bölünebiliyorsa "5'in katı"
        // hem 3 hem de 5 ile bölünebiliyorsa "süper sayi"

        /*
                - Eğer şartlar birbiri ile ilgili ise en önce en secici olani yazmaliyiz
                - Eğer ifade else ile bitmezse if else statement tum değerleri KAPSAMIYOR demektir
                yani bazi değerleri girdiğimizde kod çalışır ama hiç bir sonuc üretmez
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("pozitif bir tamsayi giriniz: ");
        int sayi1 = scanner.nextInt();

        if (sayi1 % 3 == 0 && sayi1 % 5 == 0){
            System.out.println("SÜPER SAYİ!!");
        }else if (sayi1 % 5 == 0) {
            System.out.println("5'in kati");
        }else if (sayi1 % 3 == 0 ){
            System.out.println("3'ün katı");
        }else {
            System.out.println("hiç biri ayoll");
        }


    }
}
