package day16_MethodCreation;

public class C01_MethodileSifreKontrl {
    public static void main(String[] args) {
        //soru; kullanicidan sifre girmesini isyetin.
        //Asagida ki sartlari sagliyorsa "sifre basari ile tanimlandi" yazdirin.
        //Sartlari saglamazsa "islem basarisiz.lutfen yeni bir sifre girin " yazdirin.
        // -ilk harf buyuk harf olmali
        // -son harf kucuk harf olmali
        // -sifre bosluk icermemeli
        // - sifre uzunlugu en az 8 karakter olmali.
        // bu 4 kontrolu method ile yapin.



        String sifre="Adfg153hn";
        boolean ilkHarf=ilkHarfKontrolet(sifre);
        boolean sonHarf=sonHarfKontrolEtSifre(sifre);
        boolean boslukKontrol=boslukKontrolEt(sifre);
        boolean uzunlukKontrol=uzunlukKontrolEt(sifre);

        if (ilkHarf && sonHarf && boslukKontrol && uzunlukKontrol){
            System.out.println("sifre basari ile tanimlandi");
        }else {
            System.out.println("sifre basarisiz tekrar deneyin");
        }

    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonucu=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonucu=true;
        }else{
            System.out.println("uzunluk en az 8 karakter olmali");
        }
        return uzunlukKontrolSonucu;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=false;
        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        }else{
            System.out.println("sifreniz bosluk icermemeli");
        }
            return boslukKontrolSonuc;
    }

    private static boolean sonHarfKontrolEtSifre(String sifre) {
        boolean sonHarf=false;
        char sonHarfk=sifre.charAt(sifre.length()-1);

        if (sonHarfk >='a' && sonHarfk<='z'){
            sonHarf=true;
        }else{
            System.out.println("sifrenizin son harfi kucuk olmali");
        }
        return sonHarf;
    }

    private static boolean ilkHarfKontrolet(String sifre) {
   char ilkHarf=sifre.charAt(0);
   boolean ilkHarfSonuc=false;

   if (ilkHarf >='A' && ilkHarf <='Z'){
       ilkHarfSonuc=true;
   }else{
       System.out.println("sifrenizin ilk harfi buyuk harf olmali.");

   }
   return ilkHarfSonuc;

    }


}
