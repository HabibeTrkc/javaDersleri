package day23_multiDimensionArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        // verilen bir array e yeni bir elemnt ekleyen bir method olusturn.


        int arr[]={3,5,7};
        int eklenecekElement=4;
      arr=  arayElemanEkle(arr,eklenecekElement);
        System.out.println(Arrays.toString(arr));

    }

  public static int[] arayElemanEkle(int[] arr, int eklenecekElement) {
        int yeniArray[]=new int[arr.length+1];
      for (int i = 0; i <arr.length ; i++) {
          yeniArray[i]=arr[i];
      }
      yeniArray[yeniArray.length-1]=eklenecekElement;




return yeniArray;
    }

}

