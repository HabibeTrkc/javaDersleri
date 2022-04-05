package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        // concate yapak icin 2 yol var istersek + kullanabiliriz veya
        // string class dan gelen concate methodunu kullanabiliriz.
        String str1= "java";
        String str2="candir";
                // java candir yazdiralim.
        System.out.println(str1 + " " + str2);
        String cumle=str1.concat(str2);
        System.out.println(cumle);
        cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle);

        // concate icine sayi veya boolean deger yazarsak kabul etmez.
        // concat methoduna stringn methodu disinda bir method yazmak istedigimizde onu string haline getirmeliyiz.

        cumle=str1.concat(" "+ 5);
    }
}
