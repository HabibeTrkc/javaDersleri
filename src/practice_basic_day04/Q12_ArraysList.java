package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan=new Scanner (System.in);
        System.out.println("olusturmak istediginiz listin uzunlugunu giriniz");
        int listuzunlugu=scan.nextInt();

        List<Integer>list=new ArrayList<>();
        System.out.println("girdiginiz list uzunlugu kadar eleman ekleyiniz");
        for (int i = 0; i <listuzunlugu ; i++) {
            list.add(scan.nextInt());





        }

    }
}
