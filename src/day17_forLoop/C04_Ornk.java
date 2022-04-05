package day17_forLoop;

public class C04_Ornk {
    public static void main(String[] args) {
        // verilen 2 harf ve aralarinda ki harfleri yazdiran bir kod yaziniz.
        char ilkHarf='m';
        char sonHarf='t';
        for (char i =ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i + " ");
        }
        //baslangic ve bitis sayilari arasinda artis miktari ile olusacak tum sayilari yazdirin.
        double baslangic=10;
        double bitis=20;
        double artis=0.2;
        for (double i =baslangic; i <bitis ; i+=artis) {
            System.out.print(i + " ");
        }




    }
}
