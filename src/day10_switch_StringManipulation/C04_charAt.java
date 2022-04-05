package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {
        // stringde herhangi bir karakteri almak istedigimiz de
        // o harfin indexini kullanarak str.charAt(istenen indeks) yazabiliriz.
        //indeks saymaya 0 dan baslar.bosluklari da sayar
        // char matematiksel isleme koyarsaniz ascıı tablosuna gore hesaplar.
        // matematiksel isleme almasini istemiyorsak araya bir hiclik eklememiz gerekiyor.

        String str="java cok guzel";
        System.out.println(str.charAt(9));

    }
}
