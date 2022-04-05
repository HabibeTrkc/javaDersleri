package day25_list;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarliElementSilme {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece bir kere yazdiran bir method olusturun.

        // orn : [1,3,5,3,5,6,1,7]
        //output: [1,3,5,6,7]

        List<Integer>sayi=new ArrayList<>();
        sayi.add(1);
        sayi.add(3);
        sayi.add(5);
        sayi.add(3);
        sayi.add(5);
        sayi.add(6);
        sayi.add(1);
        sayi.add(7);
        tekrarsizListeOlustur(sayi);
    }
    public static void tekrarsizListeOlustur(List<Integer> sayi) {
    List<Integer>yeniSayi=new ArrayList<>();
        for (int i = 0; i <sayi.size() ; i++) {
            if (!yeniSayi.contains(sayi.get(i))){
                yeniSayi.add(sayi.get(i));
            }
        }
        System.out.println(yeniSayi);

    }
}
