package day04_dataCasting_;

public class C02_AutoWidening {
    public static void main(String[] args) {
        // Auto Widening ; dar veri tipinden genis veri tipine gecmek istedigimizde java donüsümü otomatik yapmasi.
        // sadece sayisal veriler icin gecerlidir.orn asagida ki boolean ı string e cevirmez hata verir.
        // cevirme yaparken sayi degerlerine dikkat edilmeli.buyuk sayi icermeyen primitive donustururken kapsami
        // dikkate alinmalidir.kucuk deger buyuk degere atanmali.
       // boolean dogruMu=true;
       // String str=dogruMu;
        byte sayi1=44;
        System.out.println(sayi1);
        short sayi2=sayi1; // esitligin iki tarafi farkli olmasina ragmen java itiraz etmiyor.kucuk deger buyuk degere atanmis.

        System.out.println(sayi2);
        double sayi3=sayi1;
        System.out.println(sayi3);





    }
}
