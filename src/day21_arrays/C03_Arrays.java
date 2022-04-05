package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[]; // deger atamasi yapmadik ama java kabul etti.yazdirmaya calistgimzda hata verir.
        //kullanmamiza izin vermez.o yuzden bu tur kullanmamak gerekiyor.uzunlugu belirtilmeli
        // veya atama yapilmali.

        arr = new int[6]; // bu sekilde atama yapilir.
        System.out.println(Arrays.toString(arr)); // [0,0,0,0,0,0]
        System.out.println(arr.length); //6

        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;

        }
        System.out.println(Arrays.toString(arr)); // [0,1,2,3,4,5] // array icin de ki tum elemanlari yazdirir.
// asagida ki arrayi kucukten buyuge doggru siralayarak yazdiralim.
        int MyArray[] = {9, 15, 11};
        Arrays.sort(MyArray);
        System.out.println(Arrays.toString(MyArray));

        // 3 elamanli bir arrayin tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
        // orn: array[1,2,3] ise [2,3,1] olacak.
        int arry[] = {1, 2, 3};
        int ilkdeger = arry[0];
        for (int i = 0; i < arry.length - 1; i++) {
            arry[i] = arry[i + 1];
        }
        arry[arry.length - 1] = ilkdeger;
        System.out.println(Arrays.toString(arry));


        // verilen array in tum elemanlarini toplayan program yaziniz.
        int arr2[] = {12, 10, 22};
        int toplam = 0;
        for (int i = 0; i <= arr2.length - 1; i++){
                toplam +=arr2[i];
        }
        System.out.println("girilen arraylerin toplami : "+toplam);
    }
}