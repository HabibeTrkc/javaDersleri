package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" adinizi giriniz.");
        String isim=scan.nextLine();
        System.out.println("isim = " + isim);
        System.out.println(" soyadinizi giriniz.");
        String soyisim= scan.nextLine();
        System.out.println("soyisim = " + soyisim);
        if (isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden daha uzun");
        }else if (soyisim.length()>isim.length()){
            System.out.println("soyisminiz isminizden uzun");
        }else{
            System.out.println("uzunluklari esit");
        }


    }

}
