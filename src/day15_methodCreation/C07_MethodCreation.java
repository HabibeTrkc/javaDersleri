package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {
        String str="ali";
        //stringi yazdiran method olustruralim.
        // hosgeldiniz diyen bir method olusturun.
        //kapanma mesaji yazan method

        hosgeldinyazdir();

    }
    private static void kapanmaMethodu() {
        System.out.println("bizi tercih ettigniz icin tesekkur ederiz.");
    }
    private static void hosgeldinyazdir() {
        System.out.println("hosgeldin");
        stringYazdir("boyle de olur.");
    }
    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
