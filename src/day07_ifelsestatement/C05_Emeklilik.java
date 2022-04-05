package day07_ifelsestatement;

import java.util.Scanner;

public class C05_Emeklilik {
    public static void main(String[] args) {
        // kullanicidan yasini isteyin.65 veya daha buyukse emekli olabilirsin.65 den kucukse emekli olamazsin yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz:");
        int yas=scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsiniz");
        }else {
            System.out.println("emekli olamazsiniz.");
            System.out.println((65 - yas) + "sene daha calismalisin");
        }
    // if else statement lerde iki durumdan sadece biri calisir.ikisinin birden calisma ihtimali yok.
        // ikisinin de birden calismama ihtimali de yok.
    }
}
