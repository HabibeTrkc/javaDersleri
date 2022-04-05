package day27_constructor;

public class VolvoRunner {

    public static void main(String[] args) {
        Volvo arb1=new Volvo("xc90",false,2020,"dizel");
        System.out.println(arb1.marka); // volvo
        arb1.yakit="dizel";
        arb1.elektrik=false;
        System.out.println(arb1.maxHiz); //240
        System.out.println(arb1.toString());


        Volvo arb2=new Volvo("xc90",true,2019,"elektrik");
        arb2.yakit="elektrik";
        arb2.elektrik=true;
        arb2.model="xc90";
        System.out.println(arb2);


    }
}
