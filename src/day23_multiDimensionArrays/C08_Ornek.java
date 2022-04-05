package day23_multiDimensionArrays;

public class C08_Ornek {
    public static void main(String[] args) {
        //asagida ki multi dimensional arrayin
        // ic arraylerinde ki son elemanlarin carpimini ekrana yazdiran bir program yaziniz.
        // { {1,2,3},{4,5},{6} }

        int arr[][]={{1,2,3},{4,5},{6}};
        int carpim=1;

        for (int i = 0; i <arr.length ; i++) { // outer arrayi kontrol eder
        carpim *=arr[i][arr[i].length-1];
        }
        System.out.println(carpim);
    }
}
