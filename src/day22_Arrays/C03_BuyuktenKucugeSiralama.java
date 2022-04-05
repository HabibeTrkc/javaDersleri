package day22_Arrays;

import java.util.Arrays;

class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        //verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun.

        int arry[]={3,5,6,1,9,45,25,4,9,0};
        terstenSiralaYazdir(arry);
    }

    private static void terstenSiralaYazdir(int[] arry) {
        Arrays.sort(arry);
        int tersArr[]=new int[arry.length];
        for (int i =arry.length-1; i >=0 ; i--) {
            tersArr[i]+=arry[arry.length-1-i];
        }
        System.out.println(Arrays.toString(tersArr));
    }
}
