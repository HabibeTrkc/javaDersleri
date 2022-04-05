package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_Lenght {
    public static void main(String[] args) {

        //kullanicidan ismini alip bas harfini ve son harfini buyuk harflerle yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz.");
        String isim=scan.nextLine();
        System.out.println("ilk harf: " + isim.toUpperCase().charAt(0));
        System.out.println("son harf:" + isim.toUpperCase().charAt(isim.length()-1));



    }
}
