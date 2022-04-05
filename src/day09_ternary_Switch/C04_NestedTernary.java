package day09_ternary_Switch;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        // verilen sayinin pozitif mi negatif mi oldugunu kontrol edip
        // 0 veya pozitif sayi ise tek veya cift
        // negatif sayi ise -100 den buyuk veya kucuk oldugunu belirleyen bir ternary yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz.");
        int sayi = scan.nextInt();

        if (sayi >= 0) {
            if (sayi%2==0){
                System.out.println("girdiginiz sayi pozitif ve cift");
            }else{
                System.out.println("girdiginiz sayi pozitif ve tek sayi");
            }

        } else if(sayi < 0){
            if (sayi<-100){
                System.out.println("sayi -100 den kucuk");
            }else {
                System.out.println("sayi-100 den buyuk");
            }

        }

    ;
        System.out.println("ternary ile cozum");
       String sonuc=sayi>=0 ? (sayi%2==0? "pozitif cift sayi" : "pozitif tek sayi") :
                                (sayi>-100? "-100den buyuk sayi" : "-100 den kucuk sayi");
        System.out.println(sonuc);





    }

}
