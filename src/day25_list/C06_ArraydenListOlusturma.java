package day25_list;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {
        // verilen bir arrayi listeye cevirin.

        String arr[]={"A","B","E"};
        List<String> arraydenList=Arrays.asList(arr);
        System.out.println(arraydenList);
/* arrayden liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
dolayisiyle yeni list ile add(),clear,remove methodlarini kullanamayiz.p yuzden cok tercih edilmez.
 */
    }
}
