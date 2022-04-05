package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q10_Arrays {
    public static void main(String[] args) {
     /*
      *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      */
        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle giriniz : ");
        String cumle=scan.nextLine();

        cumle=cumle.replaceAll(" ","");
        System.out.println(cumle);
        cumle.split("");
        String arr[]=new String[cumle.length()];

        int sayac=0;
        for (int i = 0; i < arr.length ; i++) {
            sayac++;
        }
        System.out.println("girdiginiz cumlede ki karakter sayisi : " + sayac);



    }
}
