package day07_ifelsestatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_IfElse {
    public static void main(String[] args) {
        // kullanicidan gun ismini alin ve haftaici veya haftasonu oldugunuz yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun yaziniz");
        String gun=scan.nextLine().toUpperCase();

        if (gun.equals("PAZAR")|| gun.equals("CUMARTESİ")) {
            System.out.println("gunlerden haftasonu");
        } else {
            System.out.println("gunlerden haftaici");
        }
    }
}
