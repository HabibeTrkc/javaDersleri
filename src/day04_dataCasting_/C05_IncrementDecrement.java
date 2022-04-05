package day04_dataCasting_;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi=20;
        System.out.println(sayi+10);
        sayi=sayi+10; //30
        System.out.println(sayi=sayi+10); // burda hem islem yapiliyor hem de sayi degerine atama yapilmis oluyor.
        System.out.println(sayi); // bir variablenin degerini kalici artirmak istiyorsak
        System.out.println(sayi++);
        System.out.println(sayi);

        System.out.println("13. satir:" + sayi++);
        System.out.println("14.satir:" + sayi);
    }
}
