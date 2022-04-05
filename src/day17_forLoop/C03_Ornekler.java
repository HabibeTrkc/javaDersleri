package day17_forLoop;

import javax.security.sasl.SaslClient;
import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_Ornekler {
    public static void main(String[] args) {
        // 1:) ekrana 10 kez "java guzeldir" yazdirin.
        // 2:) 10 ile 30 arasinda ki (10 ve 30 dahil ) sayilari aralarinda virgu olarak ayni satirda yazdirin.
        // 3:) 100 den baslayarak 50 ye (dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda yazdirin.
        // 4:) kullanicidan 100 den kucuk bir tam sati isteyin.1 den baslayarak girilen sayiya sayiya kadar
        // 3 un kati olan sayilari yazdirin.
        // 5:) kullanicidan 100 den kucuk bir tam sayi isteyin 1 den baslayarak girilen sayiya kadar 3 un
        // veya 5 in kati olan sayilari yazdirin.
        // 6:) interwiev sorusu; kullanicidan 100 den kucuk bir tam sayi isteyin
        // 1 den baslayarak girilen sayiya kadar tum tum sayilari yazdirin.ancak;
        // - sayi 3 un kati ise; sayi yerine " java" yazdirin.
        // - sayi 5 in kati ise sayi yerine "guzeldir" yazdirin.
        // - sayi hem 3 un hem 5 in kati ise sayi yerine "java guzeldir" yazdirin.


        System.out.println("soru 1");

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + "- java guzeldir");
        }
        System.out.println("soru 2");
        for (int i = 10; i <=29 ; i++) {
            System.out.print(i + ",");
        } System.out.println("30");

        System.out.println("soru 2 ikinci yol");
        int baslangic=10;
        int bitis=30;
        for (int i=baslangic; i<=bitis ;i++){
            if (i<bitis){
                System.out.print(i + ",");
            }else{
                System.out.println(i);
            }
        }
        System.out.println("soru 3");
        int basi=100;
        int son=50;
        for (int i =basi; i >=son ; i--) {
            if (i>son){
                System.out.print(i+ ",");
            }else {
                System.out.println(son);
            }
        }
        System.out.println("soru 4");
        Scanner scan=new Scanner(System.in);
        System.out.println("100 den kucuk bir tam sayi giriniz");
        int sayi=scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
           if (i%3==0)
               System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("soru 5");
        System.out.println("100 den kucuk bir tam sayi giriniz");
        int sy=scan.nextInt();
        for (int i = 1; i <= sy; i++) {
            if (i%3==0 && i%5==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println(" ");
        System.out.println("soru 6");
        System.out.println("100 den kucuk bir tam sayi giriniz");
        int s= scan.nextInt();
        for (int i =1; i < s; i++) {

            if (i%3==0 && i%5==0) {
                System.out.print(" java guzeldir");
            }else if(i%3==0){
                System.out.print(" java");
            }else if(i%5==0){
                System.out.print(" guzeldir");
            }else{
                System.out.print(i+ " ");
            }
        }
    }
}
