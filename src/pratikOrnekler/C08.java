package pratikOrnekler;

import java.util.Arrays;

public class C08 {
    public static void main(String[] args) {
        /*
         verilen bir arrayden istenen degere esit olan elemanlari kaldirip kalanlari yeni bir array olarak yazdiran
        bir method yaziniz.
         */
        int arr[]={1,2,3,4,5,6,7};
        int kaldir[]={3,2};
        int yeniarr[]=new int[kaldir.length];

        System.out.println(Arrays.toString(yeniarrayolustur(arr,kaldir,yeniarr)));

    }

    private static int[] yeniarrayolustur(int[] arr, int[] kaldir,int [] yeniarr) {


        for (int i = 0; i <kaldir.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (kaldir[i]==arr[j]){
                    yeniarr[i]=arr[j];
                    arr[j]=0;
                }

            }
        }
        return yeniarr;


    }
}
