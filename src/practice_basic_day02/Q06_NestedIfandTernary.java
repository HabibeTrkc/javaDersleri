package practice_basic_day02;

import java.util.Scanner;

public class Q06_NestedIfandTernary {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen rakam giriniz");
        int rakam = scan.nextInt();
        String sonuc;
        sonuc = (rakam == 0) ? "sifir" : (rakam == 1) ? "bir" : (rakam == 2) ? "iki" :
                (rakam == 3) ? "uc" : (rakam == 4) ? "dort" : (rakam == 5) ? "bes" :
                        (rakam == 6) ? "alti" : (rakam == 7) ? "yedi" : (rakam == 8) ? "sekiz" : (rakam == 9) ? "dokuz" : "gecersiz";
        System.out.println(sonuc);

        System.out.println("2.yol");

        if (rakam == 0) {
            System.out.println("sifir");
        }else if (rakam == 1) {
                System.out.println("bir");
        }else if (rakam == 2) {
                System.out.println("iki");
        }else if (rakam == 3) {
                System.out.println("uc");
        }else if (rakam == 4) {
                System.out.println("dort");
            }else if (rakam == 5) {
                System.out.println("bes");
            }else if (rakam == 6) {
                System.out.println("alti");
            }else if (rakam == 7) {
            System.out.println("yedi");
        }else if (rakam == 8) {
                System.out.println("sekiz");
            }else if (rakam == 9) {
                System.out.println("dokuz");
            }else
            System.out.println("hatali giris yaptiniz");


        }
    }
