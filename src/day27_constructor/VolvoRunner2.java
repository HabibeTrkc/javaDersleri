package day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        // her obje olusturdugumuzda model,yakıt gibi degerleri
        // tek tek atama yapmak istemiyorsanız;


        Volvo arb1=new Volvo("xc60",false,2023,"benzin");
        System.out.println(arb1);

        Volvo arb2=new Volvo("xc90",true,2021,"elektrikli");
        System.out.println(arb2);
    }
}
