package practice_basic_day04;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[8];
        int sayac=0;
        int bolunebilen=0;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+1 + ". sayiyi giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.println("girdiginiz sayilar :" + Arrays.toString(arr));
        for (int i = 0; i<arr.length ; i++) {
            if (arr[i]%3==0){
                sayac++;
                bolunebilen=arr[i];
                System.out.println("3 e tam bolunebilen sayi: " + bolunebilen);
            }
        }
        System.out.println("toplam bolunebilen sayi : " + sayac);
    }
}
