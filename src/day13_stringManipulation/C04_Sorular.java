package day13_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_Sorular {
    public static void main(String[] args) {
        // soru 1 ) String methodlarini kullanarak "java ogrenmek123  Cok guzel@" Stringini
        //"java ogrenmek cok guzel" sekline getirin.
        // soru2)string seklinde verilen asagi da ki fiyatlarin toplamini bulun.
        // str1="$13.99"       str2="$10.55"   Double.parseDouble() methodunu kullanabilirsiniz.
        //soru3) kullanicidan isim isteyin.Eger
        // -isim a harfi iceriyorsa "girdiginiz isim a harfi iceriyor"
        // -isim "z" harfi iceriyorsa "girdiginiz isim Z harfi iceriyor"
        // - ikisi de yoksa "girdiginiz isim a veya z harfi icermiyor." yazdirin.
        // soru4) kullanicidan isim ve soyisim isteyin. hangisinin daha uzun oldugunu yazdirin.
        // soru5) kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.


        System.out.println("soru 1:");

        String str="Java ogrenmek123 Cok guzel@";
       str=str.replaceAll("\\d","");
        str=str.replaceFirst("@","");
        str=str.replace("C","c");
        System.out.println(str);

        System.out.println("soru 2");
        String str1="13.99";
        String str2="10.55";
        double str3=Double.parseDouble(str1);
        double str4=Double.parseDouble(str2);
        System.out.println("$" + (str3+str4));

        System.out.println("soru 3");
        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen isim giriniz");
        String isim=scan.nextLine().toLowerCase();


        if (isim.contains("a")){
            System.out.println("girdiginiz isim a harfi iceriyor.");
        }else if (isim.contains("z")){
            System.out.println("girdiginiz isim z harfi iceriyor.");
        }else System.out.println("girdiginiz isim a veya z harfi icermiyor.");

        System.out.println("soru 4");

        System.out.println("lutfen isminizi giriniz");
        String ad=scan.nextLine();
        System.out.println("lutfen soyad giriniz");
        String soyad=scan.nextLine();
        int aduzunluk=ad.length();
        int soyaduzunluk=soyad.length();

        if (aduzunluk>soyaduzunluk){
            System.out.println("adiniz daha uzun");
        }else
            System.out.println("soyadiniz daha uzun");



        System.out.println("soru 5");

        System.out.println("lutfen 4 harfli bir kelime giriniz.");
        String kelime =scan.nextLine().toLowerCase();
        char ilkh=kelime.charAt(3);
        char ikinci=kelime.charAt(2);
        char ucuncu=kelime.charAt(1);
        char dorduncu=kelime.charAt(0);
        System.out.println(ilkh+""+ikinci+""+ucuncu+""+dorduncu);

        //2.yol
        String klm="mavi";
        System.out.println(klm.substring(3)+klm.substring(2,3)+klm.substring(1,2)+klm.substring(0,1).toUpperCase());






    }
}
