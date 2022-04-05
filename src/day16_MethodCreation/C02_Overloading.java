package day16_MethodCreation;

public class C02_Overloading {
    public static void main(String[] args) {
        // verilen 2 sayiyi toplayan method olusturun.
        int sayi1=10;
        int sayi2=20;

        ikisayiTopla(sayi1,sayi2);

        double sayi3=154.2;
        double sayi4=45.2;

        ikisayiTopla(sayi3,sayi4);

        //bir integer ile bir double toplamini yazdiran bir method olusturalim.
        int sayi5=5;
       double sayi6=12.5;
        ikisayiTopla(sayi5,sayi6);



    }
    private static void ikisayiTopla(int sayi3, double sayi4) {
        System.out.println("bir integer bir double toplami :  " + (sayi3+sayi4));
    }

    private static void ikisayiTopla(double sayi3, double sayi4) {
        System.out.println("iki double toplami: " + (sayi3+sayi4));
    }


    private static void ikisayiTopla(int sayi1, int sayi2) {
        System.out.println("iki int sayinin toplami: " + sayi1 + sayi2);
    }


}

