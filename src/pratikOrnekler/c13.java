package pratikOrnekler;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class c13 {
    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random sy=new Random();
        int sayi= sy.nextInt(20);
        String kullanicilar="ali12,ayse13,fatma";
        System.out.println("kullanıcı adi giriniz");
        String isim=scan.nextLine().toLowerCase();
        isim=isim.replaceAll(" ","");
        if (kullanicilar.contains(isim)){
            System.out.println("bu kullanici adi zaten var");
            System.out.println(isim+sayi + " kullanabilirsiniz");
        }else System.out.println("kullanici adiniz olusturuldu  "  + isim);



    }


}
