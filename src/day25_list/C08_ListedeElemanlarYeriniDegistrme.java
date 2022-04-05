package day25_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_ListedeElemanlarYeriniDegistrme {
    public static void main(String[] args) {
        /*
        verilen bir listede istenen 2 indexte ki  elemntlerin yerini kalici olarak degistirne bir method olusturn.
         */

        List<Integer> sayi = new ArrayList<>();
        sayi.add(0);
        sayi.add(1);
        sayi.add(2);
        sayi.add(8);
        sayi.add(6);
        sayi.add(5);
        sayi.add(3);
        int ilkIndex = 3;
        int ikinciIndex =5;
        System.out.println("swapten once list: " + sayi);
        sayi = swapElement(sayi, ilkIndex, ikinciIndex);
        System.out.println("swapten sonra list: " + sayi);

    }

    private static List<Integer> swapElement(List<Integer> sayi, int ilkIndex, int ikinciIndex) {
        // bir tem sayi olusturp verilen sayilari yer degistirin
        // indexleri kontrol edip sinirin otesinde index verildiyse uyari mesaji verin.
        int tem = 0;
        if((ilkIndex>sayi.size()-1)|| (ikinciIndex> sayi.size()-1)){
            System.out.println("sinirin ötesinde index verildi.");
        }else{
        tem=sayi.get(ilkIndex);
        sayi.set(ilkIndex,sayi.get(ikinciIndex));
        sayi.set(ikinciIndex,tem);
        System.out.println(sayi);}
        return sayi;
    }

}
