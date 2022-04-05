package day23_multiDimensionArrays;

import java.util.Scanner;

public class C07_Ornek {
    public static void main(String[] args) {
        // kullanicidan bir cumle isteyin.cumledeki kelime sayisini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine();
        String arr[]=cumle.split(" ");
        System.out.println("girdiginiz cumlede ki kelime sayisi: " + arr.length);
    }
}
