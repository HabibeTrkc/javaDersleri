package day22_Arrays;

import java.util.Arrays;

public class C04_TerstenSiralayiKaydetme {
    public static void main(String[] args) {
        //verilen bir arry i buyukten kucuge siralayip bize donduren method yazdirin.
        int arry[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        arry = terstenSirala(arry);
        System.out.println("en buyyuk element: " + arry[0]);

    }

    private static int[] terstenSirala(int[] arry) {

        Arrays.sort(arry);
        int tersArr[] = new int[arry.length];
        for (int i = arry.length - 1; i >= 0; i--) {
            tersArr[i] += arry[arry.length - 1 - i];
        }
        System.out.println(Arrays.toString(tersArr));

return tersArr;
    }


}
