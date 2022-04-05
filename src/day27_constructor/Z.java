package day27_constructor;

public class Z {
    String isim;
    String soyİsim;
    int numara;
    boolean gercekMi;


    public Z(String isim, String soyisim, int no, boolean grc) {
        isim=isim;
        soyisim=soyİsim;
        numara=no;
        gercekMi=grc;
    }

    public Z(String isim, String soyİsim, int numara) {
        this.isim=isim;
        this.soyİsim=soyİsim;
        this.numara=numara;
    }

    public String toString(){
        return("isim : " + isim + "soyisim : " + soyİsim + "numara : " + numara);
    }
}
