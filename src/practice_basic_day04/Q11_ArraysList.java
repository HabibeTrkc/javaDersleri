package practice_basic_day04;

import java.util.*;

public class Q11_ArraysList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */
        List<String>veriTabanindakiKullanicalar=new ArrayList<>(Arrays.asList("Ayse","Ahmet","Hasan","Ali","Mehmet","Derya"));

        // 1. adim
        Scanner scan=new Scanner(System.in);
        System.out.println("kullanici adi girin");
        String isim=scan.nextLine();
        // 2. adim
        isim.trim();

        // 3. adim
    boolean kullaniciIsmiVarMi=veriTabanindakiKullanicalar.contains(isim);

        // 4. adim
if (kullaniciIsmiVarMi){
    System.out.println("Bu kullanici adi zaten girilmis.");
}else System.out.println("bu kullanici adini kullanabilirsiniz");

        //5.adim
        if (kullaniciIsmiVarMi){
            int rastgeleSayi=new Random().nextInt(100);
            isim=isim+""+rastgeleSayi;
            System.out.println("yeni kullanici adi olarak bunu kullanabilirisiniz: " + isim);
        }else System.out.println("yeni kullanici adi :" + isim);
scan.close();
    }
}
