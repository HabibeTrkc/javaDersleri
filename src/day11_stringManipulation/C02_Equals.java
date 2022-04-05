package day11_stringManipulation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;

public class C02_Equals {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2="Ali"+" Can";
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);

        String str3=str1+"";
        System.out.println(str3);
        System.out.println(str3.equals(str2));
        System.out.println(str3==str2); // string de == equals her zaman dogru sonuc vermez  //false
        // bunun icin emin oldugumuz equals methodunu kullanmayi tercih ederiz.

        String str5="hasan";
        String str6="HASAN";
        System.out.println(str5.equals(str6));  // false
        System.out.println(str5.toUpperCase().equals(str6)); // true




    }
}
