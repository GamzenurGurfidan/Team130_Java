package day14_ForLoop_NestedForLoop;

import java.util.Scanner;

public class C04_MetniTerseCervirme {
    public static void main(String[] args) {

        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String-i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine(); //Java Candir

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0 ; i--) {

            tersMetin += metin.charAt(i);

        }

        System.out.println(tersMetin);

        // kullanicinin girdigi metnin palindrome olup olmadigni yazdirin

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("girilen metin palindrome");
        }else {
            System.out.println("girilen metin palindrome değildir");
        }

    }
}
