package practice_basic_day03;

import java.util.Scanner;

public class Q04_MethodCreation04 {
     /*
      * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
      * toplamini dondursun.
      *
      * Ornek
      * input : ade1r4d3
      * output : 8
      *
      * Ipucu:
      *     Character.isDigit()
      *     Integer.valueOf()
      */

     /*

  Bilgilendirme:

      String  para1 ="1900";
     String  para2 = "2500";
     System.out.println(para1 + para2); //19002500

     System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));

     int num1= 100;
     int num2 = 200;

     System.out.println(String.valueOf(num1)+String.valueOf(num2));

     */
     public static void main(String[] args) {
          String input = "hbb17brk35";

          rakamlarToplami(input);
          }

     public static void rakamlarToplami(String input){
         int toplam=0;
         char harf=' ';
         String str="";
          for (int i = 0; i <= input.length() - 1; i++) {
               harf=input.charAt(i);
               if (Character.isDigit(harf)) {
                    str="" + harf;
                    toplam+=Integer.valueOf(str);
               }
          }
          System.out.println("girilen string de ki rakamlarin toplami: " + toplam);



     }

    }







