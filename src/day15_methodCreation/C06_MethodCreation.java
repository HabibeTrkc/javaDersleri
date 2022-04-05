package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        // iki variablenin degerlerini toplayan bir method olusturalim.
        //1.adim mehod adini yazalim
        //2. methoda gondermem gereken arguman var mi?
        ikisatiTopla( a, b);
    ikisatiTopla(25,55);
    C04.dortharflitersten("sema");

    }
    // burda main methodun calismasi durur.
    // bir methodu olusturmak calismasi icin yeterli degildir.
    //method ancak cagirildigi zaman calisir.
// alt kisimda ki ikisayitopla methodu mainmethodu olmadigi icin calismaz.
    private static void ikisatiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami" + (a + b));




    }
}
