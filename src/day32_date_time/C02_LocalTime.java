package day32_date_time;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();  // suan ki saati bulmak ta kullanılır.
        System.out.println(tm);

        //bir islemin ne kadar sure de yapıldıgını ogrenmek ıcın kullanabiliriz.
        // islemden once ve bir sonrasında birer loop olusturarak ogrenebiliriz
        // nano saniye 1 saniye altini verir. double nano2=tmLoopSonrasi.getNano();

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;
        }
        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi);

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println(" islem " + (nano2-nano1) + " nanosaniye de bitti");



    }
}
