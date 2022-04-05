package practice_basic_day06;

import java.time.LocalDate;
import java.util.Scanner;

public class Q08_LocalDate06 {

    // Bugunun tarihi aliniz, yazdiriniz...
    // Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
    // Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..

    public static void main(String[] args) {
        LocalDate bugun= LocalDate.now(); // bugunun tarihini alır.
        System.out.println("bugun = " + bugun);
        
        LocalDate degisenTarih= bugun.plusDays(1).plusMonths(1).plusYears(1);
        System.out.println("degisenTarih = " + degisenTarih);
        
        LocalDate eksikTarih= degisenTarih.minusDays(3).minusMonths(2).minusYears(5);
        System.out.println("eksikTarih = " + eksikTarih);

    }
}
