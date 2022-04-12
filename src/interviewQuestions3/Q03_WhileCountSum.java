package interviewQuestions3;

import java.util.Scanner;

public class Q03_WhileCountSum {
    //  Kullanicidan toplanmak uzere sayilar isteyin
    // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
    // bu kadar sayi yeter
    // ".. adet sayi girdin, toplami..." yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
       int sayi=0;
       int toplam=0;
       int adet=0;
       while(adet<10 && toplam<500){
           sayi=scan.nextInt();
           toplam+=sayi;
           adet++;
       }
       if (adet<10 && toplam<500){
           System.out.println(adet  + " sayi girdiniz sayilarin toplami : " + toplam);
       }else
           System.out.println("bu kadar sayi yeterli " + adet + " sayi girdiniz sayilarin toplami : " + toplam );
    }

}
