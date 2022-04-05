package Day05_Matematkslislemler;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class C05_WropperClass {
    public static void main(String[] args) {
        short sayi1=20;
        Short sayi2=30;
        sayi1=sayi2;   //   w   ropper Class ile ayni isimdeki primitive data turu arasinda gecis olabilir.
        System.out.println(sayi1);  //30
        System.out.println(Short.MAX_VALUE);  // short en fazla kac olabilir degerini getirir.
        System.out.println(Short.MIN_VALUE);  // short en az kac olabilir degerini getirir.
        System.out.println(Short.BYTES);       // ne kadar byte yer kapladigini getirir.


    }
}
