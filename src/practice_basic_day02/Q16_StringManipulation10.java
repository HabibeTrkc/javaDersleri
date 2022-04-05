package practice_basic_day02;

public class Q16_StringManipulation10 {

    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {

String cumle= "   Java ogrenmek123 Cok guzel@      ";

        String rakam=cumle.replaceAll("\\d","");
        rakam=rakam.replaceAll("@","");
        rakam=rakam.replaceAll("C","c");
        String bosluk=rakam.trim();
        System.out.println(bosluk);
    }
}
