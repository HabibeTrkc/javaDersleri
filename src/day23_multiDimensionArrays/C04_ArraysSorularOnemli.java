package day23_multiDimensionArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArraysSorularOnemli {
    public static void main(String[] args) {
        // kullanicidan kac elementlik bir array olusturacagini sorun
        // arrayi olusturup elementleri kullanicidan alip array e atayin.

        Scanner scan=new Scanner(System.in);
        System.out.println("kac elemntlik array olusturacaksiniz");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("array icin " + i+1 + " . elemani girin");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
