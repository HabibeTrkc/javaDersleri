package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Scanner kullanmak icin 3 adim takip ediyoruz.
        //1.adim kendimize bir Scanner olusturmak.(Scanner scan=new.Scanner(System.in))
        //2. adim kullanicidan istedigimiz degeri girmesi icin aciklayaci bir metin yazin.
        //3.adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adinzizi giriniz:");
        String kullaniciismi=scan.nextLine();
        System.out.println("kullanicinin girdigi isim:" + kullaniciismi);
    }
}
