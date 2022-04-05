package practice_basic_day05;

import java.util.Scanner;

public class Instance_Variable {
    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin
     *
     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
     * yazdirsin
     *
     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin
     *
     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
     * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
     * eski soyismi degistirsin.
     *
     * Not :Instance variable'lar object'lere aittir ve diger adi object variable'dir
     */

    public static void main(String[] args) {
        String isim="ali";
        String soyIsim=" soyisim";
        String ogrenciTel="248670";


        System.out.println("isim : " + isim + " soyisim : " + soyIsim + "  ogrencitel : " + ogrenciTel);

        isimDegistir(isim,soyIsim,ogrenciTel);


        // ilk methodu create ederken bu methodu kullandik.soyisim degistir kısmı.
        soyIsim=soyIsimDegistir(soyIsim);
        System.out.println("isim : " + isim + "  yenisoyisim : " + soyIsim + " tel : " + ogrenciTel);


    }

    private static String soyIsimDegistir(String soyIsim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yeni soy isminizi giriniz ");
        String yeniSoyisim=scan.nextLine();
        return yeniSoyisim;
    }

    public static void isimDegistir(String isim, String soyIsim, String ogrenciTel) {
        isim="mehmet";
        soyIsim="can";
        ogrenciTel="124967";

        System.out.println("isim : " + isim + "soyisim : " + soyIsim + "  ogrencitel : " + ogrenciTel);
    }



}
