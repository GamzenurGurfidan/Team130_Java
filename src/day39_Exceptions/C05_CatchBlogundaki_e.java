package day39_Exceptions;

import java.util.Scanner;

public class C05_CatchBlogundaki_e {
    public static void main(String[] args) {
        // kullanıcıdan bir cumle ve bir sayi isteyin
        // kullanıcının verdigi sayiyi index olarak kabul edip
        // cumlede o indexdeki karakteri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz..");
        String cumle = scanner.nextLine();

        System.out.println("lütfen bir sayi giriniz..");
        int index = scanner.nextInt();

        try {
            System.out.println(cumle.charAt(index));

        } catch (StringIndexOutOfBoundsException e) {
            // System.out.println(e); // java.lang.StringIndexOutOfBoundsException: String index out of range: 4

            // System.out.println(e.getCause()); //null

            // System.out.println(e.getMessage()); // String index out of range: 9

            // e.printStackTrace(); // exception olustugunda yazdırılan tum satırları yazdırır
                                 // ama exception kontrol altina alindigi için
                                 // kod NORMAL olarak biter

            System.out.println("Girilen index cumlenin sınırları dışında");
        }


    }
}
