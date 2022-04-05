package day08_ifElseİf;

import java.util.Scanner;

public class C01_İfElseStatemnts {
    public static void main(String[] args) {
        // girilen bir karakterin harf olup olmadigini bulalim.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz:");
        char karakter=scan.next().charAt(0);

        if ((karakter>='a' && karakter<='z')  || (karakter>='A' && karakter<='Z')) {
            System.out.println("girdiginiz karakter bir harf");
        }else System.out.println("girdiginiz karakter harf degil");

    }
}
