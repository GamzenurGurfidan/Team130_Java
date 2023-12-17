package day16_methodOlusturma_methodOverloading;

public class C05_MethodOverloading {
    public static void main(String[] args) {
        //verilen iki sayiyi toplayıp, sonucu yazdiran bir method olusturun

        toplaYazdir(5, 7); // iki int'in toplamı : 12
        toplaYazdir(7.4, 6); //13,4
        toplaYazdir("Ali",5); // Ali5

        // toplaYazdir(5 ,5.3); //  Cannot resolve method 'toplaYazdir(int, double)'

        toplaYazdir('4','a'); // iki int toplamı 149
        // toplaYazdir(char, char) yok ama
        // char ascii sayesinde int'a donusebildigi icin
        // toplaYAzdir(int,int) methodu kullanılabilir

        toplaYazdir(3.5f, 5); // double ve int'in toplami: 8.5
        // float double degildir ama auto widening ile
        // double bir degiskene float deger atayabiliriz

    }

    public static void toplaYazdir(int sayi1, int sayi2) {

        System.out.println("iki int'in toplamı : " + (sayi1 + sayi2));
    }

    // parametre isimlerini değiştirerek aynı methodu iki kere olusturabilir miyim
    //'toplaYazdir(int, int)' is already defined in 'day16_methodOlusturma_methodOverloading.C05_MethodOverloading'
    // Java parametrelerin adina değil data turune bakiyor
    // yukarıdaki method toplayazdir(int , int) varken yenisini olusturamazsınız

    /*
        Java'da method ismi ve parametrelerin data türleri birlikte düşünüldüğünde
        oraya çıkan metne METHOD SIGNATURE denir
        toplayazdir(int , int)

        Java method'lardaki parametre isimlerine degil
        method signature'ina bakar
        ayni methodu signature'ina sahip birden fazla method olusturmanıza IZIN VERMEZ
     */
    public static void toplaYazdir(double a, int b){

        System.out.println("iki int'in toplamı : " + (a+b));
    }
    public static void toplaYazdir(String a, double b){

        System.out.println("iki int'in toplamı : " + (a+b));
    }
}