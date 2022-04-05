package day07_ifelsestatement;

import java.util.Locale;
import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {
        //  kullanicidan gun ismini alin ve haftaici veya haftasonu oldugunuz yazdirin.
        //  eger kullanici gun ismini yanlis girerse yanlis giris yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun giriniz");
        String gun=scan.nextLine().toLowerCase();

        if (gun.equals("pazar") || gun.equals("cumartesi")) {
            System.out.println("gunlerden haftasonu");
        }else if(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") ||
                gun.equals("persembe") || gun.equals("cuma")){
            System.out.println("gunlerden haftaici");
        } else {
            System.out.println("yanlis giris yaptiniz");
        }
        /* java ilk buldugu true a ait sonucu yazdirir.kalan sartlara bakmaz. */
    }
}
