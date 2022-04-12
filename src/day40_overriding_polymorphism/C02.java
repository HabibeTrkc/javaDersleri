package day40_overriding_polymorphism;

public class C02 extends C01 {

@Override
     public void method2(){
        System.out.println("child method2");

     }

    public static void main(String[] args) {
        C02 obj=new C02();

        obj.method1();
        obj.method2();

        C01 obj2=new C02();
        obj2.method1();
        obj2.method2();

        C01 obj3=new C01();
        obj3.method1();
        obj3.method2();

    }
}
