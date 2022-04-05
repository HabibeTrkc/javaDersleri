package day18_nestedFoorLoop;

import java.util.Random;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {


   /*
     bilgisayara 1 ile 100 arasinda bir sayi tutturun kullanicidan bu sayiyi tahmin etmesini isteyin
    girilen her tahmin de sayiyi buyut veya kucult diye yol gosterin
    kullanici sayiyi buldugunda kac yolda sayiyi buldugunu yazdirin.
     */
      /*  Random rnd=new Random(); // random bnilgisayarin rastgele atamasi
        int sayi=rnd.nextInt(100); // burasi 100 den kucuk rastgele sayi olusturur.
        System.out.println(sayi);

        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=1;


        while (sayi!=tahmin){
            System.out.println("lutfen bir sayi giriniz");
            tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.println("daha kucuk bir sayi soylemelisiniz");

            }else if (tahmin<sayi){
                System.out.println("daha buyuk bir sayi soylemelisin");

            }
            sayac++;
            }

        System.out.println("tuttugum sayi: " + (sayac-1) +  " kere de bildiniz");*/


        Random rnd = new Random();
        int sayi = rnd.nextInt(100);
        System.out.println(sayi);
        int tahmin = 0;
        int sayac = 0;
        System.out.println("lutfen 100 den kucuk bir sayi tahmin ediniz");
        do {
            Scanner scan = new Scanner(System.in);
            tahmin = scan.nextInt();
            if (tahmin < sayi) {
                System.out.println("tahmininizi buyultun");
            } else if (tahmin > sayi) {
                System.out.println("tahmininizi kucultun.");
            }
            sayac++;
        } while (tahmin!=sayi);
        if (tahmin==sayi){
            System.out.println("tebrikler bildiniz  " + sayac + " kere denediniz");
        }


    }

    }
