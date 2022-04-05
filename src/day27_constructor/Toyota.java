package day27_constructor;

public class Toyota {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;

    public void  maxHiz(){
        if (yakit.equalsIgnoreCase("Bnezin")){
            System.out.println("benzinli araclar max 240 km hiz yapar.");
        }else if (yakit.equalsIgnoreCase("dizel")){
            System.out.println("dizel araclar max 260 km hiz yapar.");
        }
    }
public void renkTercihleri(){
        if (model.equalsIgnoreCase("corola")){
            System.out.println("corolla renk secenekleri; kırmızı ve beyaz");
        }else if(model.equalsIgnoreCase("yaris"))
    {
        System.out.println("yaris icin renk secenekleri; sari ve siyah");
    }
    }
}
