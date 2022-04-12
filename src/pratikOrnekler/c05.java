package pratikOrnekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c05 {
    public static void main(String[] args) {
        //Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        //
        //Input :
        //
        //String str=“Javaisalsoeasy”
        //
        //Output: a s

        String str="Javaisalsoeasy";
        String harf=" ";


        for (int i = 1; i <str.length() ; i++) {
            if (!harf.contains(str.substring(i-1,i))){
                harf+=str.substring(i-1,i);
            }else {
                System.out.print(str.substring(i - 1, i));
            }
        }
    }
}
