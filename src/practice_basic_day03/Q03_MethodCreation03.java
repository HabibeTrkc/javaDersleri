package practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cm sayisi giriniz.");// 1 cm = 0.01 metrre  1 metre=0.001km
       double cm= scan.nextDouble();
       double mtr=cm/100;
       double km=mtr/1000;
        System.out.println("girdiginiz sayi : " + cm +" /"+ mtr + " metre yapar " + km + " km yapar");



    }

}