package day07_ifelsestatement;

public class C02_IfStatement {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        if (a<b  && b<100){
            System.out.println("isteginiz gerceklesicek.");
            System.out.println("sart gecerliyse body icinde ki tum kodlar calisir");
        }

        // bir if cumlesinin daha anlasilir olmasini istiyorsak { } icerisine yazmaliyiz.
        // {} icerisine yazmazsak da calisir. ancak ilk noktalivirgul gordugunde biter.

        if (a>0) System.out.println("suslu parantez olmazsa sadece bir satir calisir.");//ilk ; kadar alir.

            System.out.println("2. satirda calisti."+"bu cumle if den bagimsiz oldugu icin calisti.");
    }
}
