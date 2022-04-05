package day18_nestedFoorLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhile {
    public static void main(String[] args) {
        /* kullanicidan toplamak istedigi sayilari alin
        ve kullanici 0 a basincaya kadar devam edin.
        kullanici 0 a bastiginda girdigi tum sayilarin toplamini yazin.
         */
         // baslangic, bitis ve degisim durumlari net olan durumlarda for loop daha avantaslidir.
        // ancak adi sayisi belli olmayan durumlarda while loop daha avantajlidir.
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        for (int i = 1; i <=1000 ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayi==0){
                break;
            }else{
                toplam+=sayi;
            }

        }
        System.out.println("sayilarin toplami: " + toplam);

               // while ile yapimi

        sayi=1;
        toplam=0;
        while (sayi!=0){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("sayilarin toplami = " + toplam);










    }}


