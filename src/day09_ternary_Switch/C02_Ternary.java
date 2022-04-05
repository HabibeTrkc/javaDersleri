package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // ternary ile yapilan tum islemler if else ile de yapilabilir.
        // if else yerine tercih etme sebebi yapinin basit ve anlasilir olmasidir.
        // ternary icerisinde kompleks kodlar olmaz sadece sonuc veya bizi souca goturen islemler olabilir.


        //kullanicidan bir tam sayi alip tek mi cift mi oldugunu yazdirin.
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz.");
        int sayi=scan.nextInt();


        if (sayi%2==0){
            System.out.println("sayi cift");
        }else{
            System.out.println("sayi tek");
        }

        // ternary ile yapimi;
        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");


    }
}
