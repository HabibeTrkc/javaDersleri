package day11_stringManipulation;

import java.util.Locale;

public class C01_TolowerCase_ToweruppCase {
    public static void main(String[] args) {
        String str="Java Guzeldir.";
        // string methodlarini arka arkaya kullanabiliriz.
        // mesela 2.kelimenin ilk harfini kucuk olarak yazdiralim.
        //str.charAt(5);  boyle yazdigimizda sonuc artik string degil char olacaktir.dolayisiyla
        // stringde  yapmak istedigimiz tum degisiklikleri once yapip sonra charat methodunu kullanmaliyiz.
        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        System.out.println(str.toUpperCase(Locale.JAPAN));



    }
}
