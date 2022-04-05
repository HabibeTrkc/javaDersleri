package day03_scanner;

public class C03_VariablesTempolmadan {
    public static void main(String[] args) {
        // verilen sayi1 ve sayi2 variablerinin degerlerini 3.veri kullanmadan degistiren bir (SWAP) bir program yaziniz.
        // orn sayi1=10 ve sayi2 =20; kod calistiktan sonra sayi1=20 sayi2=10
        int sayi1=10;
        int sayi2=20;
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println(sayi1 + " " + sayi2);
    }
}
