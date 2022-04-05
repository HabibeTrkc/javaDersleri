package day25_list;

import java.util.ArrayList;
import java.util.List;

public class C05_ListTekrarsizYap {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece bir tane yapan method olusturun.

        // orn : [1,3,5,3,5,6,1,7]
        // [1,3,5,6,7] bu hale donussun
        List<Integer> sayi=new ArrayList<>();
        sayi.add(1);
        sayi.add(3);
        sayi.add(5);
        sayi.add(3);
        sayi.add(5);
        sayi.add(6);
        sayi.add(1);
        sayi.add(7);
        sayi=tekrarsizListeOlustur(sayi);
        System.out.println(sayi);// listenin orjinali degisti orjinalini degistirmek istiyorsan atama yapilmali.

    }

    private static List<Integer> tekrarsizListeOlustur(List<Integer> sayi) {
        List<Integer>yeniSayi=new ArrayList<>();
        for (int i = 0; i <sayi.size() ; i++) {
            if (!yeniSayi.contains(sayi.get(i))){
                yeniSayi.add(sayi.get(i));
            }
        }
        System.out.println(yeniSayi);
return yeniSayi;
    }
    }


