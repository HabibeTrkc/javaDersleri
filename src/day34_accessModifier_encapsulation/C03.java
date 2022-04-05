package day34_accessModifier_encapsulation;

public class C03 {
    // encapsule edecegimiz iki variable olsun.

    private int sayi;
    private String str;

    // get ile methodu getirir ama degistiremeyiz.
// Sadece ulasırız deger ataması yapamayız.
    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return"C03"+
                "sayi="+sayi +
            ", str='"+str;
}

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public void setStr(String str) {
        this.str = str;
    }
}


