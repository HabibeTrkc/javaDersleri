package day09_ternary_Switch;

import java.util.Scanner;

public class Ternary_pratk {
    public static void main(String[] args) {
        // 1)kullanicidan 2 sayi alin ve buyuk olmayan sayiyi yazdirin.
        //2) kullanicidan bir tam sayi alin ve sayinin tek veya cift oldugunu yazdirin.
        //3)kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        //4)kullanicidan bir sayi alin sayi pozitifse sayi pozitif yazdirin.negatifse sayinin karesini yazdirin.

        System.out.println("1. soru");
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

       int kucukSayi=(sayi1<sayi2? sayi1 : sayi2);
        System.out.println(kucukSayi);

        System.out.println("soru 2");
        System.out.println("lutfen bir tam sayi giriniz.");
        int tmsy=scan.nextInt();
        String tekCft=(tmsy%2==0 ? "girdiginiz sayi cift sayi" : "girdiginiz sayi tek sayi");
        System.out.println(tekCft);

        System.out.println("3.soru");
        System.out.println("lutfen bir sayi giriniz");
        int mutlak=scan.nextInt();
        int sonuc=(mutlak<0 ? (-1*mutlak) : mutlak);
        System.out.println(sonuc);

        System.out.println("soru 4");
        System.out.println("lutfen bir sayi giriniz.");
        int sy=scan.nextInt();
        System.out.println((sy > 0 ? "sayi pozitif" : sy * sy));


    }
}
