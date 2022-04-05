package day15_methodCreation;

import java.util.Scanner;

public class C08_MethodCreation {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz.");
        String ad = scan.nextLine().toLowerCase();
        System.out.println("soyadinizi giriniz");
        String soyad = scan.nextLine().toUpperCase();
        System.out.println("kart bilgilerinizi giriniz.");
        String kart = scan.nextLine();
        String gizlenmisisim=isimSoyisimGizle(ad, soyad);
        // bana isim ve soyismin gizlenmis halini getrimesini istiyorum.
        //bekledigin donus String olur.
       String gizlenmisKart= KrediKartiGizle(kart);
        System.out.println(gizlenmisisim);
        System.out.println(gizlenmisKart);

        //eger bir methoddan bir islem yapmasini ve yaptigi islemi bize getirmesini isterseniz;
        //return type degil bize getirecigi sonucun data turunde olmalidir.
    }

    public static String KrediKartiGizle(String kart) {
        String kredikart = "**** **** ****" + kart.substring(12);
        return kredikart;
    }

    public static String isimSoyisimGizle(String ad, String soyad) {
        String isim = ad.substring(0, 1).toUpperCase()
                + ad.substring(1).replaceAll("\\S", "*") + " " + soyad.substring(0, 1).toUpperCase() +
                soyad.substring(1).replaceAll("\\S", "*");
        return isim+" ";
    }
}

