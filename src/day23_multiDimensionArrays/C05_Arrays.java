package day23_multiDimensionArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // verilen bir array e yeni bir elemnt ekleyen bir method olusturn.

        int arr[]={3,5,7};
        arr=new int[4];  //  [0,0,0,0]
        System.out.println(Arrays.toString(arr));
        int arrYeni[]=new int[5];
        arr=arrYeni;  // [0,0,0,0,0]
        System.out.println(Arrays.toString(arr));

        arrYeni[0]=2;
        arrYeni[3]=5;
        System.out.println(Arrays.toString(arr)); // [2,0,0,0,5,0]


        //bir arraye icinde hazir elemntlerin oldugu yeni bir array atamak isterseniz
        // bunu {1,2,3} seklinde degil; new int[3] diyerek olusturup sonra deger atayarak tamamladigimiz
        //  assign ederek tamamlayabiliriz.

        int arrEnyeni[]={1,2,3,4,5};
        arr=arrEnyeni;
        System.out.println(Arrays.toString(arr)); //[1,2,3,4,5]







    }
}
