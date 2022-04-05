package day18_nestedFoorLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan 2 tam sayi alip bu sayilari ve aralarinda ki tum tam sayilari yazdiran bir kod olusturn.
         */
    int input=40;
    int input2=60;
        for (int i = input; i <=input2 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");
        //while loop  ile yapimi
        int i=input;
        while (i<=input2){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println("");
        System.out.println(input);// 61 olur.baslangic degeri degismemesi icin baslangici i variable atayip
        // i degiskeni uzerinden devam ettik bu sekilde 40 sayisi degismemis oldu
        System.out.println(i);






    }

}
