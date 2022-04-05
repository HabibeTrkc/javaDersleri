package day08_ifElseİf;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        // kullanicidan 100 uzerinden not isteyin.Notu harf sistemine cevirip yazidrin.
        // 50 den kucukse "D" , 50-60 arasi "C", 60-80 arasi "B" 80 uzrinde ise "A"

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz:");
        double not=scan.nextDouble();

        if (not>0 && not<50){
            System.out.println("harfiniz:D");
        }else if (not>=50 && not<=60){
            System.out.println("harfiniz:C");
        }else if (not>60 && not<=80){
            System.out.println("harfiniz:B");
        }else if(not>80 && not<=100){
            System.out.println("harfiniz:A");
        }else
            System.out.println("gecerli not girmediniz");
    }
}
