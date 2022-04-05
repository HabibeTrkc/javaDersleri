package day03_scanner;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        //1: kullanicidan iki tam sayi alip bu sayilarin toplam,fark, ve carpimlarini yazdirin.
        //2: kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini yazdirin.
        //3: kullanicidan yari cap isteyip cemberin cevresini ve dairenin alanini hesaplayin.
        //4: kullanicidan dikdortgen prizmasinin uzun,kisa kenarlarini ve yuksekligini isteyip prizmanin hacmini hespla
        //5: kullanicidan ismini ve soyismini isteyip asagida ki sekilde yazdirin;
        //           isminiz: habibe  Soyisminiz : Turkucu  kursumuza katiliminiz alinmistir tesekkurler.
        //6:kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturup asagidaki sekilde yazdiriniz:
        //      isim-soyisim=habibe turkucu
        //7:kullanicidan ismini alip isminin bas harfini yazdiriniz.

        //1:

        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz:");
        int ilksayi=scan.nextInt();
        System.out.println("ikinci sayiyi giriniz:");
        int ikincisayi=scan.nextInt();
       int  toplam=ilksayi+ikincisayi;
       int fark=ilksayi-ikincisayi;
       int  carpim=ilksayi*ikincisayi;
        System.out.println("toplami:" + toplam +" "+ "farki: " + fark + " " + "carpimi: " + carpim);

        //2:
        System.out.println("kenar uzunlugunu giriniz:");
        int kenar=scan.nextInt();
        int cevre=4*kenar;
        int alan=kenar*kenar;
        System.out.println("cevre: " + cevre + " "+ "alan: " + alan);

        //3:
        System.out.println("yaricap giriniz:");
        double yaricap=scan.nextDouble();
        double cevre1=2*3.14 * yaricap;
        System.out.println("cevre:" + " " + cevre1);
        double alan1=3.14* (yaricap*yaricap);
        System.out.println("alan:" + " " + alan1);

        //4.
        System.out.println("uzun kenar giriniz:");
        int uzunkenar=scan.nextInt();
        System.out.println("kisa kenar giriniz:");
        int kisakenar=scan.nextInt();
        System.out.println("yuksekligini giriniz:");
        int yukseklik=scan.nextInt();
        System.out.println("alani:  " + " " +(2 * (uzunkenar * kisakenar)) + (uzunkenar * yukseklik)
                + (kisakenar * yukseklik) + (uzunkenar * kisakenar) + (uzunkenar * yukseklik) + (kisakenar * yukseklik));
        //5
        scan.nextLine();
        System.out.println("isminiz:");
        String isim=scan.nextLine();

        System.out.println("soyadiniz:");
        String soyisim=scan.nextLine();
        System.out.println(isim + " "+ soyisim + " "+ "kursumuza kaydiniz alinmistir.");

        //6
        scan.nextLine();
        System.out.println("lutfen isminizi yaziniz:");
        String ad =scan.nextLine();
        System.out.println("lutfen soyadinizi yaziniz:");
        String soyad=scan.nextLine();
        System.out.println("isim - soyisim:" + " " + ad + " " + soyad);

        //7
        System.out.println("lutfen isminizi giriniz:");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi:" + ilkHarf);








    }
}
