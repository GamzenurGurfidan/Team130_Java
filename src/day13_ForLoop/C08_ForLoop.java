package day13_ForLoop;

import java.util.Scanner;

public class C08_ForLoop {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //         Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 20den kucuk pozitif bir sayi giriniz");
        int sayi = scan.nextInt();

        long faktoryel = 1;

        System.out.print(sayi + "!" + " = ");
        for (int i = sayi; i >= 1  ; i--) {

            faktoryel *= i;
            System.out.print( i );
            
            if (i > 1) {
                System.out.print(" * ");
            }

        }
        System.out.println(" = " + faktoryel);

    }
}
