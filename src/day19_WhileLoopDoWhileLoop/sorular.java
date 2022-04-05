package day19_WhileLoopDoWhileLoop;

public class sorular {
    public static void main(String[] args) {
        // 1:)while loop kullanarak 3 den 13 e kadar tum tek sayilari yazdirin.
        // 2:)for loop ve while loop kullanarak 3 basamakli sayilardan 15,20 ve 90 a tam bolunebilen sayilari yazdirin.
        // 3:) kullanicidan baslangic ve bitis degerini alin.baslangic ve bitis degeri dahil aralarindaki
        // tum cift tam sayilari while loop kullanarak yazdirin
        // 4:) kullanicidan baslangic ve bitis harflerini alin ve baslangic harflerinden
        // baslayip bitis harflerinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
        // kullanicinin hala yapmadigini farz edin.
        // 5:)kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana yazdirin.
        // kullanicinin hata yapmadigini farz edin. 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18...gibi
        // 6:) kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini
        // ekrana yazdirin.
        // 7:) kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin.

        System.out.println("soru 6"); // for loop ile de yapilabilir
        int sy=15;
        int bolen=1;
        int sayac=0;

        while(bolen<=sy){
            if(sy % bolen==0){
                System.out.println(bolen + " ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(sy + " sayisini bolen " + sayac + " adet sayi vardir.");

        System.out.println("soru 7");
        int sy2=15289620;
        int rakam=0;
        int rakamlarTop=0;

        while(rakam<=sy2) {
            rakam += sy2 % 10;
            rakamlarTop = rakam;
            sy2 /=10;
        }
        System.out.println("rakamlar toplami : " + rakamlarTop);












    }
}

