package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do {
            System.out.println("toplamak istediginiz sayiyi girin. \n bitirmek icin Q ya basın");
            int sayi = 0;

            try {
                sayi = scan.nextInt();
                toplam += sayi;
            } catch (InputMismatchException e) {
                String hataliGiris = scan.next();
                if (hataliGiris.equalsIgnoreCase("q")) {
                    break;
                } else System.out.println("hatali giris");
            }
        } while (toplam < 500);
    }
}