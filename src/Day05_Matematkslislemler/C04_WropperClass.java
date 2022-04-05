package Day05_Matematkslislemler;

import java.util.Locale;
import java.util.Objects;

public class C04_WropperClass {
    public static void main(String[] args) {
        // primitive data turu ile non primitive arasinda ki farklar nelerdir?
        // non primitive data turleri data depolamak yaninda bir cok faydali methoda sahiptir.
        //ancak primitive data turlerinin boyle bir ozelligi yoktur.sadece degerleri saklar.
        // primitive data turleri icin de bazi methodlar gecerli oldugunda java ara bir cozum uretmistir.
        //java her bir primitive data turunu,  bir de non primitive olarak kullsnsbilmek icin ozel classlar olusturmus.
        // bunlara wropper class adini vermistir.
        String str="java";
        int sayi=10;
        System.out.println(str.toUpperCase());
        System.out.println(str);

        double sayi2=20.5;  // sayi2 primitive olduğundan sayi2. yaptigimizda hic bir method gelmez.
        Double sayi3=15.2;  // sayi3 wropper class olan Double classini kullandigindan sayi3. yaptigimizda
                            // bir cok method gelir.
        System.out.println(sayi3.equals(20));


    }
}
