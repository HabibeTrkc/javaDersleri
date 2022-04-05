package day26_foreachLoop_constructor;

public class Araba {

    /* java da her class olusturdugumuzda;
    java o classdan ilerde objeler uretmek gerekecegini bilir
    ve biz ozellikle belirtmesekte
    java her olusturdugu classa bir constructor koyar.

     Java nın class olustururken class a kydugu constructor a
     DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez.

     Eger biz gorunur bir constructoumuz olsun istersek;
      default constructor ile aynı gorevi yapan bir constructor da olusturabiliriz.
      veya istersek aynı kalıptan farkli dsesenlerde objeler olustrumak
       icin farkli ozelliklerde consrtructorlar da olusturabiliriz.

     constructorlari birbirinden farklılastıran tek ayricalik kullanilan parametre data turudur.
     */
    public Araba(){
        System.out.println("parametresiz constructor calistı.");

    }

    // bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz ;
    // 2 seye dikkat etmelisiniz;
    // 1. constructorlarin ismi class ismi ile aynı olmak zorundadır.
    // dolayısıyla class ismi buyuk harfle basladigi icin buyuk harfle baslamali.
    // 2. constructorların return type olmaz.

    // ozetle : constructor un adi class adi ile aynı olmali ve return type olmamali.
public Araba(String renk){
    System.out.println(renk + " renkli bir araba uretildi.");
}
public Araba(int yil){
    System.out.println(yil + " model araba uretildi ");
}
public Araba(int yil,String renk){
    System.out.println(yil + " model " + renk + " renginde araba uretildi");
}
}
