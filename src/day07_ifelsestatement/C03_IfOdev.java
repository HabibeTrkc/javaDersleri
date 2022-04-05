package day07_ifelsestatement;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class C03_IfOdev {
    public static void main(String[] args) {
        /*
         soru1) kullanicidan bir tam sayi isteyin.ve sayinin tek cift oldugunu yazdirin.
         2) kullanicidan gun ismini alin ve haftaici veya haftasonu oldugunuz yazdirin.
         3) kullanicidan gun isimlerinde birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin.
         4 )kullanicidan dikdortgen kenar uzunluklarini isteyin. ve dikdortgenin kare olup olup olmadigini yazdir.
        5) kullanicidan bir gun alin eger gun cuma ise ekrana muslumanlar icin kutsal gun yazdirin.
         cumartesi ise ekrana yahudiler icin kutsal gun, pazar ise hiristiyanlar icin kutsal gun yazdirin.
        */

        // soru1:
        System.out.println("1. soru");
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz:");
        int sayi = scan.nextInt();
        if (sayi%2!=0) System.out.println("girdiginiz sayi tek sayi");
        if (sayi % 2 == 0) System.out.println("girdiginiz sayi cift");

        // 2) kullanicidan gun ismini alin ve haftaici veya haftasonu oldugunuz yazdirin.
        // String case sensitivedir.yani pazar,PAZAR,Pazar,PazaR bunlar farkli kelimelerdir.
        // Bu durumda String methodlarindan yardim aliriz.

        System.out.println("2.soru");
        System.out.println("lutfen bir gun giriniz:");
        String gun=scan.next().toLowerCase(); // kullanici ne sekilde  yazarsa yazsin kucuk harfe cevirir.

        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") ||gun.equals("persembe") ||
                gun.equals("cuma")) {
            System.out.println("gunlerden haftaici");
        }
         else if (gun.equals("pazar") || gun.equals("cumartesi")) {
            System.out.println("gunlerden haftasonu");
        }else System.out.println("gun girmediniz");
        // 3) kullanicidan gun isimlerinde birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin.

        System.out.println("3.soru");
        System.out.println("lutfen bir gunun ilk harfini giriniz.");
        String ilkharf=scan.next().toLowerCase();

        if (ilkharf.equals("p")) {
            System.out.println("girdiginiz harfle baslayan gunler;pazar,pazartesi,persembe");
        } else if(ilkharf.equals("s")) {
            System.out.println("girdiginiz harfle baslayan gunler;sali");
        }
         else if(ilkharf.equals("c")) System.out.println("girdiginiz harfle baslayan gunler;cuma,cumartesi");
        else if (ilkharf.equals("ç")) {
            System.out.println("girdiginiz harfle baslayan gun çarsamba");
        } else {
            System.out.println("girdiginiz harfle baslayan gun bulunamadi");
        }

        // 2.yol char ile cozumu;

        System.out.println("3.soru 2.yol");

        System.out.println("lutfen gun isminin ilk harfini giriniz:");

        char harf = scan.next().charAt(0);



         if (harf=='p'){
             System.out.println("girdiginiz harfle baslayan gunler;pazar,pazartesi,persembe");
         } else if (harf=='s'){
             System.out.println("girdiginiz harfle baslayan gunler;sali");
         }else if (harf=='ç'){
             System.out.println("girdiginiz harfle baslayan gunler;çarsamba");
         }else if (harf=='c')
             System.out.println("girdiginiz harfle baslayan gunler;cuma,cumartesi");
        else System.out.println("girdiginiz harfle baslayan gun bulunamadi.");




        // 4:kullanicidan dikdortgen kenar uzunluklarini isteyin ve dikdortgenin kare olup olup olmadigini yazdir.
        System.out.println("4.soru");
        System.out.println("dikdorgenin bir kenar uzunlugunu giriniz:");
        int kenar1=scan.nextInt();
        System.out.println("diger kenar uzunlugunu giriniz:");
        int kenar2=scan.nextInt();

        if (kenar1==kenar2) {
            System.out.println("giridiginiz uzunluklar bir kareye ait.");
        }else System.out.println("girdiginiz uzunluklar bir dikdortgene ait");

        // 5) kullanicidan bir gun alin eger gun cuma ise ekrana muslumanlar icin kutsal gun yazdirin.
        // cumartesi ise ekrana yahudiler icin kutsal gun, pazar ise hristiyanlar icin kutsal gun yazdirin.
        System.out.println("5.soru");
        System.out.println("lutfen kutsal bir gun yaziniz");
        scan.nextLine();
        String gn=scan.nextLine().toLowerCase();


        if (gn.equals("cuma")) {
            System.out.println("muslumanlar icin kutsal gun");
        }else if (gn.equals("cumartesi")){
            System.out.println("yahudiler icin kutsal gun");
        }else if (gn.equals("pazar")){
            System.out.println("hristiyanlar icin kutsal gun");
        }else {
            System.out.println(" kutsal gun girmediniz");
        }

    }
}
