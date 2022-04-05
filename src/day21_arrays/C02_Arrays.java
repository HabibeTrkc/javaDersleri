package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"ali","veli","ayse"}; // bunlarin her biri ayri bir variable gibi dusunulebilir.
        // array icinde ki variablalara ulasabilmek icin index kullaniriz.
        System.out.println(arr1[0]); // ali yazdirir.
        arr1[1]="esila"; // veli yerine esila degistirmek icin
        System.out.println(arr1[1]);

        // arrayin tamamini yazdirmak istersek;
        int arr2[]=new int[4];
        System.out.println(arr2); // arrayler non primitive olduklarindan direk yazdirmak istersek java
        // referans bilgisini yazdirir.
        for (int i = 0; i <4 ; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");

// array i yazdirmak icin javadaki arrays classindan toString() kullanilir.
        System.out.println(Arrays.toString(arr2)); // [0,0,0,0]

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2)); // [0,11,0,22]






    }
}
