package day06_concatenation_operators;

public class C01_Concatenation {
    public static void main(String[] args) {
        String str1="java";
        String str2="guzel";
        int sayi1=5;
        int sayi2=3;
        // variablerin degerlerini degistirmeden asadaki ifadeleri bu variableleri kullanarak yazdirin.
        // java5guzel

        System.out.println(str1+sayi1+str2);

        // 2guzel15

        System.out.println(sayi1-sayi2 + str2 + sayi1*sayi2);

        // java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        //53guzel
        System.out.println(""+sayi1 + sayi2 + str2);
        /* eger sayilardan olusan bir string varsa ve biz bunu int cevirmek istersek(stringi int cevirme);
         Integer.valueOf()
         bir sayiyi stringe cevirmek istersek  sayinin ya basina ya somuna " " (hiclik) ekleriz.*/




    }
}
