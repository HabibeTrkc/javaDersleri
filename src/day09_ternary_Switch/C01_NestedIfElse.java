package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        // kullanicidan 4 basamakli bir sayi girmesini isteyin.
        // girdigi sayi 5 e bolunuyorsa son rakami kontrol edin.  5 e bolunuyorsa;
        // son rakami 0 ise ekrana 5 e bolunen cift sayi yazdirin.
        // son rakami 0 degil ise 5 e bolunen tek sayi yazdirin.5 e bolunmuyorsa;
        // girdigi sayi 5 e bolunmuyorsa ekrana tekrar deneyin yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi<1000 || sayi>9999){
            System.out.println("lutfen 4 basamakli bir sayi giriniz.");
        } else if (sayi%5==0) {
            System.out.println("sayinin son rakami:" + sayi % 10);
            if (sayi % 10 == 0) {
                System.out.println("5 e bolunebilen cift sayi");
            }else {
                System.out.println("5 e bolunen tek sayi");
            }

            } else {
                System.out.println("tekrar deneyin.");
            }

        }
    }

