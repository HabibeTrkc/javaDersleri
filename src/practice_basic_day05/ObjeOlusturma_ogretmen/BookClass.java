package practice_basic_day05.ObjeOlusturma_ogretmen;

public class BookClass {

    String adi,   yazari;
    int yayinYili;

    public BookClass(String adi, String yazari, int yayinYili) {
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;

    }

    public BookClass(String adi, int yayinYili) {
        this.adi = adi;
        this.yayinYili = yayinYili;

    }

    public void display(){
        System.out.println("kitap adi : " + adi + "yazar : " + yazari  + "yayin yili : " + yayinYili);

    }

    public static void main(String[] args) {
        BookClass kitap1=new BookClass("harry potter","jk rowling",2002);
        BookClass kitap2=new BookClass("harry potter",2002);
        kitap1.display();
        kitap2.display();




    }
}
