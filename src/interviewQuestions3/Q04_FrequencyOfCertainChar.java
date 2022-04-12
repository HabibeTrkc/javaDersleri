package interviewQuestions3;

import java.util.Locale;
import java.util.Scanner;

public class Q04_FrequencyOfCertainChar {
    /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

     */
    public static void main(String[] args) {
   Scanner scan=new Scanner (System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine().toUpperCase();
        System.out.println("bir harf giriniz");
        char harf=scan.next().toUpperCase().charAt(0);
        int sayac=0;

        for (int i = 0; i <isim.length() ; i++) {
            if (isim.charAt(i)==harf){
                sayac++;
            }
        }
        System.out.println("girdiginiz harf " + sayac +" kere tekrar edilmis");

    }

}
