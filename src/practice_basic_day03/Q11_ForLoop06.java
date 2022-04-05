package practice_basic_day03;

import java.util.Scanner;

public class Q11_ForLoop06 {
    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	(kullanicidan satir ve sutun sayisini alarak dikdortgen olusturn.)
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("satir ve sutun sayisi giriniz");
        int satir=scan.nextInt();
        int sutun=scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }


}
