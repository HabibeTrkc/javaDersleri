package day31_immutableClasses;

public class C02_Equals {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") {             // calısmaz
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {         // calısır
            System.out.println("equalas");
        }

        String b = "2cfalse";
        if (b == "2cfalse") {             // calısır
            System.out.println("==b");
        }
        if (b.equals("2cfalse")) {         // calısır
            System.out.println("equalas b");

        }
    }
}