package day19_WhileLoopDoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        // kullanicidan pozitif tam sayi alip while loop ile sayidan kucuk sayilari yazdiralim
        int input=10;
        int tekrar=1;
        while(input>tekrar){
            System.out.print(tekrar);
            tekrar++;
        }
        System.out.println("");
// ayni soruyu do while loop ile yapalim.once yap sonra kontrol et demektir. o sekilde calisir.
        // while den farkli sart saglanmazsa tekrar basa donmez.
        // bir diger farki da ilk onceyazdirir sonra sarta bakar.
        // while icinde scanner kullanilmak isteniyorsa do while loop kullanilir.

        tekrar=1;
        do {
            System.out.print(tekrar);
            tekrar++;
        }while (tekrar<input);







    }
}
