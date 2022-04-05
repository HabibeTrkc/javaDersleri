package practice_basic_day03;

import java.util.Locale;
import java.util.Scanner;

public class Q12_MetCreationForLoop {

		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
    // method ureterek ve for loop kullanarak bir method uretiniz.verilen stringi de tersine cevir.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin = scan.nextLine().toUpperCase();

        tersineCevirme(metin);


    }

    private static void tersineCevirme(String metin) {
        String ters = "";
        for (int i = metin.length()-1; i >= 0; i--) {
            ters += metin.substring(i, i + 1);
        }
        System.out.println("girdiginiz metinin tersten yazilisi : " + ters);


    }

}



