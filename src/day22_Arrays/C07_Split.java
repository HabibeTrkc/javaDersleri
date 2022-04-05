package day22_Arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {
        String str="java gun gectikce guzellesiyor.";
        str.split(" "); // nereden bolmek istiyorsak yazariz.Space den bu stringi böl.
        // spaceleri kaldirir yerine virgul koyar.virgul koyunca arraya donusur.
        // bu string 4 elemntli bir arraya donusur.

        String kelimeler[]=str.split(" ");
        System.out.println(kelimeler.length);
        System.out.println(Arrays.toString(kelimeler)); //[java,gun,gectikce,guzellesiyor.]
        System.out.println(kelimeler[1]);

        String gectikce[]=str.split("gectikce"); // gectikceyi bulucak onu yok edip
        //onun yerine virgul koyup array yapicak.
        System.out.println(Arrays.toString(gectikce));
        String harfler[]=str.split("");//hiclik koyarsak butun harfleri ayirir.
        // kelimeleri terse cevirmede kullanilabilr
        System.out.println(Arrays.toString(harfler));



    }
}
