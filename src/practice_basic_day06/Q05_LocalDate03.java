package practice_basic_day06;

import java.time.LocalDate;
import java.time.Month;

public class Q05_LocalDate03 {
    public static void main(String[] args) {

        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        LocalDate date = LocalDate.of(2018,Month.FEBRUARY, 29);
        // artık yıl olup olmadıgını yılın %4 unu alarak anlayabiliriz.eger modulus %4 0 verirse artık yıldır.
        // soruda ki tarih artık yıl olmadıgı icin 29 gun cekmez.

        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

            /*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown.
            */
        System.out.println(LocalDate.now().isLeapYear()); // suan ki zamanın artık yıl olup olmadıgını true ya da false
        // olarak dondurur

    }
}
