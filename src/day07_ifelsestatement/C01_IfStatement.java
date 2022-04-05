package day07_ifelsestatement;

public class C01_IfStatement {
    public static void main(String[] args) {
        int a=2;
        int b=3;

        if (a==b) {
            System.out.println("verilen sayilar esit");
        }
        if (a>100){
            System.out.println("a 100 den buyuk");
        }
        if (a*b>5){
            System.out.println("sayilarin carpimi 5 den buyuk");
        }
        //bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler.
        // bir sart ve o sarta bagli sonuca odaklidir.
        // birden fazla bagimsiz if cumlesi oldugunda hepsinin bady calisabilecegi gibi
        // hic birisinin bady calismayadabilir.

    }
}
