package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {
        // kullanicidan isim soyisim bi,lgisini alip butun harfleri yildiz yapin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminiz ve soyisminizi giriniz.");
        String isimsoyisim=scan.nextLine();

        System.out.println(isimsoyisim);
        System.out.println(isimsoyisim.replaceAll("\\S", "*"));
    }
}
