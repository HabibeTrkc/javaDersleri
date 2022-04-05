package day27_constructor;

public class ToyotaRunner {
    public static void main(String[] args) {
        Toyota t1=new Toyota();
        System.out.println(t1.marka); // Toyota
        System.out.println(t1.model); // null
        System.out.println(t1.tekerAdedi); // 4
        t1.model="Corolla";
        t1.yakit="Benzin";
        t1.yil=2022;
        System.out.println("T1 model: " + t1.model+"\n"+"yakit: " + t1.yakit +"\n"+"yil: "+ t1.yil);
        t1.maxHiz();


        Toyota t2=new Toyota();
        System.out.println(t2.model);   // nul
        t2.model="Yaris";
        t2.yakit="Benzin";
        t2.yil=2022;
        System.out.println(t2.model);  // Corolla
        t2.renkTercihleri(); // sari siyah


    }
}
