package interviewQuestions3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_ArrayListTask {
    // Part1:
    // Create an arraylist of Strings
    // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
    // print out all the elements, each element on new line

    // Part2:
    // Create a method that accepts a String arraylist and a String as parameters
    // method should add the element at the first index of arraylist

    // Part3:
    // Create a method that accepts a String arraylist and a String as parameters
    // it should add element before last element
    // ex:  [1, 2, 3]  -> [1, 2, 4, 3]

    public static void main(String[] args) {
        // Part1:
        List<String>renkler=new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow","Black"));
        for (int i = 0; i <renkler.size() ; i++) {
            System.out.println(renkler.get(i));
        }

        // Part2:
        ilkIndexEkle(renkler,"white");
        System.out.println(renkler);
        sonIndextenOnceEkle(renkler,"pink");
        System.out.println(renkler);

    }

    private static void sonIndextenOnceEkle(List<String> renkler, String pink) {
        renkler.add(renkler.size()-1,"pink" );
    }

    private static void ilkIndexEkle(List<String> renkler, String white) {
        renkler.add(0,"white");
    }


    // Part3:
        // Create a method that accepts a String arraylist and a String as parameters
        // it should add element before last element
        // ex:  [1, 2, 3]  -> [1, 2, 4, 3]




    //main Sonu



    }

