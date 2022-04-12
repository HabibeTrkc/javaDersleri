package interviewQuestions3;

import java.util.Arrays;

public class Q01_ReverseString {
        /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak
        String input = "All is well";
        StringBuilder str = new StringBuilder();
        str.append(input); // bu method bir builder e ekleme yapar
        String reverseInput = str.reverse().toString();
        System.out.println("1. yol : " + reverseInput);


        //2.Yol: String Classini kullanarak
        System.out.print("2. yol : ");
        String cml="All is well";
        for (int i =cml.length()-1; i >=0 ; i--) {
            System.out.print(cml.charAt(i));
        }
        System.out.println();

        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        System.out.print("3. yol : ");
        char[] arr =cml.toCharArray(); //string bir veriyi karakterlere char seklinde ayirir.split methodu gibi
        TerstenYazdir(arr);

    }//main sonu

    private static void TerstenYazdir(char[] arr) {
        for (int i =arr.length-1; i >=0 ; i--) {
            System.out.print((arr[i]));

        }


        }
    }
    //class sonu
