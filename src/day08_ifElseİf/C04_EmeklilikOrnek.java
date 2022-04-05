package day08_ifElseİf;

import java.util.Locale;
import java.util.Scanner;

public class C04_EmeklilikOrnek {
    public static void main(String[] args) {
        // eger calisan kadinsa 60 yasindan buyyukse emekli olabilir.
        // eger calisan erkekse 65 yasindan buyuk emekli olabilir.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi seciniz." +
                "\nkadin icin K \nerkek icin E harfini giriniz.");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("lutfen yasinizi giriniz:");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {

            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini kontrol ediniz.");
            } else if (yas < 60) {
                System.out.println("emekli olamazsiniz\n daha " + (60 - yas) + "yil calisman lazim");
            } else {
                System.out.println("emekli olabilirsiniz");
            }
        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini kontrol ediniz.");
            } else if (yas < 65) {
                System.out.println("emekli olamazsiniz\n daha " + (65 - yas) + "yil calisman lazim");
            } else {
                System.out.println("emekli olabilirsinz.");
            }
        }else {
            System.out.println("lutfen cinsiyet icin gecerli bir harf giriniz.");
        }
        }
    }
