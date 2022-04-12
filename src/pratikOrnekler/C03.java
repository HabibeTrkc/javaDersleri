package pratikOrnekler;

import java.util.ArrayList;

public class C03 {
    public static void main(String[] args) {
        //asagida ki multi dimensional arraylerin ic arraylerinde ki ayni indexe sahip elemanlarinin toplamini
        // ekrana yazdiran bir program yazin.(zor soru) arr1={{1,2},{3,4,5},{6}} ve
        //      arr2={{7,8,9},{10,11},{12}}

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int uzunluk1 = 0;
        int uzunluk2 = 0;
        if (arr1.length < arr2.length) {
            uzunluk1 = arr1.length;
        } else
            uzunluk1 = arr2.length;

        ArrayList<Integer> toplam = new ArrayList<>();

        for (int i = 0; i < uzunluk1; i++) {
            if (arr1[i].length < arr2[i].length) {
                uzunluk2 = arr1[i].length;
            } else {
                uzunluk2 = arr2[i].length;
            }
            for (int j = 0; j < uzunluk2; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }


}
