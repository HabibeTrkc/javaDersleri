package practice_basic_day03;

import java.util.Scanner;

public class Q16_DoWhileLoop02 {
    /* WhileLoop,DoWhile
		Kullanıcıdan bir kelime girmesini isteyin. Sözcüğün tek sayıda karakteri varsa
    ve 3 veya daha fazla karaktere sahip,
    karakteri kelimenin ortasına yazdırın.
    kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz."
    GİRİŞ : çelik
    ÇIKTI: l
    GİRDİ: elif
    OUTPUT : Yanlış kelime girdiniz.*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= scan.next();
        System.out.println("kelime = " + kelime);
        String cıktı="";
        if (kelime.length()%2==0) {
            System.out.println(" yanlis kelime girdiniz");
        }else if (kelime.length()%2!=0 && kelime.length()>=3){
            cıktı=kelime.substring(kelime.length()/2,kelime.length()/2+1);
        }
        System.out.println(cıktı);

    }

}
