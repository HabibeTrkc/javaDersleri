package interwievSorulari1;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("kelime giriniz");
        String kelime=scan.nextLine();
        System.out.print("tekrar sayisi giriniz");
        int tekrar=scan.nextInt();
        ilkSonHarfTekrar(kelime,tekrar);
        System.out.println(ilkSonHarfTekrar(kelime,tekrar));



    }

    private static String ilkSonHarfTekrar(String kelime, int tekrar) {
        String tekrr="";
        String s=kelime.substring(0,1)+kelime.substring(kelime.length()-1,kelime.length());
        for (int i = 0; i <tekrar ; i++) {
          tekrr+=s;
        }
        return tekrr;
    }
}
