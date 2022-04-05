package practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kelime veya cumle giriniz");
        String kelime = scan.nextLine().toLowerCase();
        String boslukYok = kelime.replaceAll("\\s", "");
        if (kelime.length() == boslukYok.length()) {
            System.out.println("kelime de bosluk yok");
        } else {
            System.out.println("girdiginiz metinde bosluk var");
        }
        String boslukKaldir = kelime.replaceAll(" ", "");
        if (kelime.length() > 0 && boslukKaldir.length() > 0) {
            System.out.println("string bos degil");
        }else{
            System.out.println("string bos");
        }

    }
    }

