package day12_stringManipulation;

import java.util.Scanner;

public class C01_IndexOf {
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
        int ikincikullanim=cumle.indexOf(kelime,ilkkullanim+1);
        if (cumle.indexOf(kelime)==-1){
            System.out.println("girilen kelime cumle de hic kullanilmamis.");
        }else if (ikincikullanim==(-1)){
            System.out.println("girilen kelime cumle de bir defa kullanilmis");
        }else
            System.out.println("girilen kelime cumle de birden fazla kullanilmis");
}
}
