package practice_basic_day06;

import java.util.Scanner;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)
    static double carpma = 1;
    static double sonuc = 1.0;
    static double sayi=1;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while(sayi!=0){
            System.out.println("double sayi giriniz\nisleminiz bittiginde 0 a basın");
            sayi=scan.nextDouble();
            sayiCarp(sayi);
        }
        System.out.println("giridiginiz sayilarin carpimi : " + sonuc);
    }

    public static double sayiCarp(double... sayi) {

        for (double each : sayi) {
            if (each != 0.0) {
                sonuc *= each;
            }
        }
        return sonuc;
    }
}

