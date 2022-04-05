package practice_basic_day02;

import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime = scan.nextLine().toLowerCase();
        System.out.println("kelime = " + kelime);
        String ters = "";
        if (kelime.length() <= 4) {
            for (int i = kelime.length() - 1; i >= 0; i--) {
                ters += kelime.substring(i, i + 1);
            }
            System.out.println("girdiginiz kelimenin tersi : " + ters);

        }else {
            System.out.println("4 harften fazla girdiniz");
        }
    }
}
