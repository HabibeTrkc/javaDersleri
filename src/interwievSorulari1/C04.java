package interwievSorulari1;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        // string olan pın kodunuzu kontrol eden bir kod yaziniz

        Scanner scan=new Scanner(System.in);
        String pın="said.12345";
        int girisHakki=4;


        System.out.println("*****Hosgeldiniz*******");
        while(true) {
            System.out.println("pin kodu giriniz");
            String girilenPın = scan.nextLine();
            if (girilenPın.equals(pın)) {
                System.out.println("basarili giris yaptiniz");
                break;
            } else {
                System.out.println("yanlis giris yaptiniz ");
                girisHakki--;
                System.out.println(girisHakki + " kalan giris hakkiniz");
            }
            if (girisHakki == 0) {
                System.out.println("giris hakkınız kalmadı kartınız bloke oldu");
                break;
            }
        }
    }
}
