package pratikOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {
          /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
        List<Integer> fibanocci=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        fibanocci.add(0);
        fibanocci.add(1);
        int i=1;

       if (sayi<=1) System.out.println("daha buyuk bir sayi giriniz");
        else {
           while (fibanocci.get(i) < sayi) {
               fibanocci.add(fibanocci.get(i) + fibanocci.get(i - 1));
               i++;
           }

           if (fibanocci.get(fibanocci.size() - 1) > sayi) {
               fibanocci.remove(fibanocci.size()-1);
               System.out.println(fibanocci);
           }
       }













    }
}
