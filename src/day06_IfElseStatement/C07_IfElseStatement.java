package day06_IfElseStatement;

import java.util.Scanner;

public class C07_IfElseStatement {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını giriniz");
        int birinci = scanner.nextInt();
        int ikinci = scanner.nextInt();
        int ucuncu = scanner.nextInt();

        if (birinci == ikinci && birinci == ucuncu && birinci > 0) {
            System.out.println("Eşkenar ücgen");
        }else {
            System.out.println("Eşkenar değildir");
        }
    }
}
