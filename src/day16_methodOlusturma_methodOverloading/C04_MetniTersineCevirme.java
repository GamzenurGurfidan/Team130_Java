package day16_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C04_MetniTersineCevirme {

    public static void main(String[] args) {

        // verilen bir metni tersine cevirip
        // bize donduren bir method olusturun

        System.out.println(metniTerseCevir("Java ile kod yaz"));

        // Madam kelimesinin palindrome olup olmadıgını yazdirin

        if ("Madam".equalsIgnoreCase(metniTerseCevir("Madam"))){
            System.out.println("madam palindrome");
        }

        //kullanıcıdan bir kelime iste
        //palindrome olup olmadıgını yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String str = scanner.nextLine();

        if (str.equalsIgnoreCase(metniTerseCevir(str))){
            System.out.println("metin palindrome");
        } else {
            System.out.println("metin palindrome değil");
        }

    }

    public static String metniTerseCevir (String metin ){

        String tersMetin = "";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.substring(i, i+1);

        }
        return tersMetin;
    }

}
