package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        System.out.println("sayi = " + sayi);
        int tekolanlar=0;
        for (int i = 0; i <=sayi ; i++) {
            if (i%2!=0){
                tekolanlar=i;
                System.out.print(i + " ");
            }
        }


    }


}
