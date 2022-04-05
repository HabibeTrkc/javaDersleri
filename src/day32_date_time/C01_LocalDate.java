package day32_date_time;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh=LocalDate.now(); // objenin olusturuldugu tarihi trh ye atar
        LocalDate baskaTrh=LocalDate.of(1972,1,18);
        // istedigimiz yıl ay ve gun degerlerine gore bize obje olusturur.

        System.out.println(trh.getDayOfMonth());   // haftanın kacıncı gunu oldugunu yazdirir.
        System.out.println(trh.getDayOfWeek());   // haftanın gununu yazdırır
        System.out.println(trh.getMonthValue()); // kacıncı ay oldugunu yazdırır.
        System.out.println(trh.getYear());      // yılı verir

        // bir tarihten ıstedigimiz kadar ileri ya da geri gidebiliriz

        System.out.println(trh.minusWeeks(20));  // hafta sonra ki gunu veriri
        System.out.println(trh.minusWeeks(5).minusDays(3));  // 5 hafta once 3 gun once

        System.out.println(trh.plusMonths(9).plusDays(10)); // 9 ay 10 gun sonrasını verir


        // tarih dile gore degismez
        // istedgimiz ulkenin o an ki tarihini elde etmek istersek.LocalDate kullanılır.
        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);
        // is ile baslayan methodlar. boolean sonuclar dondurur.
        System.out.println(LocalDate.now().isLeapYear()); //artık yıl olup olup olmadıgını doner.(29 subatlar leapyear)
        System.out.println(trh.isAfter(baskaTrh)); // tarihin sonra olup olmadıgını doner



    }
}
