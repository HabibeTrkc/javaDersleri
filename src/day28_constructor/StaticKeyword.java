package day28_constructor;

public class StaticKeyword {
    static int sayi1;
            int sayi2;

    public static void main(String[] args) {
        /*
        static variableler direk classa baglıdır.
        Class icerisinde yapılan her turlu degisiklik static variablelerde kalıcı olur.
        Instance variableler ise objeye baglıdır.Instance variableleara sadece obje uzerinden erisilebilir.
        Ve bir obje uzerinden erisilerek yapılan degisiklik Instance variablanın degerini kalıcı olarak degistirmez.
        sadece o obje icin Instance variable degerini kalıcı olarak degistirir.
         */

        System.out.println(sayi1);
        StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayi2);

        sayi1++;
        System.out.println("sayi1= " + sayi1);
        obj1.sayi2++;
        System.out.println("obj1 = " + obj1);

        StaticKeyword obj2=new StaticKeyword();

        System.out.println(obj2.sayi2); //0

        /*static olan variableler constructordan bagımsız calısır.
        obj icinde cagırsak bile en son ki degeri ne ise onu getirir.
         */
        System.out.println(obj2.sayi1); //1

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2); //1
        System.out.println(obj2.sayi1); //1

        System.out.println(obj1.sayi1); //2
        System.out.println(obj1.sayi1); //2







    }

}
