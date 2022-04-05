package interwievSorulari1;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        /*
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        boolean asal=false;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                asal=false;
                break;
            }else{
                asal=true;
            }
        }
        System.out.println((asal==true) ? "sayi asaldir" : "sayi asal degil");





    }
}
