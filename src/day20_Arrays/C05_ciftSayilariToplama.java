package day20_Arrays;

public class C05_ciftSayilariToplama {
    public static void main(String[] args) {
        // verilen int bir array'deki
        // cift sayilarin toplamini yazdirin

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int toplam = 0;

        for (int i = 0; i <= arr.length-1; i++) {

            if (i %2 == 0){

                toplam += i;

            }

        }

        ciftleriToplama(arr);
    }
    public static int[] ciftleriToplama (int[] arr){

        int toplam = 0;

        for (int i = 0; i <= arr.length-1; i++) {

            if (i %2 == 0){

                toplam += i;

            }

        }
        System.out.println(toplam);
        return arr ;
    }
}
