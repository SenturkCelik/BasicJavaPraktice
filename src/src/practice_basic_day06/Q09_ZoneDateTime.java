package src.practice_basic_day06;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q09_ZoneDateTime {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Newyork un saat dilimine gore saat ?
    public static void main(String[] args) {
// Baska ülke veya bolgelerin saat dilimine gore zamani alma
        // New york un saat dilimine gore saat ?
        // zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

            ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
            //String ifade onemli, hatsiz yazilmasi gerek.. yoksa Unknown time-zone ID hatasi verir
            ZonedDateTime zdtLocal =ZonedDateTime.now(); //yerelde bulundugunuz yerin zamanini verir
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm" ); //istenilen formatta
            System.out.println("zdt = " + zdt.format(format));
            System.out.println("zdtLocal = " + zdtLocal.format(format));

    }
    }

