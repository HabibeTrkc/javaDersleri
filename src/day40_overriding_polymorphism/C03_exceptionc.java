package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_exceptionc {
    public static void main(String[] args) {
        // kullanicidan 2 sayi alarak bolerek sonucu yazdıran kod yazın

        Scanner scan=new Scanner(System.in);
        System.out.println("bolmek istediginiz sayiyi yazın");
        int sayi=scan.nextInt();
        System.out.println("kaca bolmek istediginiz giriniz");
        int sayi2=scan.nextInt();
        System.out.println("sonuc : " + (sayi/sayi2));
        // sayi2 0 oldugunda sayi1/sayi2 tanımsız olcagından java bu durumla karsılasınca exception verir.


    }
}
