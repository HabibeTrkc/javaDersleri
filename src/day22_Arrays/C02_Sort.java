package day22_Arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        // verilem bir arrayda en kucuk ve en buyuk degerleri yazdirin.

        int arr[]={3,5,6,1,9,45,25,4,9};
        Arrays.sort(arr);
        int enKucuk=arr[0];
        int enBuyuk=arr[arr.length-1];
        System.out.println("en kucuk sayi: " + enKucuk);
        System.out.println("en buyuk sayi: " + enBuyuk);
    }
}
