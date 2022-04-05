package pratikOrnekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C09 {
    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> sayilar = new ArrayList<>();
        System.out.println("istediginiz max degeri giriniz");
        int max = scan.nextInt();
        int maxSayi = 0;
        int index = 0;

        for (int i = 1; i <= max; i++) {
            maxSayi = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > maxSayi) {
                    maxSayi = arr[j];
                    index = j;
                }
            }
            arr[index] = 0;
            System.out.println("max sayilar: " + maxSayi);
        }
    }
}
