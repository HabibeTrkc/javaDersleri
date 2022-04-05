package day28_constructor;

public class MyConstructor {
    int x=5;
    MyConstructor(){
        System.out.println( "6. satir " + "-x"+x);
    }
    MyConstructor(int x){
        this();
        System.out.println("10. satir " + "-x" + x);
    }

    public static void main(String[] args) {
        System.out.println("14. satir");
        MyConstructor mc1=new MyConstructor(4);
        System.out.println("16.satir");
        MyConstructor mc2=new MyConstructor();
    }
}
