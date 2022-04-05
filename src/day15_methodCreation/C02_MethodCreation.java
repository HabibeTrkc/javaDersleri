package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin. eger kelime 3 harften kisa ise kelime cok kisa yazdirin.
        //eger kelime 3 4 veya 5 harfli ise harf sayisini ve kelimenin tersten yazilisini yazdirin.
        // eger 5 harften uzun ise kelime cok uzun yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime girin");
        String kelime = scan.nextLine().toLowerCase();
        String terskelime = "";

        if (kelime.length() < 3) {
            System.out.println("kelime cok kisa");

            }else if (kelime.length()==3){
                terskelime=kelime.substring(2)+kelime.substring(1,2)+kelime.substring(0,1);
                System.out.println("kelimenin tersi: " + terskelime);
            }else if (kelime.length()==4){
                terskelime=kelime.substring(3)+kelime.substring(2,3)+
                        kelime.substring(1,2)+kelime.substring(0,1);
                System.out.println("kelimenin tersi: " + terskelime);
            }else if (kelime.length()==5){
                terskelime=kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+
                        kelime.substring(1,2)+kelime.substring(0,1);
                System.out.println("kelimenin tersi: " + terskelime);

        }else{
            System.out.println("kelime cok uzun");
        }

    }
}
