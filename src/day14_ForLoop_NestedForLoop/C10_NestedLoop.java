package day14_ForLoop_NestedForLoop;

import java.util.Scanner;

public class C10_NestedLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan  satir sayisini alip
        asagidaki sekli cizdirin

            *
            * *
            * * *
            * * * *
            * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


        for (int i = 1; i <=5 ; i++) {

            for (int j = (5-i); j > 1 ; j--) {

                System.out.print(i + j);
            }
            System.out.println( );
        }

    }
}
