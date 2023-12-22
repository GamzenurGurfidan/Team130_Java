package day07_IfElseStatement;

import java.util.Scanner;

public class C06_VucütKitleEndeksi {
    public static void main(String[] args) {

        // oru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonu: ");
        double kilo = scanner.nextDouble();

        System.out.println("Boyunu: ");
        double boy = scanner.nextDouble();

        double vke = (kilo * 10000 / (boy * boy));

        System.out.println("vücut kitle endeksiniz: " + vke);

        if (vke < 10 || vke > 50) {
            System.out.println("değerler sakat");
        } else if (vke >= 30) {
            System.out.println("obez");
        } else if ( vke >= 25) {
            System.out.println("kilolu");
        } else if ( vke >= 20) {
            System.out.println("normal");
        } else {
            System.out.println("zayıf");
        }

/*
        if (vke > 50 || vke < 10) {
            System.out.println("değerler yanlıştır");
        } else if (vke >= 30) {
            System.out.println("OBEZ");
        } else if (vke >= 25 ) {
            System.out.println("kilolu");
        } else if (vke >= 20 ){
            System.out.println("normal");
        }else {
            System.out.println("zayıfsınız");
        }

 */

    }
}
