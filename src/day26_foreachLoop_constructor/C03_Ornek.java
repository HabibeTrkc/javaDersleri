package day26_foreachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_Ornek {
    public static void main(String[] args) {
        /*
        iki string array olusturnuz
        ve bu arraylerde ki ortak elemanlari for earch kullanarak bulunuz
        snucu ekrana yazdirin
        ortak eleman yoksa ekrana ortak eleman yok yazdirin
         */
    String array1[]={"ali","ayse","can","ali","fatma"};
    String array2[]={"can","evren","emsal","fatma","emre"};
    List<String> ortakElemanlar=new ArrayList<>();
    for(String earch:array1){
        for (String earch2:array2){
            if (earch.contains(earch2))
                ortakElemanlar.add(earch);
        }
    }
    if (ortakElemanlar.isEmpty()){
        System.out.println("ortak eleman yok");
    }else System.out.println("ortak elemanlar" + ortakElemanlar);



    }

}
