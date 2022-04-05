package practice_basic_day03;

import java.util.Arrays;
import java.util.Scanner;

public class Q13_WhileLoop01 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi=scan.nextInt();
        int basamak=0;
        int rakamlar=0;
        while(sayi>0){
            basamak=sayi%10;
            rakamlar+=basamak;
            sayi=sayi/10;
        }
        System.out.println("girilen sayinin rakamlari toplami : " + rakamlar );

// girilen sayiyi tersten yazdirin
        System.out.println("lutfen bir sayi giriniz: ");
        int sy=scan.nextInt();
        int ters=0;

        System.out.println("girdiginiz sayi:" + sy);
        while(sy>0){
            ters= ters*10 + sy%10;
            sy=sy/10;
        }
        System.out.println("sayinin tersten yazimi : " + ters);

        int arr[]={3,5,7,};
        int arr3[]={1,2,3,4,5};
        arr=arr3;
        System.out.println(Arrays.toString(arr));
    }
}
