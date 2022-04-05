package day14_stringManipulation;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Locale;
import java.util.Scanner;

public class C02_Ornekler {
    public static void main(String[] args) {
        // kullanicidan ismini,soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin.
        // isim-soyisim:M****** B*****
        //kart no:**** **** **** 1234
        Scanner scan=new Scanner(System.in);
        System.out.println("adinizi giriniz.");
        String ad=scan.nextLine().toLowerCase();
        System.out.println("soyadinizi giriniz");
            String soyad=scan.nextLine().toUpperCase();
        System.out.println("kart bilgilerinizi giriniz.");
        String kart=scan.nextLine();


        System.out.println("isim - soyisim :" + ad.substring(0,1).toUpperCase()
                +ad.substring(1).replaceAll("\\S","*")+" " +soyad.substring(0,1).toUpperCase()+
                soyad.substring(1).replaceAll("\\S","*"));
        System.out.println("kart no: " + "**** **** ****" + kart.substring(12));





    }
}
