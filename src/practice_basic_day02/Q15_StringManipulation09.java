package practice_basic_day02;

import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime= scan.next();
        if (kelime.length()%2!=0 && kelime.length()>=3){
            System.out.println(kelime.substring(kelime.length()/2,kelime.length()/2+1));
        }else
            System.out.println("kelime cift karakterli");




    }
}