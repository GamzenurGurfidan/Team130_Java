package day19_Array;

import java.util.Arrays;

public class C01_ArrayOlusturma {
    public static void main(String[] args) {

        int arr1 = 20;

        arr1 = 30;

        int[] arr2 = {3, 4, 5}; //data turu: int , uzunluk: 3

        // arrayde herhangi bir elemana ulaşmak veya deger atamak istersek
        // index kullanılır

        System.out.println(arr2[2]); //5
        System.out.println(arr2[1]); //4

        // arr2nin icindeki 4u 8 yap

        arr2[1] = 8;

        // bu array 3 elemanli olarak olusturuldu
        // 4. eleman olarak 3. indexe atama yapmak istersek
        // java syntax olarak islem dogru oldugundan altini cizmez

        // arr2[3] = 20; //.ArrayIndexOutOfBoundsException

        // arraydeki tum elementleri yazdirin

        System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);

        int[] arr3 = {2,3,4,3,4,5,7,4,23,2,4,5,7,4,3,2,1};

        // arr3un tum elementlerini yazdirin

        for (int i = 0; i < arr3.length ; i++) {

            System.out.print(arr3[i] + " "); //2 3 4 3 4 5 7 4 23 2 4 5 7 4 3 2 1
        }
        System.out.println("");
        // arr3 arrayini yazdirin

        System.out.println("tum array " + arr3); // [I@5b6f7412

        // array non primitive bir java objesidir
        // non primitivelerin bazilari direkt olarak yazdirilabilir
        // ancak arrayler direkt YAZDIRILAMAZ
        // eger arrayin tamamını yazdırmak istersek
        // Javadaki arrays classından yardım almamız gerekir

        System.out.println(Arrays.toString(arr3)); // [2, 3, 4, 3, 4, 5, 7, 4, 23, 2, 4, 5, 7, 4, 3, 2, 1]
        // Arrays.toString(istenenArr) ==> java tum elementleri araların ", " olacak sekilde
        // köseli bir parantez icinde yazdırır

        int[] arr4 = new int[5];

        // içine 5 tane int alabilen bir array olusturur.
        // bu durumda deger atnmadıgı için
        // Java biz deger atayıncaya kadar elementlere default deger tanımlar

        System.out.println(Arrays.toString(arr4)); // [0, 0, 0, 0, 0]

        arr4[0] = 6;
        arr4[3] = 9;
        arr4[1] = 2;

        System.out.println(Arrays.toString(arr4)); // [6, 2, 0, 9, 0]


    }
}
