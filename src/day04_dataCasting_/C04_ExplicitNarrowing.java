package day04_dataCasting_;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=879;
        double sayi2=10;
        double sayi3=sayi1/sayi2;
        System.out.println(sayi3);
      // int sayi4=sayi1/sayi2; // bu islemi java otomatik yapmaz hata verir.cunku double int gore daha buyuk.
        // ancak sorumlulugu biz alirsak islemi kabul eder.bunun icin de sayi1/sayi2 basina (int) eklemeliyiz.
        int sayi4=(int) (sayi1/sayi2);   // burada ki sag tarafta ki int sorumluluk bende demektir.
        System.out.println(sayi4);
        int sayi5=140;
        byte sayi6=(byte) sayi5;
        System.out.println(sayi6);

         sayi5=-260;
         sayi6=(byte) sayi5;
        System.out.println(sayi6);



    }
}
