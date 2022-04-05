package pratikOrnekler;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class C10 {
    /* TASK:
      tas >makas
      makas >kagit
      kagit >tas

 Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
 Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
 While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
 Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
 Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
 Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
 En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
 dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
  */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        int kullaniciPuan=0;
        int bilgisayarPuan=0;
        String secim=" ";

        while(!secim.equalsIgnoreCase("x")){
            int bilgisayar=rand.nextInt(4);
            System.out.println("tas-kagıt-makas bir secim giriniz.cıkmak icin x tuslayın");
            secim=scan.nextLine().toLowerCase();

            switch(secim){

                case "tas" :
                    if (bilgisayar==1){
                        System.out.println("berabere");
                        break;
                    }else if (bilgisayar==2){
                        System.out.println("bilgisayar kazandı");
                        bilgisayarPuan++;
                    }else System.out.println("kazandınız");
                    kullaniciPuan++;
                    break;
                case "kagit" :
                    if (bilgisayar==1){
                        System.out.println("kazandınız");
                        kullaniciPuan++;
                        break;
                    }else if (bilgisayar==2){
                        System.out.println("berabere");
                        bilgisayarPuan++;
                    }else System.out.println("bilgisayar kazandı");
                    bilgisayarPuan++;
                    break;

                case "makas" :
                    if (bilgisayar==1){
                        System.out.println("bilgisayar kazandı");
                        bilgisayarPuan++;
                        break;
                    }else if (bilgisayar==2){
                        System.out.println("kazandınız");
                       kullaniciPuan++;
                    }else System.out.println("berabere");
                    break;
                case "x" :
                    if (bilgisayarPuan<kullaniciPuan){
                        System.out.println("kazandınız puanınız : " + kullaniciPuan);
                    }else System.out.println("bilgisayar kazandı bilgisayar puanı :  " + bilgisayarPuan );
                    System.out.println("yine bekleriz");
                        break;
                default:
                    System.out.println("hatalı giris yaptınız");
                    break;
            }
        }

    }
}
