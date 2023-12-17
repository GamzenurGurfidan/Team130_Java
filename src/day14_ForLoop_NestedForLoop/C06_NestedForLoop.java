package day14_ForLoop_NestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        //  1 2 3 4 yazdır

        for (int i = 1; i <= 4 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println( "");

        // loop ile 2 4 6 8 yazdır

        for (int i = 1; i <= 4 ; i++) {
            System.out.print(2*i + " ");
        }
        System.out.println("");

        // 3 6 9 12

        for (int i = 1; i <= 4 ; i++) {
            System.out.print(3* i + " ");
        }
        System.out.println("");
        System.out.println("-------------------------");
        /* forr loopla
        1 2 3 4
        2 4 6 8
        3 6 9 12

        eger yazdirmamiz istenen sekil dikdortgen biciminde ise
        ic ice 2 loop olustururuz
        dısardaki loop satirlari kontrol eder (bu soruda 3 satir var)
        icerdeki loop ise her satirdaki sutunlari kontrol eder
        (bu soruda her satirda 4 sutun var)

        */

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 4 ; j++) {

                System.out.print(i * j  +"  ");

            }
            System.out.println("");
        }



    }
}
