package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("Ilker");
        isimler.add("oguzhan");
        System.out.println(isimler);

isimler.set(1,"Seckin"); // yusuf gitti yerine seckin geldi
        System.out.println(isimler);

        // daha onceden listede var olanlari da arsiv gibi tutmak istiyorsak ;
        //
List<String>logListesi=new ArrayList<>();
logListesi.add(isimler.set(2,"cosmos")); // ilkeri loglisetsine atip ilker yerine de cosmos yazdi.
        System.out.println(isimler);


    }
}
