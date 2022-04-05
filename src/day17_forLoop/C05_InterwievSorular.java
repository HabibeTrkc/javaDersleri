package day17_forLoop;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class C05_InterwievSorular {
    public static void main(String[] args) {
        // 1: kullanicidan bir String isteyin ve Stringi tersten yazdirin.
        // 2: kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin
        // 3: kullanicidan bir string isteyin kullanicinin girdigi stringin palindrome
        // olup olmadigini kontrol eden bir program yazin.(palindrome tersten duzden okunusu ayni)
        // 4: kullanicidan 2 sayi isteyin girilen sayilar ve aralarinda ki tum sayilari toplayip,
        // sonucu yazdiran program yazin
        // 5: kullanicidan 10 dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.


        System.out.println("soru 1");
        String input="kelime";
        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.substring(i,i+1));
        }
        System.out.println("");

        System.out.println("soru 2 ");
        String str="";

        System.out.println(terscevirme(str));


        System.out.println("soru 3 ");
        String palindrome="elele";
    String tersten="";

        for (int i =palindrome.length()-1 ; i >=0 ; i--) {
          tersten+= palindrome.substring(i, i + 1); //tersten yazimi

        }if (tersten.equals(palindrome)){
            System.out.println("bu kelime palındrome");
        }else{
            System.out.println("bu kelime palindrome degil");
        }



        System.out.println("soru 4 ");
        // 4: kullanicidan 2 sayi isteyin girilen sayilar ve aralarinda ki tum sayilari toplayip,
        // sonucu yazdiran program yazin
        System.out.println(sayilarToplami());



        System.out.println("soru 5 ");
        // 5: kullanicidan 10 dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.
        Scanner scan=new Scanner(System.in);
        System.out.println("10 dan kucuk bir sayi giriniz");
        int sy=scan.nextInt();
        int faktryl=1;
        for (int i = 1; i <sy ; i++) {
            System.out.print(i+"*");
            faktryl*=i;
        }
        System.out.println(sy);
        System.out.println("faktoryelin sonucu= " +(faktryl*sy) );

    }

    private static int sayilarToplami() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int toplam=0;
        for (int i = 0; i<=sayi1 ; i++) {
            System.out.print(i+"");
            toplam+=i;
        }
        for (int i = 0; i <=sayi2 ; i++) {
            System.out.print(i+"");
            toplam+=i;
        }
        System.out.println("");
        System.out.println("iki sayi arasinda ki sayilarin toplami: " +toplam);
        return toplam;

    }

    private static String terscevirme(String str) {
        str="habibe";
        for (int i =str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        }
        return "";
    }
}

