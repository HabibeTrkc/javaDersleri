package day25_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        /*
        bir listede ortalamanin ustunde olan elemnt sayisini bulunuz.
         */
        List<Double>sayi= new ArrayList<>();
        sayi.add(1.0);
        sayi.add(3.0);
        sayi.add(5.0);
        sayi.add(3.0);
        sayi.add(5.0);
        sayi.add(6.0);
        sayi.add(1.0);
        sayi.add(7.0);
        // ortalamayi bul
        Double ortlama=0.0;
        Double toplam=0.0;
        //ortalamanin ustunde olanlari bir liste at
        for (int i = 0; i < sayi.size() ; i++) {
            toplam+=sayi.get(i);
        }
        ortlama=toplam/ sayi.size();
        System.out.println(ortlama);
        List<Double>ortlmaUstu=new ArrayList<>();
        for (int i = 0; i <sayi.size() ; i++) {
            if (sayi.get(i)>ortlama){
                ortlmaUstu.add(sayi.get(i));
            }
        }
        System.out.println(ortlmaUstu);
    }
}
