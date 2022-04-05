package day20_scope_Arrays;

public class C02_StaticVariables {
    static String okulIsmi="yildiz koleji";
    static  int okulNo;
    static  boolean okulAcikMi;

    public static void main(String[] args) {
        System.out.println(okulAcikMi);
        System.out.println(okulIsmi); // yildizkoleji
        System.out.println(okulNo); // 0
        okulNo=102;
        System.out.println(okulNo);  // 102


        staticMethod();// main method icerisnde calistirmazsak asagida ki method calismaz.

        System.out.println(okulNo); //200




    }
    public static void staticMethod(){
        System.out.println(okulNo); //102
        okulNo=200;
        System.out.println(okulNo); //200


    }
}
