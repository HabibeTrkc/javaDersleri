package day37_Inheritıns;


import day36.Parent;

public class Child extends Parent {


    Child() {
        super();
        System.out.println("child class parametresiz cons");
    }

    Child(int sayi1) {
        //child class da tum constrctrların
// ilk satırına javanın yerlestirdigi constrctr ;
// Parametresizdir.
        System.out.println("child class parametreli cons.");
    }
    Child(int sayi1,int sayi2){
        // eger parent clsadan parametrressziz cons. degilde
        // baska bir cons. calıstırmak isterseniz
        // bunu child class da ki cons. ilk satırına yazmalısınız.
        super(sayi1,sayi2);
        System.out.println("child iki parametreli cons.");
    }

    public static void main(String[] args) {
        Child child = new Child(5,8);
    }
}
