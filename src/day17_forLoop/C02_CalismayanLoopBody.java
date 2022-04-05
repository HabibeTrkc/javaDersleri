package day17_forLoop;

public class C02_CalismayanLoopBody {
    public static void main(String[] args) {

        //eger loop ending condition hic true olmazsa loop body hic devreye girmez.
        // artis degeri 1 olmak zorunda degil.(i+=2...)

        for (int i = 0; i >10 ; i++) {
            System.out.println(i);
        }
        System.out.println("baslangic degeri bitis kosulunu saglamadigindan loop body hic calismadan " +
                " loop sona erer.");
    }
}
