package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        Scanner scan=new Scanner(System.in);
        int sayi[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("max kac sayi istediginizi giriniz");
        int kac= scan.nextInt();
        int buyuk=0;

        for (int j = 0; j <kac ; j++) {
        for (int i = 0; i <sayi.length ; i++) {
          if (sayi[i]>buyuk){
              buyuk=sayi[i];
          }
            }
            System.out.println((j+1)+". en buyuk sayi : " + buyuk);
            for (int k = 0; k <sayi.length ; k++) {
                if (sayi[k]==buyuk){
                    sayi[k]=0;
                }
            }buyuk=0;
        }

    }

}








