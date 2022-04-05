package day23_multiDimensionArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]); //7
        System.out.println(arr[1][1]); //10

        // ilk inner arrayin tum elementlerini yazdir;
        System.out.println(Arrays.toString(arr[0])); // 3 1 7

        System.out.println(Arrays.toString(arr)); // referans no yazar
        // mdarray da tum elementelri bir array olarak yazdirmak istersek;
        Arrays.deepToString(arr);






    }
}
