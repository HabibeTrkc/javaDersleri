package day18_nestedFoorLoop;

public class C05_NestedForLoopOrnk {
    public static void main(String[] args) {
        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F

        seklini yazdirin. 65=A nin ascii degeri
         */
        char input='F';
        for (char i ='A'; i <='F' ; i++) {
            for (char j  = 'A'; j<=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
