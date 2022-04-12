package pratikOrnekler;

import java.util.Arrays;

public class C06 {
    public static void main(String[] args) {
        /*
        asagida ki multi dimensional array in ic arraylerinde ki tum elemanlarinin toplamini birer birer
        bulan ve her bir sonucu yeni bir array in elemani yapan ve yeni array i ekrana yazdiran bir program yaziniz
        {{1,2,3},{4,5},{6,7}}
        ornek {{1,2,3},{4,5},{6,7}} ==> 1+2+3=6 4+5=9 6+7=13 ==> output {6,9,13}
         */
/*
        int arr[][]={{1,2,3},{4,5},{6,7}};
        int arryn[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            int toplam=0;
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];
            }
            arryn[i]=toplam;
        }
        System.out.println(Arrays.toString(arryn));*/

        int sayi[][] = {{1, 2, 3}, {4, 5}, {6, 7}};
        int toplam=0;

        for (int i = 0; i < sayi.length; i++) {
            toplam=0;
            for (int j = 0; j < sayi[i].length; j++) {
                toplam+=sayi[i][j];
            }
            System.out.print(toplam + " ");
        }


    }
}
