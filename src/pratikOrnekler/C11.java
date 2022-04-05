package pratikOrnekler;


import java.util.Random;
import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
          /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basmakli bir sayi giriniz");
        int sayi = scan.nextInt();
        armstronSayi(sayi);
        girilenSayiyaKadar(sayi);
    }

    private static void armstronSayi(int n) {
        int basamak=0;
        int kup=0;
        int girilenSay=n;

        while(n>0) {
            basamak = n % 10;
            kup += (basamak * basamak * basamak);
            n= n/10;
        }
            if (kup==girilenSay){
                System.out.println("girdiginiz sayi armstron sayi");
            }else System.out.println("girdiginiz sayi amstron sayi degil");

        }
        private static void girilenSayiyaKadar(int sayi){
            for (int i = 0; i <=sayi ; i++) {
                armstronSayi(i);
            }
        }

    }

