package day19_WhileLoopDoWhileLoop;

public class C02_Scope {
    //1: bir method icerisinde olusturulan variable ler sadece olusturlduklari method da kullanilabilirler.
    // baska methodlarda kullanilmazlar.
    // 2: tum methodlarin kullanabilmesini istedigimiz variableleri claas level de olustururuz.
    // class level de olusturdugumuz variable static yaparsak tum methodlar kullanabilir.
    // static olmazsa o zamn sadece static olmayan methodlar kullanbilir.
    // 3 : loop icinde olusturulan variableler loop icerisinde kullanilabilir
    // ama loop disinda kullanilmaz


    static String kurs="java";  // tum methodlarda calisir.
    int level=10;               // sadece static olmayan methodlarda calisir.



    public static void main(String[] args) {
        int sayi=10;


    }
    public static void method1(){


    }
    public void method2(){

    }
}
