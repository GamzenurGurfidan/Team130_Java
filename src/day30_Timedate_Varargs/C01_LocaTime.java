package day30_Timedate_Varargs;

import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocaTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();

        LocalTime saatUSA = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York saati: " + saatUSA); // New York saati: 12:47:08.344226

        System.out.println(saat.plusHours(10000)); // 12:48:02.933915900

        System.out.println(saat.minusHours(3)
                                .minusSeconds(23)
                                .minusMinutes(15)); // 17:36:01.683100800

        System.out.println((saat.withMinute(27).withSecond(15))); // 20:27:15.683100800
        System.out.println(saat.withSecond(0).withNano(0)); // 20:52

        System.out.println(saat.toNanoOfDay());
        // gece 00:00 dan baslayarak saatin olusturuldugu ana kadar gecen nanosaniye

        System.out.println(saat.toSecondOfDay()); // 75245

        LocalTime saat1 = LocalTime.of(10,45);
        LocalTime saat2 = LocalTime.of(14,12,23);

        System.out.println(saat1.isBefore(saat2)); // true
        System.out.println(saat1.isAfter(saat2)); // false



    }
}
