package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str = "java ile IT cok guzel";
        System.out.println(str.substring(5));// 5. indexten sonrasini bize verir.

        // yukarida ki metini mehmet hoca ile ıt cok guzel yapalim.
        System.out.println(str.replace("java", "mehmet hoca"));
        System.out.println("mehmet hoca " + str.substring(5));

        //eger bir indexden sona kadar olan parcayi degil belirli bir parcayi almak istersek
        // 2 parametre yazmak gerekiyor.
        //str.substring(baslangic index,bitis index)
        // baslangic index i dahildir ama bitis indexi dahil degildir.

        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(0, 1)); // j
        System.out.println(str.substring(5, 6)); //5. harfi istedigimizde,saymaya 0 dan baslar
        System.out.println(str.substring(6, 7)); // 6. harfi istedigimizde


        str="java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7)); // hiclik verir.
        // System.out.println(str.substring(5, 2)); // hata verir
        System.out.println(str.substring(str.length()-1)); // son harfi verir
        System.out.println(str.substring(str.length() - 5)); // son 5 harfi verir.
        System.out.println(str.substring(str.length())); // som harften sonra ki kismi yani hicli verir.
    }


}
