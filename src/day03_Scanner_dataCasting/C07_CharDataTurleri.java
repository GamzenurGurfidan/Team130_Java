package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C07_CharDataTurleri {
    public static void main(String[] args) {

        // char özel bir data türüdür
        // '4' , 'h' , içine tek bir karakter alır
        // char data türündeki variablelar ve değerler matematiksel işlemlerde kullanılırsa
        //bu durumda ascii tabledaki decimal karşılıklarıyla işleme girerler

        System.out.println('a' + 'b'); // 195

        System.out.println('0' + '1'); // 97

        int sayi = 'c';
        System.out.println(sayi); // 99

        char chr = 101;
        System.out.println(chr); //e

        // kullanıcıdan bir karakter isteyin kullanıcının girdiği karakterden sonraki 3 karakteri yazdırın
        // örn input: l outout: m, n, o

        /*
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen bir karakter giriniz: ");
            char girilenchr = scanner.next().charAt(0);

            System.out.println("Girilen karakter: " + girilenchr );
            System.out.println("Girilenden 1 sonraki "  + (char)(girilenchr + 1));
            System.out.println("Girilenden 2 sonraki " + (char)(girilenchr + 2));
            System.out.println("Girilenden 3 sonraki " + (char)(girilenchr + 3));
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Bir karakter giriniz: ");
        char girilenChar = scanner.next().charAt(0);

        System.out.println("Girdiğin karakter: ");
        System.out.println("Girdikten 1 sonraki: " + (char)(girilenChar + 1));
        System.out.println("Girdikten 2 sonraki: " + (char)(girilenChar + 2));
        System.out.println("Girdikten 3 sonraki: " + (char)(girilenChar + 3));
        System.out.println("Girdikten 4 sonraki: " + (char)(girilenChar + 4));

    }
}
