package interviewQuestions3;

import java.util.Locale;
import java.util.Scanner;

public class Q02_Palindrome {
    /*
      Crteate a program checks if a String is PALINDROME or not.
      If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
      For Example : "madam" or "nursesrun" .
      Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
      polindrome :tersten okunuşu da aynı olan ifadeierdir.
      ornek : Ey edip Adanada pide ye,  Traş niçin şart
       */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String cml=scan.nextLine();
        String ters="";
        PalindromeYol1(cml,ters);
        PalindromeYol2(cml);


    }

    private static void PalindromeYol2(String cml) {
        StringBuilder sb=new StringBuilder(cml);
        String tersStr=sb.reverse().toString();
        if (tersStr.equalsIgnoreCase(cml)){
            System.out.println("girdiginiz ifade palindrome");
        }else System.out.println("girdiginiz ifade palindrome degil");
    }

    private static void PalindromeYol1(String cml, String ters) {
        for (int i = cml.length()-1; i >=0 ; i--) {
            ters+=cml.charAt(i);
        }
        if (ters.equalsIgnoreCase(cml)){
            System.out.println("girdiginiz cumle palindrome");
        }else System.out.println("girdiginiz cmle palindrome degildir");
    }
}