package day13_ForLoop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C07_ForLoopFaktoryel {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         input = 5 output = 120 (5*4*3*2*1)

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 20den kucuk pozitif bir sayi giriniz");
        int sayi = scan.nextInt();

        long faktoryel = 1;

        for (int i = 1; i <= sayi  ; i++) {

            faktoryel *= i;
        }
        System.out.println(faktoryel);

    }
}
