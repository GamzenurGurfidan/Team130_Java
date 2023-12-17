package day30_Timedate_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // 2023-11-30T21:00:48.883229600

        /*
            LocalDateTime objesi hem tarihi hem de zamanı bize getirir
            ANCAK tarih ve zamanı bizim istedigimiz formatta yazdırmaz
            EGER tarih ve/veya zamani istediginiz bir formatta  yazdirmak isterseniz
            DateTimeFormatter callasindan yardim almalisiniz

            03-12-2023
            3- Aralık-2023
            5 - Mar - 23
            17 / 03 / 23

            format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini

         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar

         */

        DateTimeFormatter istedigimFormat1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(tarihSaat.format(istedigimFormat1)); // 30-11-2023

        // 15 Mart 23 Pazartesi 05 : 12 PM

        DateTimeFormatter istedigimFarmat2 = DateTimeFormatter.ofPattern("dd MMMM yy EEEE hh : mm a");
        System.out.println(tarihSaat.format(istedigimFarmat2)); // 30 Kasım 23 Perşembe 09 : 38 ÖS

        // 11/30/2023 1:35

        DateTimeFormatter istedigimFormat3 = DateTimeFormatter.ofPattern("MM/dd/YYYY hh:mm a");
        System.out.println(tarihSaat.format(istedigimFormat3)); // 11/30/2023 09:40 ÖS

    }
}
