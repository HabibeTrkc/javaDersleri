package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08_Arrays {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String arr[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};

        double arrCarpm[][] = new double[arr.length][arr.length];
        double toplamDolar=0;
        double toplamEuro=0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                   arr[i][j]= arr[i][j].replace("$", "");
                 toplamDolar+=(Double.parseDouble(arr[i][j])* (3.2));

                } else if (arr[i][j].contains("€")) {
                   arr[i][j]= arr[i][j].replaceAll("\\D", "");
                 toplamEuro+=(Double.parseDouble(arr[i][j]) * (4.2));
                }
            }
        }
        System.out.println("dolar toplam: " + toplamDolar + "\n" + "euro toplam : " + toplamEuro);

    }
}
