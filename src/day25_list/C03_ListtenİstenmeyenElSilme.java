package day25_list;

import java.util.ArrayList;
import java.util.List;

public class C03_ListtenÄ°stenmeyenElSilme {
    public static void main(String[] args) {
        // verilen bir arrayden istenen elementi silip kalanlari,
        // yeni bir array olarak yazdiran bir method olusturun.

        int arr[] = {3, 4, 2,3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyenEleman = 4;

        istenmeyenElemantiSilveYazdir(arr, istenmeyenEleman);

    }

   public static List<Integer> istenmeyenElemantiSilveYazdir(int[] arr, int istenmeyenEleman) {
       List<Integer>sayi=new ArrayList<>();
       for (int i = 0; i <arr.length ; i++) {
           if (arr[i]!=istenmeyenEleman){
               sayi.add(arr[i]);
           }
       }
       System.out.println(sayi);

return sayi;
    }

}
