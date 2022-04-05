package day12_stringManipulation;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        // kullanicidan e mail adresini girmesini isteyin
        //mail @gmail.com icermiyorsa lutfen gmail adresi giriniz,
        // @gmail.com ile bitiyorsa email adresiniz kaydedildi
        //@gmail.com ile bitmiyorsa lutfen yazimi kontrol edip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mail adresinizi giriniz");
        String mail=scan.nextLine();

        if (!mail.contains("@gmail.com")){
            System.out.println("lutfen @gmail adresi yazin.");
        }else if (mail.lastIndexOf("@gmail.com")==(mail.length()-10)){
            System.out.println("gmail adresiniz kaydedildi.");
        }else
            System.out.println("lutfen yazimi kontrol edip yazdirin.");





    }
}
