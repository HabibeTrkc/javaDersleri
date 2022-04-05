package practice_basic_day02;

import java.util.Scanner;

public class Q08_StringManipulation02 {

		 //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("iki isim giriniz");
        String isim= scan.next();
        String isim2=scan.next();
        System.out.println(isim.concat(isim2));
        System.out.println(isim.substring(1,isim.length())+ isim2.substring(1,isim2.length()));


    }
}
