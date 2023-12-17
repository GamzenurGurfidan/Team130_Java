package day14_ForLoop_NestedForLoop;

import java.util.Scanner;

public class C03_StringiTerstenYazdırın {
    public static void main(String[] args) {

        // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine(); //Java Candir

        for (int i = metin.length()-1 ; i >= 0 ; i--) {

            System.out.print(metin.charAt(i));

        }



    }
}
