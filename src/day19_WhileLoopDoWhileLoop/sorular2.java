package day19_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class sorular2 {
    public static void main(String[] args) {
        /*1) 9 den 190 a kadar 7 nin kati olan tum msayilari ekrana yazdirin.

        2) m harfinden baslayarak 'c' harfine kadar tum harfleri yazdirin.

        3)kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0 a basmasini soyleyin.
        kullanici 0 a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin
        toplaminin kac oldugunu yazdirin.

        4) kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0 a basmasini soyleyin.
        kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve "negative sayi girmezsin"
        deyip basa donun.
        kullanici 0 bastiginda toplam kac pozitif sayi girdigini, yanlisllikla kac negative sayi girdigin
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

         5) kullanicidan bir sifre girmesini isteyin.Girilen sifreyi asagidaki sartlara gore kontrol edin ve
          sifredi ki hatalari yazdirin.

          kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
          "sifreniz kabul edilmistir " yazin.

          -sifre kucuk harf icermeli
          -sifre buyuk harf icermeli
          -sifre ozel karakter icermeli
          -sifre en az 8 karakter olmali

          6)kullanicidan toplamak icin sayi isteyin ve toplam 500 e ulasincaya kadar istemeyi devam ettirin.
          Toplam 500 e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin.
         */


        System.out.println("soru 4");
        Scanner scan=new Scanner(System.in);


     int toplam=0;
       int sy;
       int sayacPoztf=0;
       int sayacNegatf=0;


       do {
           System.out.println("pozitif tam sayi girin\nbitirmek icin 0 a basin");
            sy=scan.nextInt();
            if (sy<0){
                System.out.println("negative sayi giremezsiniz");
                sayacNegatf++;
            }else if (sy>0){
                toplam+=sy;
                sayacPoztf++;

            }

       } while (sy!=0);
        System.out.println("girilen sayilarin toplami: " + toplam);
        System.out.println(sayacNegatf + " kere negatif sayi girdiniz.");
        System.out.println(sayacPoztf + " kere pozitif sayi girdiniz.");





















    }

}
