package day39_Overloadin;

public class Toyota extends Araba {

    protected String hiz = "toyota araclar max 220 knm hiz yapar";
    protected String marka = "Toyota";
    protected String sirketMerkezi = "japonya";

    public void motor() {
        System.out.println("Toyota arabalar toyota markalarda motor kullanirlar");
    }

    public void garanti(){
        System.out.println("toyota araclar 10 yil garantilidir");
    }


}
