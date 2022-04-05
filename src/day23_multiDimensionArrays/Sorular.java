package day23_multiDimensionArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {
        /* 1:) asagida ki multi dimesional array in tum elemanlarinin carpimini ekrana yazdiran bir method yazin
        { {1,2,3},{4,5,6}}

        2) asagida ki multi dimensional array in ic araylerinde ki son elemanlarinin carpimini ekrana yazdiran
        bir program yazin.{{1,2,3},{4,5},{6}}

        3)asagida ki multi dimensional arraylerin ic arraylerinde ki ayni indexe sahip elemanlarinin toplamini
        ekrana yazdiran bir program yazin.(zor soru) arr1={{1,2},{3,4,5},{6}} ve
        arr2={{7,8,9},{10,11},{12}}

        4)asagida ki multi dimensional array in ic arraylerinde ki tum elemanlarinin toplamini birer birer
        bulan ve her bir sonucu yeni bir array in elemani yapan ve yeni array i ekrana yazdiran bir program yaziniz
        {{1,2,3},{4,5},{6,7}}
        ornek {{1,2,3},{4,5},{6,7}} ==> 1+2+3=6 4+5=9 6+7=13 ==> output {6,9,13}

         */

        System.out.println("soru 1");
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        int carpim = 1;
        ElemanCarpim(arr, carpim);
        System.out.println(ElemanCarpim(arr, carpim));

        System.out.println("soru 2");
        int arr1[][] = {{1, 2, 3}, {4, 5}, {6}};
        int carp = 1;
        for (int i = 0; i < arr1.length; i++) {
            carp *= arr1[i][arr1[i].length - 1];
        }
        System.out.println(carp);


        System.out.println("soru 3");
        int arr2[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr3[][] = {{7, 8, 9}, {10, 11}, {12}};
        int toplam = 0;
        int arr2length = arr2.length;
        int arr3length = arr3.length;
        int kisa = 0;
        if (arr2length < arr3length) {
            kisa = arr2length;
        } else {
            kisa = arr3length;
        }
        int kisa2 = 0;
        for (int i = 0; i < kisa; i++) {
            if (arr2[i].length < arr3[i].length) {
                kisa2 = arr2[i].length;
            } else {
                kisa2 = arr3[i].length;
            }
            for (int j = 0; j < kisa2; j++) {
                toplam += arr2[i][j] + arr3[i][j];

            }
        }
        System.out.println(toplam);


        System.out.println("soru 4 ");
        /*
        asagida ki multi dimensional array in ic arraylerinde ki tum elemanlarinin toplamini birer birer
        bulan ve her bir sonucu yeni bir array in elemani yapan ve yeni array i ekrana yazdiran bir program yaziniz
        {{1,2,3},{4,5},{6,7}}
        ornek {{1,2,3},{4,5},{6,7}} ==> 1+2+3=6 4+5=9 6+7=13 ==> output {6,9,13}
         */

        int arr4[][] = {{1, 2, 3}, {4, 5}, {6, 7}};
        int arryn[] = new int[arr4.length];
        for (int i = 0; i < arr4.length; i++) {
            int tp = 0;
            for (int j = 0; j < arr4[i].length; j++) {
                tp += arr4[i][j];
            }
            arryn[i] = tp;
        }
        System.out.println(Arrays.toString(arryn));


        System.out.println("soru 5");
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        scan.nextLine();
        String cumle= scan.nextLine();
        cumle.split(" ");
        String kelime[]=cumle.split(" ");
        System.out.println(Arrays.toString(kelime));






    }


    private static int ElemanCarpim(int[][] arr, int carpim) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 2; j++) {
                carpim *= arr[i][j];
            }
        }

        return carpim;
    }
}

