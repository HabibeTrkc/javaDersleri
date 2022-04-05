package practice_basic_day03;

import java.util.Scanner;

public class Q01_MethodCreation01 {

    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yapacaginiz dort islemi + - / * olarak seciniz.");
        char islem=scan.next().charAt(0);
        System.out.println("lutfen iki sayi giriniz");
        double sayi= scan.nextDouble();
        double sayi2= scan.nextDouble();
        hesapMakinesi(islem,sayi,sayi2);



    }

    private static void hesapMakinesi(char islem, double sayi, double sayi2) {

        switch(islem){
            case '+':
                System.out.println("iki sayinin toplami: " + (sayi+sayi2));
                break;
            case '-' :
                System.out.println("iki sayinin farki : " + (sayi-sayi2));
                break;
            case '*':
                System.out.println("iki sayinin carpimi : " + (sayi*sayi2));
                break;
            case '/':
                System.out.println("iki sayinin bolumu : " + (sayi/sayi2));
                break;
            default:
                System.out.println("hatali islem sectiniz");
                break;
        }



    }

}