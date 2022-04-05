package day10_switch_StringManipulation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;
import java.util.Scanner;

public class Switch_ornekler {
    public static void main(String[] args) {
        // 1: kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin.
        // 2: kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin.
        // 3:kullanicidan bir sayi girmesini isteyin
        // girilen sayi
        // 10 ise " iki basamkli en kucuk sayi"
        // 100 ise " uc basamakli en kucuk sayi "
        // 1000 ise " dort basamakli en kucuk sayi"
        // diger durumlarda "girdigin sayiyi degistir " yazdirin.
        // 4 : kullanicidan SDET kisaltmasinda ki harflerden birini yazmasini isteyin.
        // kullanici S girerse "Software"
        // D girerse "developer "
        // E girerse "Engineer "
        // T girerse " In Testing " yazdirin.
        // 5: kullanicidan gun ismini alip haftaici veya haftasonu yazdiralim.

        System.out.println("soru 1 :");
        Scanner scan=new Scanner(System.in);
        System.out.println("haftanin kacinci gunu?");
        int gun= scan.nextInt();

        switch(gun){
            case 1 :
                System.out.println("gunlerden pazartesi");
                break;
            case 2:
                System.out.println("gunlerden sali");
                break;
            case 3:
                System.out.println("gunlerden carsamba");
                break;
            case 4 :
                System.out.println("gunlerden persembe");
                break;
            case 5:
                System.out.println("gunlerden cuma");
                break;
            case 6:
                System.out.println("gunlerden cumartesii");
                break;
            case 7:
                System.out.println("gunlerden pazar");
                break;
            default:
                System.out.println("lutfen gecerli bir rakam giriniz.");
        }

        System.out.println("soru 2");
        System.out.println("kacinci aydasiniz");
         int ay=scan.nextInt();

         switch(ay){
             case 1:
                 System.out.println("aylardan ocak");
                 break;
             case 2:
                 System.out.println("aylardan subat");
                 break;
             case 3:
                 System.out.println("aylardan mart");
                 break;
             case 4:
                 System.out.println("aylardan nisan");
                 break;
             case 5:
                 System.out.println("aylardan mayis");
                 break;
             case 6:
                 System.out.println("aylardan haziran");
                 break;
             case 7:
                 System.out.println("aylardan temmuz");
                 break;
             case 8:
                 System.out.println("aylardan agustos");
                 break;
             case 9:
                 System.out.println("aylardan eylul");
                 break;
             case 10:
                 System.out.println("aylardan ekim");
                 break;
             case 11:
                 System.out.println("aylardan kasim");
                 break;
             case 12:
                 System.out.println("aylardan aralik");
                 break;
             default:
                 System.out.println("lutfen gecerli bir rakam giriniz.");
         }

        System.out.println("soru 3 :");
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        switch(sayi){
            case 10:
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("girdigin sayiyi degistir.");
        }

        System.out.println("soru 4");
        System.out.println("SDET  kisaltmasinda ki harflerden birini giriniz.");
        scan.nextLine();
        String harf=scan.nextLine().toUpperCase();

        switch (harf){
            case "S":
                System.out.println("Software");
                break;
            case "D":
                System.out.println("Developer");
                break;
            case "E":
                System.out.println("Engineer");
                    break;
            case "T":
                System.out.println("In Testing");
                break;
            default:
                System.out.println("hatali giris yaptiniz.");

        }
        System.out.println("soru 5");
        System.out.println("lutfen bir gun ismi giriniz.");
        String gn=scan.nextLine().toLowerCase();

        switch (gn){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaici gundesiniz");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu gundesiniz");
                break;
            default:
                System.out.println("hatali giris yaptiniz.");

        }





    }
}
