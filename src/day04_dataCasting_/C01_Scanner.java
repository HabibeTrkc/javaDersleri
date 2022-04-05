package day04_dataCasting_;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //7:kullanicidan ismini alip isminin bas harfini yazdiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz:");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi:" + ilkHarf);

    }
}
