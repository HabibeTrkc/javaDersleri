package day14_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C03_soruOrnek {
    public static void main(String[] args) {
        // kullanicidan bir sifre girmesini isteyin
        //asagida ki sartlari sagliyorsa "sifre basarili tanimlandi" yazdirin.
        //sartlar saglanmazsa "isim basarisiz, lutfen yeni bir sifre girin" yazdirin
        // - ilk harf buyuk olmali
        // - son harf kucuk harf olmali
        // -sifre bosluk icermemeli
        // -sifre uzunlugu en az 8 karakter olmali

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz.");
        String sifre=scan.nextLine();
        boolean ilkharf=false;
        boolean sonharf=false;
        boolean bosluk=false;
        boolean uzunluk=false;

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            ilkharf=true;
        }else
            System.out.println("ilk harf buyuk olmali");

        if (sifre.length()-1>='a' && sifre.length()-1<='z' ){
            sonharf=true;
        }else
            System.out.println("son harf kucuk olmali");


        if (!sifre.contains(" ")){
            bosluk=true;
        }else
            System.out.println("sifre bosluk icermemeli");

        if (sifre.length()>=8){
            uzunluk=true;
        }else{
            System.out.println("sifre bosluk icermemeli");}

        if (ilkharf && sonharf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi.");
        }
    }
}
