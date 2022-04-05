package day27_constructor;

public class Volvo {


    String marka="Volvo";
    String mensei="isvec";
    String model;
    boolean elektrik;
    int yil;
    String yakit;
    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrik=elk;
        yil=yl;
        yakit=ykt;
        maxHiz=maxHizAta();
        otomatikPilot=otomatikPilotSorgusu();
    }

    public int maxHizAta() {
        int maxHiz=0;
        if (elektrik){
           maxHiz=160;
        }else{
            maxHiz=240;
        }
        return maxHiz;
    }

    public boolean otomatikPilotSorgusu() {
        boolean sonuc=false;
        if (elektrik){
            sonuc=true;
        }
       return sonuc;
    }

    public String toString(){
        String arabaOzellikleri="model : " + model +
                                " yakit : "+ yakit  +
                                " max hiz: "+ maxHiz;

        return arabaOzellikleri;
    }
    public Volvo(){};
}
