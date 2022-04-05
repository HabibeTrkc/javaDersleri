package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        // bazen ternariyde ki iki sonucun data turleri farkli olabilir.
        // eger sonuclar farkli data turundeyse atama yapacagimiz variable nin
        // data turu tek olmasi gerektigi icin atama yapamayiz.

        //verilen sayi 100 den buyukse sayi nın karesini alip yazdiran
        // 100 den kucukse sayi 100 den buyuk olmali  yazdiran ternary olusturalim.

        int sayi;
        sayi=52;

        System.out.println(sayi > 100 ?   sayi * sayi : "sayi 100 den buyuk olmali");


    }
}
