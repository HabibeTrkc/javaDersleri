package practice_basic_day02;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas>=18){
            System.out.println("oy kullanmaya ugun");
            if (yas<50){
                System.out.println("bir kez oy kullanabilir.");
            }else if (yas<70){
                System.out.println("iki kez oy kullanabilir.");
            }else if (yas>=70){
                System.out.println("uc kez oy kullanabilir.");
            }
        }else
            System.out.println("hatali giris yaptiniz");



    }
}


