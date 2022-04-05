package day12_stringManipulation;

import java.util.Scanner;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        // kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumlede ki kullanimina bakarak asagidaki 3 cumleyi yazdirin.
        //girilen kelime cumle de kullanilmamis
        //girilen kelime cumle de 1 kere kullanilmis
        //girilen kelime cumle de 1 den fazla kullanilmis.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scan.nextLine();

        int ilkkullanim=cumle.indexOf(kelime); // cumle icerisinde kelimenin ilk hangi indexte oldugunu bulur.
        int sonkullanim=cumle.lastIndexOf(kelime); //lastindexof cumlenin sonundan aramaya baslar.


        if (ilkkullanim==-1){
            System.out.println("kullanilmamis");
        }else if (ilkkullanim==sonkullanim){
            System.out.println("1 defa kullanilmis" );
        }else
            System.out.println("1 den fazla kullanilmis");



        String str="eclipse";
        System.out.println(str.lastIndexOf("p",4));  // 4 den itibaren saymaya baslar








    }
}
