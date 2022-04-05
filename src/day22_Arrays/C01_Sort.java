package day22_Arrays;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        //array da verilen data tipini kucukten buyuge siralamak icin Arrays.sort(variableadi);yazariz
        // daha sonrasinda sout icerisinde yazdirdigimizda kucukten buyuge siralayarak yazdirir.
        String arr[]={"S","M","A","T"};
        System.out.println(Arrays.toString(arr)); //[S,M,A,T]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[A,M,S,T]







    }
}
