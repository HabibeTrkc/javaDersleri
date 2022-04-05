package day30_passByValue;

public class C02_PassByValue {
    public static void main(String[] args) {

        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main methodda etiket fiyati : " + etiketFiyati);
    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {
        etiketFiyati=etiketFiyati*0.90;
        System.out.println("sizin icin %10 indirimli fiyatınız : " + etiketFiyati);


    }
}
