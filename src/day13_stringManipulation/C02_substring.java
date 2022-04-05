package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {
        //843 sonuç arasından 1-48 arası gösteriliyor. Aranan ürün: "nutella"
        //bu arama sonucunda bulun sonuc sayisi 100 den cok ise super
        //az ise az sonuc bulundu

        String str="20 sonuç arasından 1-48 arası gösteriliyor. Aranan ürün: \"nutella\"";

        int ilkSpace=str.indexOf(" "); // ilk bolsugu bu sekilde buluruz.
        String sonuc = str.substring(0, ilkSpace); ///843 sayisini alirim
int sayi=Integer.valueOf(sonuc);

        if (sayi>100){
            System.out.println("sonuc super");
        }else
            System.out.println("az sonuc bulundu");

    }
}
