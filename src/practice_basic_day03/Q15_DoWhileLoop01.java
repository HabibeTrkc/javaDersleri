package practice_basic_day03;

import java.util.Scanner;

public class Q15_DoWhileLoop01 {
    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
    public static void main(String[] args) {
        System.out.println("programi durdurmak istediginiz de x e basin.");
        for (int i = 1; i>=1 ; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.println("bir tusa basiniz");
            String tus=scan.next();
            if (!tus.equalsIgnoreCase("x")){
                System.out.println("program calisiyor");
            }
            if (tus.equalsIgnoreCase("x")){
                System.out.println("program bitti");
                break;
            }
        }




    }
}
