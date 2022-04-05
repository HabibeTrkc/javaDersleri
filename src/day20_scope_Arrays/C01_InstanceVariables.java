package day20_scope_Arrays;

public class C01_InstanceVariables {
    // instance variable class icerisinde burada olusturulur.
    // burada yazilanlar static degil.main method static oldugu icin burada ki static olmayanlar main de calismaz.
    // instance variable diger adi da object variable.
    // instance variablelere static methodlardan ulasabilmek icin obje olusturmamiz gerekir.
    // bu objeyi method icerisinde olustururuz.
    // obje olustururken class adini yazarak olustururz.orn;C01_Scope obj=new C01_Scope();



    int sayi;
    String bransIsmi="java";
    boolean okulAcikMi;


    public static void main(String[] args) {
    C01_InstanceVariables obj=new C01_InstanceVariables();
        System.out.println(obj.sayi); // 0 verir.
        obj.sayi=10;
        System.out.println(obj.sayi);//10
        obj.bransIsmi="SQL";

      C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayi); // 0 verir
        System.out.println();
        System.out.println(obj2.bransIsmi); // java verir
        obj.okulAcikMi=true;
        System.out.println(obj2.okulAcikMi); // false calistirir cunku ust satirda ki true obj ye atandi.
        // obj2 yi baglamaz obj ye atanmis obj icerisinde true calisir.












    }
}
