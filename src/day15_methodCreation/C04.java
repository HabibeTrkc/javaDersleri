package day15_methodCreation;
//main method olmadan da bir class olusturulabilir ancak bu class calistirilmaz sadece depo gorevi gorur.
//baska classlardan kullanilacak method veya variableleri barindirir.(kaynak gorevi tasir)

public class C04 {
    // 1=method olusturmak icin methodun adini yazariz.
    //  2=methoda giderken goturmem gerekn variable varsa methoda giderken goturmem lazim.
    //  3= privateleri public yaparsak farkli farkli classlardan erisime acmis oluruz.

    public static void besharflitersten(String kelime) {

        String terskelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin tersi: " + terskelime);
    }

   public static void dortharflitersten(String kelime) {

        String terskelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin tersi: " + terskelime);
    }
    public static void ucharflitersten(String kelime) {
        String terskelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin tersi: " + terskelime);
    }

}
