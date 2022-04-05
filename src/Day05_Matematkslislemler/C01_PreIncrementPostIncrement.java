package Day05_Matematkslislemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        // bu sayiyi 1 artirmak istersek;
        sayi++;
        System.out.println(sayi);   //11
        sayi++;
        System.out.println("pre incrementten once sayi:" + sayi);  //12
        // eger yukarda ki iki islemi tek satirda yaparsamjava 2 islemden once hangisini yapacagini bilmek ister.

        System.out.println("pre incremnetten satirinda sayi:" + ++sayi);  // once artir sonra yazdir.  //13

        System.out.println("post increment satirinda:" + sayi++); //once sayiyi yazdirir bir sonra ki yazdirma da artirir.
        System.out.println("post increment satirindan sonra:" + sayi);  //14


    }
}
