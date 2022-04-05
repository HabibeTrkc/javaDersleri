package day04_dataCasting_;

public class C03_Casting {
    public static void main(String[] args) {
        int sayi1=8;
        int sayi2=4;
        System.out.println(sayi1/sayi2);
        sayi2=3;
        System.out.println(sayi1/sayi2);
        sayi1=22;
        System.out.println(sayi1/sayi2);
        // java 2 int sayiyi birbirine bolerse sonucu da int olarak verir.
        // eger virgulden sonra kusurat var ise siler.
        sayi1=4786;
        sayi2=10;
        sayi1=sayi1/sayi2;   //478
        System.out.println(sayi1);
        sayi1=sayi1/sayi2;   // 478/10
        System.out.println(sayi1);
        sayi1=sayi1/sayi2;    //  47/10
        System.out.println(sayi1);
        sayi1=sayi1/sayi2;     //  4/10
        System.out.println(sayi1);

        // 2 farkli sayi turunu isleme koydugumuzda java kucuk olan data autowidening yapar.
        // asagida ki isleme baktigimizda sayi1/sayi3 isleminin sonucunu double kabul eder.
        // sag taraf double sol taraf int oldugunda islemi kabul etmez.sol taraf double olmali.

         sayi1=4895;
        double sayi3=10;
        //sayi1=sayi1/sayi3;
        //System.out.println(sayi1);
        System.out.println(sayi1/sayi3);
        System.out.println(sayi3/sayi1);







    }
}
