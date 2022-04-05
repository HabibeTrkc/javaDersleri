package pratikOrnekler;

import java.util.Arrays;
import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        // kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine();
        String kelime[]=cumle.split(" ");
        System.out.println(" kelime sayisi : " + kelime.length);
    }
}
