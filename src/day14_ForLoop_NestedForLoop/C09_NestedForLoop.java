package day14_ForLoop_NestedForLoop;

import java.util.Scanner;

public class C09_NestedForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan  satir sayisini alip
        asagidaki sekli cizdirin

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) {

            for (int j = 1; j <=i ; j++) { // sutun da satira bagli

                System.out.print(j + " ");

            }
            System.out.println("");
        }

    }
}
