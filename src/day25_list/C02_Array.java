package day25_list;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        // verilen bir arrayden istenen elementi silip kalanlari,
        // yeni bir array olarak yazdiran bir method olusturun.

        int arr[] = {3, 4, 2,3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyenEleman = 4;

        istenmeyenElemantiSil(arr, istenmeyenEleman);



    }


    public static void istenmeyenElemantiSil(int[] arr, int istenmeyenEleman) {
        int tur = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == istenmeyenEleman) {
                tur++;
            }
        }
            int index=0;
            int arrYeni[] = new int[arr.length - tur];
            for (int j = 0; j <arr.length ; j++) {
                if (arr[j]!=istenmeyenEleman){
                    arrYeni[index]=arr[j];
                    index++;
                }
            }
        System.out.println(Arrays.toString(arrYeni));
    }
}