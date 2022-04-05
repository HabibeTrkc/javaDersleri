package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {


        List<String>isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("Ilker");
        isimler.add("oguzhan");
        System.out.println(isimler);
        isimler.remove("oguzhan"); //ture
        System.out.println(isimler);

        boolean sonuc=isimler.remove("oguzhan");
        if (sonuc==true){
            System.out.println("istedginiz isim silindi");
        }else{
            System.out.println("isteediginiz isim listede olmadigi icin silinemedi");
        }
        System.out.println(isimler);
        System.out.println(isimler.remove(1)); // 1. indexteki isimi kaldirir.
        // ve yazdirdigimizda kimi sildigini yazdirir.
        // yazdirsak da 1. indexi siler yazdirmasak da 1. indexi siler.









    }
}
