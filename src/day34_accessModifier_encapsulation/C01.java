package day34_accessModifier_encapsulation;

public class C01 {
    // private classlara sadece bulundugu classda erisilebilir.
    // private ile olusturulan class uyelerine baska yerden erisilemez.


    private static int sayi=10;
    private static String str="Java";
    static int acikSati=20;


    C01(){

    }

    // private ile olusturulan classlarada baska paketlerden erisilemez
   private C01(int numara){

    }


    private void method1(){

    }
}