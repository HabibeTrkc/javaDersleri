package day30_passByValue;

import interwievSorulari1.C01;

public class C01_StaticBlocks {

    static{  // class calismaya baslamadan yapmanız gerekn atamalar varsa onların atamasını yapar.
             // main methoddan omce calisir.
        System.out.println("satatic blok calisti");
    }

    static { // static blok 1 den fazla olursa bloklar yukardan asagı sırayla calısır
        System.out.println("satatic blok 2 calisti ");
    }
    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();



    }
}
