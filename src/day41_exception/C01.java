package day41_exception;

public class C01 {
    public static void main(String[] args) {
        // sorunu cozmek icin try catch blogunu kullanırız.
        // try blogu tek calişsmaz
        //tyry blogundan sonra mutlaka catch block veya finally blok olmalidir.

        int a =10;
        int b=0;
        int c=0;

        try {
            c =a/b;
        } catch (Exception e) {
            //e.printStackTrace();
            e.getMessage();
        }
        System.out.println(c);
    }
}
