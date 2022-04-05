package day12_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {
        // kullanicidan e mail adresini girmesini isteyin
        //mail @gmail.com icermiyorsa lutfen gmail adresi giriniz,
        // @gmail.com ile bitiyorsa email adresiniz kaydedildi
        //@gmail.com ile bitmiyorsa lutfen yazimi kontrol edip yazdirin

        String mail="trkchbb@gmail.com";
        String aranankelime="@gmail.com";

        if (!mail.contains(aranankelime)){
            System.out.println("lutfen gmail hesabi giriniz.");
        }else if (mail.endsWith(aranankelime)){
            System.out.println("mail hesabi kaydedildi.");
        }else
            System.out.println("lutfen yazimi kontrol edip tekrar girin.");

    }
}
