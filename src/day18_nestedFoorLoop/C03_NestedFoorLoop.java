package day18_nestedFoorLoop;

public class C03_NestedFoorLoop {
    public static void main(String[] args) {
        // nestedforloop ya dikdortgen veya ucgen formatinda olabilir.
        //dikdortgen istedigimiz de iki lop icin de bagimsiz en point belirleriz.
        // ucgen sekli vermek icin inner lopun end pointini olarak outer degiskene bagli yapariz.


        // kullanicidan pozitif rakam girmesini isteyin ve girilen rakama gore asagida ki sekli yapin.
        //*
        //* *
        //* * *
        //* * * *
        int input=5;
        int input2=8; // bagimsiz en point satiri
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
