package practice_basic_day02;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Q11_StringManipulation05 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("4 kelime giriniz");
        String kelime=scan.next();
        String kelime1=scan.next();
        String kelime2=scan.next();
        String kelime3=scan.next();
        System.out.println(kelime+""+kelime1+""+kelime2+""+kelime3+".");

    }
}
