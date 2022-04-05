package practice_basic_day06;

import java.util.Arrays;

public class Q02_ForEach02 {
    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop
    public static void main(String[] args) {

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String each:list) {
            System.out.print(each + ": ");
            System.out.print(each.length()+" ");

        }
        System.out.println();
        for (String element:list) {
            if (element.startsWith("v")){
                break;
            }else System.out.println(element);
        }
    }
}
