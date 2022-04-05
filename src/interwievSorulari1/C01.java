package interwievSorulari1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz.");
        String kelime=scan.nextLine();
        String klm[]=kelime.split("");
        Arrays.sort(klm);
        int sayac=0;
        for (int i = 1; i <klm.length ; i++){
            if (klm[i-1].equals(klm[i])){
                sayac++;
            }else {
                System.out.println(klm[i-1]+ "="+ (sayac+1));
                sayac=0;
            }
            if (i==klm.length-1){
                System.out.println(klm[i]+ " =" + (sayac+1));
            }
        }


        System.out.println("2. yol ile yapimi");
        System.out.println("bir kelime giriniz");
        String str=scan.nextLine();
        char c=' ';
        int count=0;
        String[] array = new String[str.length()];
        array = str.split("");
        for (c = 'a'; c <= 'z'; c++) {
            count = 0;
            for (int i = 0; i < array.length; i++) {
                if (c == array[i].charAt(0)) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(c + " ==== " + count);
            }
        }
        System.out.println("3. yol ile yapimi");
        String arr[]=scan.nextLine().split("");








    }
}
