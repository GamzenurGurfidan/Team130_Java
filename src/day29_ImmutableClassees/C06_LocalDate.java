package day29_ImmutableClassees;

import java.time.LocalDate;

public class C06_LocalDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        LocalDate dogumTarihi = LocalDate.of(1997,10,8);

        System.out.println(date);
        // 2023-11-29

        // plus..() ile tarihten öteye gidebilirim
        System.out.println(date.plusWeeks(23));
        // 2024-05-08

        System.out.println(date.plusWeeks(3).plusYears(2).plusDays(5));
        // 2025-12-25

        // minus..() ile tarihten geriye gidebiliriz

        System.out.println(date.minusYears(5).minusMonths(3).minusDays(8));
        // 2018-08-21

        // tarihin istedigimiz bir bölumunu, istedigimiz deger ile degistirebiliriz
        // with..()

        System.out.println(date.withYear(2021)); // 2021-11-29
        System.out.println(date.withDayOfYear(134)); // 2023-05-14

        System.out.println(date.getDayOfYear()); // 333
        System.out.println(date.getDayOfWeek()); // WEDNESDAY
        System.out.println(date.getEra()); // CE
        System.out.println(date.lengthOfYear()); // 365
        System.out.println(date.isLeapYear()); // false

        LocalDate leapYearKontrol = LocalDate.of(2040,1,1);
        System.out.println(leapYearKontrol.isLeapYear()); // true

        System.out.println(date.isBefore(leapYearKontrol)); // true
        System.out.println(date.isAfter(leapYearKontrol)); // false
        System.out.println(date.isEqual(leapYearKontrol)); // false

        System.out.println(date.compareTo(dogumTarihi)); // 26
        System.out.println(date.compareTo(leapYearKontrol)); // -17

        System.out.println(dogumTarihi.until(date)); // P 26Y 1M 21D

        LocalDate beklenenTarih = LocalDate.of(2025,5,12);
        System.out.println(date.until(beklenenTarih)); // P 1Y 5M 13D


    }
}
