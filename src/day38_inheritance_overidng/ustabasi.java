package day38_inheritance_overidng;

public class ustabasi extends isci {



    public String statu = "ustabasi";
    public String haklar = "ustabasi haftada birgun ekstra tatil hakkına sahiptir";

    public void mesai() {
        System.out.println("ariza varsa ustabasi ekstra ucret almadan calisir");
    }

    public void maasHesapla() {


        System.out.println("ustabasi 30 gun * 8 saat * 10 euro = " + (30 * 8 * 12) + "euro maaas alir");
    }

    public static void main(String[] args) {

        ustabasi yasin = new ustabasi();
        System.out.println(yasin.statu);
        System.out.println(yasin.ikramiye);
        System.out.println(yasin.izin);
        yasin.maasHesapla();
        /*
        eger isci olarak ozelliklerini gormek istersek
        class adını data turunu isci seceriz.constrctur aynı.
         */
          isci ahmet= new ustabasi();
        System.out.println(ahmet.statu);
        System.out.println(ahmet.haklar);
        System.out.println(ahmet.ikramiye);
        System.out.println(ahmet.izin);


        personel adem = new ustabasi();
        System.out.println(adem.statu);
        System.out.println(adem.haklar);
        System.out.println(adem.izin);

    }
}
