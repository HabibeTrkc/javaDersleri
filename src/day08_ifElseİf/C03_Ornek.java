package day08_ifElseİf;

import java.util.Scanner;

public class C03_Ornek {
    public static void main(String[] args) {
        // kullanicidan 2 sayi isteyin.sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin.
        // sayilarin ikisi de negatif ise sayilarin carpimini yazdirin.
        // sayilardan iki si de farkli isaretlere sahipse "farkli isarette sayilarda islem yapamazsiniz " yazdir.
        // sayilardan 0 a esit olan varsa "0 carpmaya gore yutan elemandir" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        System.out.println("sayi1:");
        int sayi1=scan.nextInt();
        System.out.println("sayi2:");
        int sayi2=scan.nextInt();

        if (sayi1>0 && sayi2>0){
            System.out.println("sayilarin toplami" + " " + (sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println("sayilarin carpimi:" + (sayi1*sayi2));
        }else if (sayi1<0 && sayi2>0 || sayi1>0 && sayi2<0) {
            System.out.println("farkli isaretlerde sayilarda islem yapamazsiniz");
        }else if (sayi1==0 || sayi2==0){
            System.out.println("0 carpmaya gore yutan elemandir.");
        }else {
            System.out.println("farkli karakterlerde islem yapamazsiniz");
        }


    }
}
