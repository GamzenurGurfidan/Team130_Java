package day14_ForLoop_NestedForLoop;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        /*
            Kullanıcıdan satir ve sutun sayisini alip
            asagidaki sekilde tablo olusturun

             * * * * *
             * * * * *
             * * * * *

       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısını ve sutun sayısını giriniz");
        int satir = scanner.nextInt();
        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun ; j++) {

                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
