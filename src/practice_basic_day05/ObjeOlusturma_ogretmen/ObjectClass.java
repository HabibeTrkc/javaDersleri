package practice_basic_day05.ObjeOlusturma_ogretmen;

public class ObjectClass {
    /*
     * Object Class’i olusturun burada OgretmenBilgileri Class indan
     * object ureterek yeni
     * ogretmenler olusturun ve bilgilerini yazdirin
     */
    OgretmenBilgileri obj1=new OgretmenBilgileri();

    public static void main(String[] args) {
        OgretmenBilgileri obj1=new OgretmenBilgileri();
        obj1.isim="Ahmet";
        obj1.soyisim="Kaya";
        obj1.yas=32;
        obj1.brans="fizik";
        obj1.tel="05428965412";

        OgretmenBilgileri obj2=new OgretmenBilgileri();
        obj2.isim="Gulsen";
        obj2.soyisim="Genc";
        obj2.brans="bilgisayat ogretmeni";
        obj2.yas=20;
        obj2.tel="1254785236";

        System.out.println("obj1: "  + obj1); // bu sekilde referans degeri yazdirir.

        System.out.println(obj1.isim + " " + obj1.soyisim + " ");
        System.out.println(obj2.isim + " " + obj2.soyisim + " ");



    }
}
