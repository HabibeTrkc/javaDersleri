package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C03_equalsIgnore {
    public static void main(String[] args) {
        // kullanicidan derse katilip katilmadigini istemedigini sorun
        // evet derse derse katiliminiz alinmistir ve derse katilmistir yazdirin.
        // hayir derse sonra ki derse bekleriz yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("derse katilip katilmama isteginizi evet-hayir olarak cevaplayiniz.");
        String ders=scan.nextLine();
       if (ders.equalsIgnoreCase("evet")){
           System.out.println("cevabiniz:" + ders + " derse katilmistir.");
           }else if(ders.equalsIgnoreCase("hayir")){
           System.out.println("cevabiniz:" + ders + "  sonra ki derse bekleriz.");
       }else
           System.out.println("lutfen gecerli bir cevap giriniz.");



    }

}
