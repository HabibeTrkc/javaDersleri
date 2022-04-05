package practice_basic_day02;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Locale;
import java.util.Scanner;

public class Q04_SwitchCase02 {
        /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */
        public static void main(String[] args) {

                Scanner scan=new Scanner(System.in);
                System.out.println("ilk 3 buyuk harfden birini giriniz");
                String harf=scan.next().toUpperCase();

                switch (harf){
                        case "A":
                                System.out.println("java is easy");
                                break;
                        case "B":
                                System.out.println("java is fun");
                                break;
                        case "C":
                                System.out.println("I need to study");
                                break;
                        default:
                                System.out.println("hatali giris yaptiniz.");
                }






        }
}
