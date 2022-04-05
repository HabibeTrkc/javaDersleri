package practice_basic_day02;


import java.util.Locale;
import java.util.Scanner;

public class Q07_StringManipulation01 {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate (birlestirmek)string1 and string2
        // konsolda yazdiriniz
Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soyadinizi giriniz");
        String isim=scan.nextLine();
        System.out.println(isim.toUpperCase());
        String i1="01234";
        String i2="56789";
        System.out.println(i1.concat(i2));
        System.out.println(i1+""+i2);













    }
}
