package day22_Arrays;

import java.lang.reflect.Array;
import java.util.Locale;

public class C08_SplitOdev {
    public static void main(String[] args) {
        //verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran bir method olusturun.

        String cumle="Nerede o hello world yazdiramayan ogrenciler?";
        String harf="n";
        harfKacKereKullanilmis(cumle,harf);



    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {
        int sayac=0;
        String kacDefa[]=cumle.split("");
        for (int i = 0; i <kacDefa.length ; i++) {
            if (kacDefa[i].equalsIgnoreCase(harf)){
                sayac++;
            }
        }
        System.out.println("aradiginiz harf: " + sayac + "kere kullanilmis");
    }
}
