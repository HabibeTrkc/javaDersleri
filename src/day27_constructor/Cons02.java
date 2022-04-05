package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1 =new Cons01(); // default constructor devrede
        /* Cons01 classında;
        Hic constructor olusturmazsak  java default constructor u kullandıgından obj1 i uretebiliriz.
        Ancak  biz parametreli veya parametresiz bir constructor yazdıgımızda java artık default constructoru siler.


        Dolayısıyla biz herhangi bir constructor olusturdugumuzda daha once baska classlar
         veya kullanıcıların olusturmus olabilecegi objeleri kullanabilmeleri icin
         default constructor um  islevini gerceklestirecek parametresiz bir constructor olusturmakta fayda var.
         */
        Cons01 obj2=new Cons01("JAVA");

    }
}
