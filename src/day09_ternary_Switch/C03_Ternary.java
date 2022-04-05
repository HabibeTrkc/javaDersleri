package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {
        int sayi=140;
        // verilen sayinin 3 veya daha fazla basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun.

        String sonuc=sayi >= 100 ? "sayi 3 basamakli veya daha buyuk" : " sayi negatif 3 basamaktan kucuk";
        // ternary bize sonuc dondurdugu icin ya bu sonucu direk yazdirmaliyiz
        // ya da sonuca uygun bir variable atamalıyız.
        System.out.println("girdiginiz sayi analizi:" + sonuc);
    }
}
