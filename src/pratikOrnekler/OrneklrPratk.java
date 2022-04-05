package pratikOrnekler;

import java.util.Locale;
import java.util.Scanner;

public class OrneklrPratk {
    public static void main(String[] args) {
        //1:kullanicidan ismini alip isminin bas harfini yazdiriniz.
        // 2: verilen sayi1 ve sayi2 variablerinin degerlerini 3.veri kullanmadan degistiren bir (SWAP) bir program yazi
        // 3:int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin.
        // 4:double 255.36 sayisini int a ve sonrada olusturdugunuz int sayiyi byte cevirip yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String isim=scan.nextLine();
        char basharf;
        basharf = isim.toLowerCase().charAt(0);
        System.out.println("adinizin ilk harfi" +"  " + basharf);

        System.out.println("soru 2");
        System.out.println("lutfen iki sayi giriniz");
                int sayi1=scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2=scan.nextInt();
        sayi1=sayi2+sayi1;   //30
        sayi2=sayi1-sayi2;  //10
        sayi1=sayi1-sayi2;
        System.out.println("girilen sayi2 yerine sayi1:"+ sayi1);
        System.out.println("girilen sayi1 yerine sayi2:"+ sayi2);

    }
}
