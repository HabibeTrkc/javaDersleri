package day39_Overloadin;

public class Corolla extends Toyota {

   protected String hiz = "Corolla max 200 km hiz yapar";
   protected String yakit = "corolla benzinli veya elektriklidir";
   protected String model = "corolla";

    public void motor() {
        System.out.println("corolla araclar cevreci motor kullanir");
    }

    public void yakitTuketimi() {
        System.out.println("Corolla 5.6 it yakit tuketir");
    }

    public void vitesSayisi() {
        System.out.println("corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); // araba classından alıcak. cunku toyota da yok,
        System.out.println(arb1.hiz); // corolla clasindan alir var cunku
        System.out.println(arb1.yakit); // kendi classında oldugu icin kendi classindan alır
        System.out.println(arb1.marka); //toyota classindan alir
        System.out.println(arb1.sirketMerkezi); // toyota classindan alir
        System.out.println(arb1.model); // corolla clasindan alir


        Toyota arb2=new Corolla();

        System.out.println(arb2.hareket); // araba classindan alir
        System.out.println(arb2.hiz); // toyota clasindan
        System.out.println(arb2.yakit); // araba clasindan alir
        System.out.println(arb2.marka); //toyota classindan alir direk
        System.out.println(arb2.sirketMerkezi); //toyota classindan direk alir

       Araba arb3=new Corolla();

        System.out.println(arb3.hareket); // araba classindan alir
        System.out.println(arb3.hiz); // araba clasindan
        System.out.println(arb3.yakit); // araba clasindan alir
        System.out.println(arb3.marka); //araba classindan alir direk

    }
}
