package day22_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
        // verilen array da istenen bir elementin var olup olmadigini true false yazdirarak gosteren method olstr.

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=50;
        istenenElemanVarMi(arr,istenenSayi);
        //eger javadan hazir binarySearch ile yapmak isterseniz once sort metodunu kullanip sonra binarySearch

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, istenenSayi)); // bize istedigimiz elemntin indeksini doner
        // eger olmayan bir elemnti aratirsak; java bulamadigini gostermek icin - isreti koyar sonra da
        // olsaydi, kacinci sirada olacagini yazar.

    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {
        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenenSayi){
                sonuc=true;
                System.out.println(sonuc);
                break;
        }}if (sonuc==false){
            System.out.println(sonuc);
        }

        }



    }

