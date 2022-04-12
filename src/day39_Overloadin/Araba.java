package day39_Overloadin;

public class Araba {
    String hareket = "Arabalar teker ile hareket eder";
    String hiz = "Arabalar motr gucune gore hız yaparlar";
    String yakit = "Arabalar farkli yakitlar kullanabilir";
    String marka = "Arabalar uretildikleri markaya sahiptir";

    public void motor(){
        System.out.println("arabalar farkli markalarda motor kullanirlar");
    }

    public void yakitTuketimi(){
        System.out.println("arabalar motor gucu ve yakit turne gore yakit tuketirler");
    }



}
