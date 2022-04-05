package day04_dataCasting_;

public class Odev_DataCasting {
    public static void main(String[] args) {


    // 1:byte veri tipinde bir degisken olusturun.short,int,float ve double data tiplerinde birer degisken olusturup
    //   adim adim widening yapin ve yazdirin.
    // 2: int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin.
    // 3: float data turunde bir variable olusturn ve yazdirin.
    // 4:double 255.36 sayisini int a ve sonrada olusturdugunuz int sayiyi byte cevirip yazdirin.
    // 5: int 2 sayiyi birbirine boldurun ve sonucu yazdirin
    // 6: int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
    // 7: farkli data tipleriyle islem yapip sonuclarini yazdirin.

    // 1:
        System.out.println("soru 1");
    byte sayi=12;
    short sayi1=sayi;
        System.out.println(sayi1);
        int sayi2=sayi1;
        System.out.println(sayi2);
    float sayi3=sayi2;
        System.out.println(sayi3);
        double sayi4=sayi3;
        System.out.println(sayi4);

    //2  int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin.
        System.out.println("soru 2");
        int sayi5=10;
       short sayi6=(short) sayi5;
        System.out.println(sayi6);
        byte sayi7=(byte) sayi6;
        System.out.println(sayi7);

        //3
        System.out.println("soru 3");
        float data=12.5f;
        System.out.println(data);

        //4 :double 255.36 sayisini int a ve sonrada olusturdugunuz int sayiyi byte cevirip yazdirin.
        System.out.println("soru 4");
        double sy=255.36;
        int sy1=(int) sy;
        System.out.println(sy1);
        byte sy2=(byte) sy1;
        System.out.println(sy2);

        //5 int 2 sayiyi birbirine boldurun ve sonucu yazdirin
        System.out.println("soru 5");

        int say1=20;
        int say2=5;
        System.out.println(say1/say2);

        //6 int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        System.out.println("soru 6");
        int say3=52;
        double say4=21.2;
        System.out.println(say3/say4);

        // 7 farkli data tipleriyle islem yapip sonuclarini yazdirin.
        System.out.println("soru 7");
        int say5=256;
        short say6=12;
        byte say7=10;
        long say8=563;
        System.out.println(say5 + say6 * say7 / say8);




    }

}
