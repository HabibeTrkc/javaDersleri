package day29_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {
         // baska classda ki static clas uyelerine ulasabilmek icin sadece
        // classismi.staticUyeIsmi yazmamız yeterlidir.

        System.out.println(C01_Static.okulTel);

        C01_Static.okulTel="1243";

        System.out.println(C01_Static.okulTel);

        // baska classdaki static olmayan class uyelerine ancak o classdan obje olusturarak ulasabiliriz.
        // ve obje ile yapilan atamalar sadece o obje icin yapılan degisikligi gcerli olur.

        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();

        System.out.println(obj2.okulİsmi);
        obj2.okulİsmi="sabir koleji";
        System.out.println(obj2.okulİsmi);

        System.out.println(obj1.okulİsmi);

    }
}
