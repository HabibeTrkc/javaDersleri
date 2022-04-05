package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin. eger kelime 3 harften kisa ise kelime cok kisa yazdirin.
        //eger kelime 3 4 veya 5 harfli ise harf sayisini ve kelimenin tersten yazilisini yazdirin.
        // eger 5 harften uzun ise kelime cok uzun yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz.");
        String kelime=scan.nextLine().toLowerCase();
        int harfsayisi=kelime.length();


        if(harfsayisi<3){
            System.out.println("kelime cok kisa");
        }else if (harfsayisi==3){
            ucharflitersten(kelime);
        }else if (harfsayisi==4){
            dortharflitersten(kelime);
        }else if (harfsayisi==5){
            besharflitersten(kelime);
        }else {
            System.out.println("kelime cok uzun");
        }
    }
    //1=method olusturmak icin methodun adini yazariz.
    //2=methoda giderken goturmem gerekn variable varsa methoda giderken goturmem lazim.
    //3=baska classlardan erisilmesini istiyorsan private public olarak degistir.
    //4: data tipine gore void kismini degistir.mesela string donus yapiliyotsa void i string olarak return et.
// 4. adim method calisinca sadece bir sey mi yazdiricak yoksa bize bir data mi dondurecek buna karar vermektir.
    private static void besharflitersten(String kelime) {

     String terskelime=kelime.substring(4)+
             kelime.substring(3,4)+
             kelime.substring(2,3)+
             kelime.substring(1,2)+
             kelime.substring(0,1);
        System.out.println("kelimenin tersi: " + terskelime);
    }

    private static void dortharflitersten(String kelime) {

      String terskelime=kelime.substring(3)+
              kelime.substring(2,3)+
              kelime.substring(1,2)+
              kelime.substring(0,1);
        System.out.println("kelimenin tersi: " + terskelime);
    }
    private static void ucharflitersten(String kelime) {
         String terskelime=kelime.substring(2)+
                 kelime.substring(1,2)+
                 kelime.substring(0,1);
        System.out.println("kelimenin tersi: " + terskelime);
    }







}
