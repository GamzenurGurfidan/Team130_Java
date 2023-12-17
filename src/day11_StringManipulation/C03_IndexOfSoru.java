package day11_StringManipulation;

import java.util.Scanner;

public class C03_IndexOfSoru {
    public static void main(String[] args) {
        //Kullanıcıdan bir cümle ve cümlede aranacak metin isteyin
        //cümle ve metni karşılaştırıp
        //asagıdaki 3 durumdan birini yazdırın
        // 1- verilen metin cümlede kullanılmamıs
        // 2- verilen metin cumlede sadece bir kere kullanılmış
        // 3- verilen metin cumlede 1den fazla kere kullanılmış

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümle giriniz");
        String str = scanner.nextLine();

        System.out.println("aramak istediğiniz metini giriniz: ");
        String str2 = scanner.nextLine();


        if (!str.contains(str2)){
            System.out.println("metin cümle de kullanılmamıştır");
        } else if (str.indexOf(str2) == str.lastIndexOf(str2)) {
            System.out.println("Girilen metin 1 kez kullanılmıştır");
        } else {
            System.out.println("verilen metin cümlede birden fazla kullanılmış");
        }


    }
}
