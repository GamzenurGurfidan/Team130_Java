package day21_Arrays_MultiDimensionalArrays;

import day20_Arrays.C04_ArrayElemanEkletme;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        int [] arr1 = {3,5,6};

        // arr1 = {4,2,6};

        // once istedigimizx arrayi ayri bir array olarak olusturur
        // sonra da bizim arrayimize atama yabilirz

        int[] geciciArr = {4,2,6};

        arr1 = geciciArr;
        System.out.println(Arrays.toString(arr1)); //[4, 2, 6]

        // eger yeni atadimiz array defoult degerlerden oldusan bir array olacaksa
        // new keyword kullanarak direkt atama yapabiliriz

        arr1 = new int[5];

        System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 0, 0]

        // olusturulmul bir arraye uzunlugunu degidtirecek sekilde
        // bir element eklemek veya element silmek mumkun mudur?

        int[] sayilar = {4,2,1};
        // 4. element olarak 3 ekleyin

        // sayilar[3] = 3; // ArrayIndexOutOfBoundsException

        sayilar = C04_ArrayElemanEkletme.arrayElemetEkle(sayilar, 3);

        System.out.println(Arrays.toString(sayilar)); // [4, 2, 1, 3]

        // sayilar arrayine 5. element olarak 9 ekleyin

        sayilar = C04_ArrayElemanEkletme.arrayElemetEkle(sayilar, 9);

        System.out.println(Arrays.toString(sayilar)); // [4, 2, 1, 3, 9]

        // arrayin ilk elementi olan 4u arrayden silin
        // arrayi 4 elementli hale getirin

        // var olan bir arraye uzunlugu degistirecek sekilde yeni element ekleyemeyiz
        // veya element silemeyiz
        // bunun yerine istenen elementlere sahip yeni bir array olusturup
        // sonra yeni arrayi eski arraye deger olarak atayabiliriz

        // once uzunlugu eski arrayden 1 eksik olan yeni bir array olusturalim
        int[] yeniSayilar = new int[sayilar.length-1];

        // eski arraydeki silinecek element disindaki elementleri
        // yeni arraye kopyalayalim

        for (int i = 0; i < yeniSayilar.length; i++) {

            yeniSayilar[i]= sayilar[i+1];

        }

        sayilar = yeniSayilar;

        System.out.println(Arrays.toString(sayilar)); // [2, 1, 3, 9]-



    }
}
