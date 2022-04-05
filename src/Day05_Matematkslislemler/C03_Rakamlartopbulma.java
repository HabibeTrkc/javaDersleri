package Day05_Matematkslislemler;

import java.util.Scanner;

public class C03_Rakamlartopbulma {
    public static void main(String[] args) {
        // kullanicidan aldiginiz 4 basamakli bir sayinin basamaklar toplamini bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz:");
        int sayi=scan.nextInt();
        int rakam;
        int rakamlartop;

        rakam=sayi%10;   //birler
        rakamlartop =rakam;

        sayi/=10;
        rakam=sayi%10;    //onlar
        rakamlartop +=rakam;

        sayi/=10;
        rakam=sayi%10;     // yuzler
        rakamlartop +=rakam;

        sayi/=10;
        rakam=sayi%10;     // binler
        rakamlartop +=rakam;
        System.out.println("rakamlar toplami:" + rakamlartop);






    }
}
