package day38_inheritance_overidng;

    public class isci extends personel {
    public String statu = "isci";
    public String haklar = "isciler kıdem tazminatı alirlar";
    public String ikramiye = "isciler yilda bir defa ikramiye alir";

    public void mesai() {
        System.out.println("tum isciler haftalık 40 saat calısır");
    }

    public void maasHesapla() {
        System.out.println("tum isciler 30 gun * 8 saat * 10 euro = \" + (30*8*10)+ \"euro maaas alir");
    }
}