package day20_Arrays;

import java.util.Arrays;

public class C06_sort {
    public static void main(String[] args) {

        String[] isimler = {"Seher", "Selim","Songul","Saido","Ali","sedat"};

        System.out.println(Arrays.toString(isimler)); // [Seher, Selim, Songul, Saido, Ali, sedat]
        
        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler)); // [Ali, Saido, Seher, Selim, Songul, sedat]

        // Natural Order / Dogal Siralama

        // verilen int bir array'deki
        // en kucuk ve en buyuk sayilari yazdirin

        int[] arr = {5,9,1,0,-3,2,5,9,1};

        Arrays.sort(arr); // kucukten buyuge siralar

        System.out.println("en kucuk sayi: " + arr[0]); //-3
        System.out.println("en buyuk sayi: " + arr[arr.length -1]); // 9


    }
}
