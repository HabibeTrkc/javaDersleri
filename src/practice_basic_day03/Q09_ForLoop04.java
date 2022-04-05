package practice_basic_day03;

import java.util.Scanner;

public class Q09_ForLoop04 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
 değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
 Sesli harfler: a,e,i,o,u

 Test Data:
 a
 Beklenen Çıktı:
 a harfi sesli harfdir.

 Test Data:
 d
 Beklenen Çıktı:
 d harfi sesiz harftir.

 Test Data:
 we  yada  %

 Beklenen Çıktı:
 Yanlis karakter girdiniz!

  */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String harf = scan.next();
        char karaktr = harf.charAt(0);
        if (karaktr >= 'a' && karaktr <= 'z') {
             if (!harf.equals(karaktr)){
                 System.out.println("tek bir harf giriniz");
             }
           else if (harf.contains("a") || harf.contains("e") || harf.contains("i") ||
                    harf.contains("o") || harf.contains("u")) {
                System.out.println("girdiginiz harf sesli harf");
            } else if (!harf.contains("a") || !harf.contains("e") || !harf.contains("i") ||
                    !harf.contains("o") || !harf.contains("u")) {
                System.out.println("girdiginiz harf sesli harf degil");
            }
        } else System.out.println("harf girmediniz");
    }
}