package day23_multiDimensionArrays;

import java.util.Arrays;

public class C02_MdArrays {
    public static void main(String[] args) {
        // verilen multi dimensional array in tum elementlerinin toplamini bulunuz.

        int arr[][]={{3,1,7},{6,10,2}};
        int toplam=0;
        int arr0[]=arr[0];
        int arr1[]=arr[1];
        System.out.println(Arrays.toString(arr0));
        for (int i = 0; i <arr0.length; i++) {
            toplam+=arr0[i];
        }
        for (int i = 0; i <arr1.length ; i++) {
            toplam+=arr1[i];
        }
        System.out.println(toplam);

        //2. yol i,le yapimi
        int ekle=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                ekle+=arr[i][j];
            }
        }
        System.out.println(ekle);





    }
}
