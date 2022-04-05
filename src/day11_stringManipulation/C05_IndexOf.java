package day11_stringManipulation;

import day10_switch_StringManipulation.Switch_ornekler;
import javafx.scene.transform.Scale;

import java.util.Locale;
import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {
        String str1="java bir baska guzel valla cok guzel";
        // istersek char olarak verdigimiz bir harfin bize index ini dondurur.
        System.out.println(str1.indexOf("j")); // kacinci index de oldugunu yazdirir. //0

        // istersek bir harf ya da metin olarak verdigimiz stringin index ini dondurur.
        System.out.println(str1.indexOf("l")); //19
        System.out.println(str1.length()-1);  //35
        System.out.println(str1.indexOf("aska")); //10

        // ayni harften birden fazla var ise;
        System.out.println(str1.indexOf("b")); //5

        System.out.println(str1.indexOf("b", 5));// b yi bul ama 5 ve 5 den sonra ki b yi bul

        // verilen string de ki 2.a harfini bul.
        int ilkIndex=str1.indexOf("a"); // ilk a nin index ini verir. //1
        System.out.println(str1.indexOf("a",ilkIndex+1)); // 1. den sonra ki ilk a yi bul

        //20.indexten sonra guzel aratalim.
        System.out.println(str1.indexOf("guzel",20));

        // string de olmayan bir harf aratsak
        System.out.println(str1.indexOf("y"));  //-1

        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin.
        //iceriyorsa mailiniz kabul edildi yazin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mail adresini giriniz.");
        String mail=scan.nextLine();

        if (mail.indexOf("@")==(-1)){
            System.out.println("gecersiz mail adresi");
        }else
            System.out.println("mailiniz kabul edildi.");

        // kullanicidan bir cumle ve bir harf isteyin, harfin cumle de var olup olmadigini yazdirin.
        System.out.println("lutfen bir cumle yaziniz.");
        scan.nextLine();
        String cumle=scan.nextLine();
        System.out.println("lutfen bir harf girin");
        String harf=scan.next();

        if (cumle.indexOf(harf)==(-1)) System.out.println("harf cumle de yok");
        else {
            System.out.println("harf cumle de var");
        }












    }
}
