package practice_basic_day06;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q09_ZoneDateTime {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma(ZoneDateTime)
    // Newyork un saat dilimine gore saat ?
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/New_York")); // zoneld internet sitesinden bakılarak parantez icine yazılır
        ZonedDateTime zdtLocal=ZonedDateTime.now();

        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm");

        System.out.println("zdt = " + zdt.format(format));
        System.out.println("zdtLocal = " + zdtLocal.format(format));

    }
}
