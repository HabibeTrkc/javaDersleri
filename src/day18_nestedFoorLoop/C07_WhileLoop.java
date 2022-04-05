package day18_nestedFoorLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
     /* kullanicidan kac sayi toplamak istedigini alin.
     bu sayilari alin ve bu sayilarin toplamini yazdirin.
      */
        int sayiAdedi=5;
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen sayi adedi: " + sayiAdedi+" " + "girilen sayilarin toplami :" + toplam);


                               //while ile yapimi

        sayi=0;
        toplam=0;
        int sayac=1;

        while (sayac<=sayiAdedi){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("girilen sayi adedi: " + sayiAdedi + " " + "sayilarin toplami : " + toplam);




    }}
