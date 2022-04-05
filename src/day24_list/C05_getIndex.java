package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C05_getIndex {
    public static void main(String[] args) {
        // get methodu kacinci indexi yazdirmak istersek onu getirir, degistirmez.istenen indexi bize getirir.
        //variableadi.get();
        List<Integer> sayilarList=new ArrayList<>();
        sayilarList.add(5);  // [5]
        sayilarList.add(3); // [5,3]
        sayilarList.add(0,7); // [7,5,3]
        sayilarList.add(2,7); //[7,5,7,3]

        System.out.println(sayilarList.get(2));  //7 ;2. indexi getirdi.


    }
}
