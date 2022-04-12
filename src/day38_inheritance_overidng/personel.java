package day38_inheritance_overidng;

    public class personel {
    public String statu = "Personel";
    public String haklar = "tum personel esit haklara sahiptir";
    public String izin = "tum personle yılda 4 hafta izin kullanabilir";

    public void mesai() {
        System.out.println("tum personel 5 gun, gunde 8 saat calısır");
    }

    public void maasHesapla() {
        System.out.println("tum personel 30 gun * 8 saat * 10 euro = " + (30 * 8 * 10) + "euro maaas alir");
    }

}

