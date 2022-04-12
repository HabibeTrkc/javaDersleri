package day39_Overloadin;

public class OverlidingChild extends OverridingParen {

    public static void method1() {
        System.out.println("child class method1");
    }

    public static void main(String[] args) {
        OverlidingChild obj1 = new OverlidingChild();
        obj1.method1();
        obj1.method2();

        OverridingParen obj2=new OverlidingChild();
        obj2.method2();  // parent class method
        obj2.method1(); // child class method


    }
}
