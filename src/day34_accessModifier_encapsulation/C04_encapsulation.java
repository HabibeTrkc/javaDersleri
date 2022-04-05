package day34_accessModifier_encapsulation;

public class C04_encapsulation {
    public static void main(String[] args) {

        /*  bir variable encapsule etmek icin
        1_ Access midifier i private
        2- okuma ve yazma ozelliklerinin kullanilmasini istedgimiz gibi sınırlayabiliriz
           -eger sadece okunmasını istiyorsanız getter
           -sadece girilebilsin isterseniz setter  methodlarını olustururuz.


           Bir variable icin hem gettir hem settir olusturursanız o variable public
           olmus gibi hem okuyup hem de yazılmasını saglayabiliriz.
         */

        C03 obj = new C03();
        System.out.println(obj.getSayi());

        obj.setStr("java java java");

        System.out.println(obj.getStr());

        System.out.println(obj);














    }
}
