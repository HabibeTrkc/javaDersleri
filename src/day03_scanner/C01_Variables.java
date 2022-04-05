package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {
        // 1:farkli 3 data turunde variable olusturun ve bunlari yazdirin.
        // 2:isim ve soyisim icin 2 variable olusturun ve bunlari isminiz: soyisminiz: seklinde yazdirin.
        // 3:iki farkli tamsayiyi data turunde 2 variable olusturun.toplamini yazdirin.
        // 4:bir tm sayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin.
        // 5:char data turunde bir variable olusturun ve yazdirin.
        // 6:bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        // 1:
        String okulIsmi= "yildiz koleji";
        System.out.println(okulIsmi);
        char ilkHarf;
        ilkHarf='h';
        System.out.println(ilkHarf);
        int sayi1=10, sayi2=20;
        System.out.println(sayi1 + sayi2);

        // 2.
        String isim="Habibe";
        String soyIsim="Turkucu";
        System.out.println("adiniz:" + isim);
        System.out.println("soyadiniz:"+ soyIsim);

        // 3.
         byte sayi3=50, sayi4=85;
        System.out.println("iki sayinin toplami:" + (sayi3 + sayi4));

        //4.
         byte tamsayi=62;
         double ondlksayi=1.25;
        System.out.println(tamsayi + ondlksayi);

        //5.
        char harf='B';
        System.out.println(harf);

        //6. char data tururunde matematiksel islemler kullanilirsa char degerinin ascii karsiligi isleme alinir.

       int sayi5=20;
       char hrf='a';
        System.out.println(sayi5 + hrf);





    }
}
